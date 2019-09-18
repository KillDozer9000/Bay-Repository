package spaceInvaders;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import datastorage.DataStorage;
import processing.core.PApplet;
import processing.core.PImage;

public class Runner extends PApplet 
{
	Enemy e1;
	Ship s1;
	DataStorage ds;
	PImage gameover;
	PImage space;
	PImage title;
	PImage explosion;
	double clicks = 0;
	int enemnum = 7;
	int barnum = 2;
	int xchange = 0;
	int startx = 50;
	int starty = 50;
	double score = 0;
	int c = 0;
	int screen = 1;
	int sporigdelay = 5000;
	int spawndelay = 5000;
	int shorigdelay = 0;
	int shootdelay = 0;
	float distance = 0;
	boolean shoot  = true;
	boolean spawn = false;
	ArrayList <Barrier> b = new ArrayList <Barrier>();
	ArrayList <Enemy> enemys = new ArrayList <Enemy>();
	ArrayList <Projectile> p = new ArrayList <Projectile>();
	ArrayList <Power> pow = new ArrayList <Power>();
	
	
	public static void main (String[] args)
	{
		PApplet.main("spaceInvaders.Runner");
	}
	public void setup()
	{
		
		for(int i = 0; i < enemnum; i++)
		{
			startx += 60;
			enemys.add(new Enemy(this, startx));
		}
		for(int i = 0; i < barnum; i++)
		{
			xchange = 500/(barnum+1);

			for(int j = 1; j <= barnum; j++)
			{
				b.add(new Barrier(this, (xchange*j)));
			}
		}
		s1 = new Ship(this);
		
		gameover = loadImage("images/newgameover.jpg");
		gameover.resize(500, 500);
		title = loadImage("images/title.jpg");
		title.resize(500, 500);
		explosion = loadImage("images/SIexplosion.png");
		ds = new DataStorage("documents/highscore.txt");
		keyCode = SHIFT;
	}
	public void settings()
	{
		size(500, 500);
	}
	public void draw()
	{
		if(screen == 1)//TITLE SCREEN
		{
			imageMode(CORNER);
			textAlign(CENTER);
			image(title, 0,0,500,500);
			textSize(30);
			fill(62,238,9);
			text("Press any key to play", 250, 400);
			score += 0;
			if(keyCode != SHIFT)
				screen = 2;
		}
		
		if(screen == 2)//GAME SCREEN
		{
			imageMode(CENTER);
			background(0,0,0);
			
			textAlign(RIGHT);
			textSize(15);
			fill(255,255,255);
			text("Press shift to pause", 490, 20);
			
			textAlign(LEFT);
			text("Score: "+ score, 10, 20);
			
			
			s1.drawship();
			enemcollision();
			barrcollision();
			if(finalcollision())
				screen = 3;

			//for(int i =0; i<pow.size(); i++)
				//pow.get(i).drawpower();
				
			for(int i = 0; i< b.size(); i++)
				b.get(i).drawbar();
	
			for(int i = 0; i< enemys.size(); i++)
			{
				enemys.get(i).moveenemy();
				enemys.get(i).drawenemy();
			}
			for(int i = 0; i < p.size(); i++)
			{
				p.get(i).updatepr();
				p.get(i).drawpr();
			}
	        if(millis() >= spawndelay)
	        {
	            spawn = true;
	            spawndelay = millis() + sporigdelay;
	            pow.add(new Power(this));
	            pow.get(pow.size()-1).randomize();
	        }
	        if(millis() >= shootdelay)
	        {
	            shoot = true;
	            shootdelay = millis() + shorigdelay;
	        }
			if(spawn)
			{
				enemys.add(new Enemy(this, 300));
				enemys.add(new Enemy(this, 250));
				enemys.add(new Enemy(this, 200));
				enemys.add(new Enemy(this, 150));
				enemys.add(new Enemy(this, 100));
				enemys.add(new Enemy(this, 50));
				spawn = false;
			}
				
			if(keyCode == SHIFT)
				screen = 1;

		}
		if(screen == 3)//END SCREEN
		{
			imageMode(CORNER);
			image(gameover, 0,0,500,500);
			
			textAlign(CENTER);
			textSize(30);
			fill(162,28,120);
			double accuracy = ((score/500)/clicks)*10000;
			accuracy = round((float) accuracy);
			accuracy/=100;
			text("Score: "+score, 250, 450);
			text("Accuracy: "+accuracy+"%", 250, 100);
			
		}
	}
	
	public void mouseClicked()
	{
		if(screen != 3)
		{
			if(shoot)
			{
				p.add(new Projectile(this, (s1.getshipx()-3), (s1.getshipy()-20)));
				clicks++;
				shoot = false;
			}
		}
	}
	public void keyPressed()
	{
		if(key == 's')
		{
			int counter = 0;
			String strscore = ""+score;
			ds.addValue(strscore);
		
			try
			{
				ds.loadValues();
				ds.saveValues();
				for(String s : ds.getValues())
				{
					counter++;
	                println("Score "+counter+": "+s);
				}
			}
			catch(FileNotFoundException e)
			{
				println("file error");
			}
		}
	}
	public void enemcollision()
	{
		for(int i = 0; i < enemys.size(); i++)
		{
			for(int j = 0; j < p.size(); j++)
			{
				distance = dist(enemys.get(i).getenemx(),enemys.get(i).getenemy(), p.get(j).getprojx(), p.get(j).getprojy());
				if(distance < 25)
				{
					enemys.remove(i);
					p.remove(j);
					if(i >0)
						i--;
					if(j>0)
						j--;
					score += 500;
					c++;
					image(explosion, enemys.get(i).getenemx(),enemys.get(i).getenemy(),25,25);
				}
			}
		}
	}
	public void barrcollision()
	{
		for(int i = 0; i < b.size(); i++)
		{
			for(int j = 0; j < p.size(); j++)
			{
				distance = dist(b.get(i).getbarx(),400, p.get(j).getprojx(), p.get(j).getprojy());
				if(distance < 25)
				{
					p.remove(j);
					if(j > 0)
					j--;
				}
			}
		}
	}
	public boolean finalcollision()
	{
		for(int i = 0; i < b.size(); i++)
		{
			for(int j = 0; j < enemys.size(); j++)
			{
				distance = dist(b.get(i).getbarx(),400, enemys.get(j).getenemx(),enemys.get(j).getenemy());
				if(distance < 50)
				{
					b.remove(i);
					barnum--;
					
					if(barnum == 1)
						return true;					
					else
						return false;
						
				}
			}
		}
		return false;
	}
	public boolean powercollision()
	{
		for(int i = 0; i < p.size(); i++)
		{
			for(int j = 0; j < pow.size(); j++)
			{
				distance = dist(pow.get(j).getpowerx(),pow.get(j).getpowery(), p.get(i).getprojx(), p.get(i).getprojy());
				if(distance < 50)
				{
					pow.remove(j);
					for(int k = 0; i< enemys.size(); i++)
						enemys.remove(k);

						
				}
			}
		}
		return false;
	}
}

