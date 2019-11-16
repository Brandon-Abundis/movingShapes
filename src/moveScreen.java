import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

	//I followed a tutorial for this from a Youtube video a while back, and don't remember the name of the creator.
	//But I did add more shapes because I could...
public class moveScreen extends JPanel implements ActionListener
{
	Timer t =  new Timer(5, this);// sets up the time
	double x = 0, y = 0, velX = 4, velY = 4;// just the start positions and value of velocity of the shapes
	double a = 400, b = 0, velA = 3, velB = 3;
	double c = 0, d = 300, velC = 2, velD = 2;
	double e = 100, f = 0, velE = 5, celF = 5;
	
	public void paintComponent(Graphics g) //just making the shapes
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D display = new Ellipse2D.Double(x, y, 30, 30);
		g2.fill(display);
		g2.draw(new Rectangle2D.Double(a, b, 90, 20));
		g2.draw(new RoundRectangle2D.Double(c, d, 70, 50, 30, 30));
		t.start();
		
		
	}
	public void actionPerformed(ActionEvent e) //this updates the velocity value with the time on the x and y axis each loop
	{                                          //or like a stair case on the pixel level
		if (x < 0 || x > 550)
		{
			velX = -velX;
		}
		if (y < 0 || y > 340)
		{
			velY = -velY;
		}
			
		x += velX;
		y += velY;
		repaint();// i don't know what this does, but its very important for some reason
		////////////////////////////////
		if (a < 0 || a > 550)
		{
			velA = -velA;
		}
		if (b < 0 || b > 340)
		{
			velB = -velB;
		}
			
		a += velA;
		b += velB;
		//////////////////////////////////
		if (c < 0 || c > 550)
		{
			velC = -velC;
		}
		if (d < 0 || d > 340)
		{
			velD = -velD;
		}
			
		c += velC;
		d += velD;
		repaint();
	}
}
	
