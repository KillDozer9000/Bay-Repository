package Game;

import java.util.Scanner;

import processing.core.PApplet;

public class Game extends PApplet
{
	
	int xwind = 1100;
	int ywind = 1000;
	
	int charrad = 25;
	int enemrad = 25;
	int coinrad = 10;
	int powerrad = 20;
	
	int enemx = 400;
	int enemy = 400;
	
	int charx = xwind/2; 
	int chary = ywind/2;
	
	float coinx = random(0, xwind);
	float coiny = random(0, ywind);
	
	float powerx = random(0, xwind);
	float powery = random(0, ywind);
	int ptimer = 0;
	
	int xspeed = 1;
	int yspeed = 1;
	
	int xdirect = 10;
	int ydirect = 10;
	
	int background = 100;
	
	int time = 0;
	int lives = 3;
	int coincount = 0;
	int total = 0;
	
	int charred = 152;
	int chargreen = 255;
	int charblue = 152;
	
	int timer = millis()/1000;
	
	public void setup()
	{
		noStroke();
		println("hi");
		
//		frameRate(30);
	}
	
	public static void main (String[] args)
	{
		PApplet.main("Game.Game");
	}
	
	public void settings()
	{
		size(xwind, ywind);
	}
	
	public void draw()
	{
		background(background);

		
		if(millis() <= 1000)
		{
			fill(152, 255, 152);
			textSize(100);
			text("GO!", 250, 300);
		}
		
		else if(lives > 0)
		{
			textSize(15);
			powerdetect();//spawns a powerup that makes the character and enemy smaller
			moveenemy();//bounce code for enemy
			character();//displays character
			livesntime();//code for lives and time
			controlchar();//code to control the character with the arrow keys
			coindetect();//spawns a coin that, if collected, adds points to score
			
		}
		else
			stop();//displays the game over screen
		
		controlchar();
		//System.out.print("Draw works \n");
		//start();
	}
	
	public void enemy()
	{		
		fill(30, 144, 255);
		ellipse(enemx, enemy, enemrad*2, enemrad*2);
	}
	
	public void moveenemy()
	{	
		enemx = enemx + (xspeed * xdirect);
		enemy = enemy + (yspeed * ydirect);
		
		if(enemx > xwind - enemrad || enemx < enemrad)//if ball hits left/right
		{
			if(enemx > 250)
				enemx-= enemrad;
			else
				enemx+= enemrad;
			enemrad++;
			charrad++;
			xdirect *= -1;
		}
			
		if(enemy > ywind - enemrad || enemy < enemrad)//if ball hits top/bottom
		{
			if(enemy > 250)
				enemy-= enemrad;
			else
				enemy+= enemrad;
			enemrad++;
			charrad++;
			ydirect *= -1;
		}
			
		enemy();
	}
	
	public void character()
	{
		fill(charred, chargreen, charblue);
		ellipse(charx,chary, charrad*2, charrad*2);
	}
	
	public void livesntime()
	{
		time = millis();
		time/=1000;
		text("You have: " + lives + " lives \n", 10, 15);
		text("You have: " + coincount + " coins \n", 10, 45);
		float distance = dist(enemx,enemy, charx, chary);
		
		if(distance <= (enemrad+charrad))
		{
			ydirect *= -1;
			xdirect *= -1;
			lives--;
			charred = 255;
			charblue = 0;
			charblue = 0;
			fill(220,20,60);
			text("You have: " + lives + " lives \n", 10, 15);
			fill(152, 255, 152);
			text("Time: " + time + "secs\n",10, 30);
		}
		
		else
		{
			charred = 152;
			chargreen = 255;
			charblue = 152;
			text("Time: " + time + "secs\n",10, 30);
		}
			
	}
	
	public void stop()
	{
		background(100);
		total = (coincount*1000)+(time*100);
		fill(152, 255, 152);
		textSize(60);
		text("Game over", 170, 300);
		textSize(30);
		text("You time was: " + time + " \n", 200, 350);
		text("You got: " + coincount + " coins \n", 200, 400);
		textSize(40);
		text("Your final score was: " + total + "\n", 100, 450);
	}
	
	public void controlchar()
	{
			if(keyCode == UP && chary > charrad)
			{
				chary-=40;
				keyCode = ALT;
			}
			
			else if(keyCode == DOWN && chary < ywind-charrad)
			{
				chary+=40;
				keyCode = ALT;
			}
			
			else if(keyCode == LEFT && charx > charrad)
			{
				charx-=40;
				keyCode = ALT;
			}
			
			else if(keyCode == RIGHT && charx < xwind-charrad)
			{
				charx+=40;
				keyCode = ALT;
			}
		
	}
	
	public void coindetect()
	{
		if(coinx-coinrad < charx+charrad && charx-charrad < coinx+coinrad)
		{
			coin();
			if(coiny-coinrad < chary+charrad && chary-charrad < coiny+coinrad)
			{
				coincount++;
				charrad+=2;
				coinx = random(0, xwind);
				coiny = random(0, ywind);
				coin();
			}
		}
		
		else
			coin();
	}
	
	public void coin()
	{
		fill(255, 215, 0);
		ellipse(coinx, coiny, coinrad*2, coinrad*2);
	}

	public void powerdetect()
	{
		ptimer = millis();
		float pdistance = dist(powerx, powery, charx, chary);
		if(ptimer >= 5000 && charrad >=15 && enemrad >= 15)
		{
			power();
			if(pdistance <= (powerrad + charrad))
			{
				charrad-=10;
				enemrad-=10;
				ptimer = 0;
				powerx = random(0, xwind);
				powery = random(0, ywind);
				power();
			}
		}
	}

	public void power()
	{
		fill(186, 85, 211);
		ellipse(powerx, powery, powerrad, powerrad);
	}
}




