package Story;

import processing.core.PApplet;
import processing.core.PImage;

public class Story extends PApplet
{
	PImage planet;
	PImage ship;
	PImage fireship;
	PImage fire;
	PImage space;
	PImage sideship;
	PImage astroid;
	PImage explosion;
	int shipy = 0;
	int shipx = 0;
	int firey = 0;
	int astx1 = 0;
	double asty1 = 0;
	int astx2 = 0;
	double asty2 = 0;
	double astdelay = 0;
	boolean scene2 = false;
	int meters = 0;

	public static void main(String[] args)
	{
		PApplet.main("Story.Story");
	}

	public void settings()
	{
		size(1000, 500);
	}

	public void draw()
	{
			if(shipy <= -500)
				scene2 = true;

			if(scene2 && meters<=3000)
				scene2();
			else if(scene2 && meters > 3000)
				goodend();
			else
				scene1();

		
	}

	public void setup()
	{
		planet = loadImage("planet.jpg");
		ship = loadImage("ship.png");
		fireship = loadImage("shipwfire.png");
		fire = loadImage("fire.png");
		space = loadImage("space.png");
		sideship = loadImage("sideship.PNG");
		astroid = loadImage("astroid.jpg");
		explosion = loadImage("explosion.png");
	}

	public void scene1()
	{
		image(planet, 0, 0, 1000, 500);
		fill(132, 174, 172);
		textSize(25);
		text("This planet sucks, lets go somewhere else", 220, 480);

		text("Press UP to lift off", 370, 450);

		if (keyCode == UP)
		{
			shipy -= 20;
			firey += 15;
			image(fire, 451, 390 + shipy, 50, 75 + firey);
			image(ship, 450, 350 + shipy, 50, 75);
			keyCode = ALT;
		} else if (shipy <= 0)
		{
			image(ship, 450, 350 + shipy, 50, 75);
			shipy += 5;
			firey = 20;
		} else
		{
			image(ship, 450, 350, 50, 75);
			firey = 0;
		}
	}

	public void scene2()
	{
		imageMode(CENTER);
		image(space, 500, 250, 1000, 500);
		//for(int counter = 0; counter <= 10; counter++)
		text("Dodge the astroids!", 500, 250);

		astroid1();
		astroid2();
		collision();

	}
	public void moveship()
	{
		shipx = mouseX;
		shipy = mouseY;
		if(shipx <= 50)
			shipx = 50;
		else if(shipx>=940)
			shipx = 940;
		if(shipy <= 25)
			shipy = 25;
		else if(shipy >= 460)
			shipy = 460;
		image(sideship, shipx, shipy, 90, 45);
	}
	
	public void astroid1()
	{
		imageMode(CENTER);
		if(astx1 <= -50)
		{
			astx1 = 1050;
			asty1 = Math.random()*500;
			//astdelay = Math.random()*5000;//Need to fix
			delay((int)astdelay);
			if(asty1 <= 50)
				asty1 = 50;
			else if(asty1 >= 450)
				asty1 = 450;
			
		}
		else
			astx1-=20;
		image(astroid, astx1, (int)asty1, 100, 100);
	}
	public void astroid2()
	{
		imageMode(CENTER);
		if(astx2 <= -50)
		{
			astx2 = 1050;
			asty2 = Math.random()*500;
			//astdelay = Math.random()*5000;//Need to fix
			delay((int)astdelay);
			if(asty2 <= 50)
				asty2 = 50;
			else if(asty2 >= 450)
				asty2 = 450;
			
		}
		else
			astx2-=30;
		image(astroid, astx2, (int)asty2, 100, 100);
	}
	public void collision()
	{
		float distance1 = dist(astx1,(float)asty1, shipx, shipy);
		float distance2 = dist(astx2,(float)asty2, shipx, shipy);
		if(distance1 <= 100)
		{
			image(explosion, shipx, shipy, 50, 50);
			text("Oh no! Back to the Begining!", 80, 470);
			meters = 0;
			//badend();
		}
		else if(distance2 <= 100)
		{
			image(explosion, shipx, shipy, 50, 50);
			text("Oh no! Back to the Begining!", 80, 470);
			meters = 0;
			//badend();
		}
		else
		{
			moveship();
			meters+=3;
		}
		int left = 3000-meters;
		text("Meters left in astroid feild: "+left, 20, 470);
	}
	public void goodend()
	{
		imageMode(CENTER);
		image(space, 500, 250, 1000, 500);
		textSize(25);
		text("You got past the astroids! Good luck in space!", 200, 250);
	}
	public void badend()
	{
		imageMode(CENTER);
		image(space, 500, 250, 1000, 500);
		textSize(25);
		text("You got just crashed! To restart press UP", 200, 250);
		if(keyCode == UP)
			scene2();
	}
}
