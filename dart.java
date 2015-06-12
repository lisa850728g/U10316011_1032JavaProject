import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class dart extends JFrame{

	int times = 0;
	int score;
	int hitX;
	int hitY;
	double distance;
	
	Graphics g = null;
	int xCircle = 100;
	int yCircle = 130;
	int width = 150;
	int height = 150;
	int red, green, blue;
	Color color;
	JLabel hitPoint = new JLabel(picture);
	ImageIcon picture = new ImageIcon("catHit.jpg");
	
	public void paint(Graphics g){
		hitPoint.setBounds(hitX,hitY,10,10);
		add(hitPoint);
		
		red = (int)(Math.random()*200);
		green = (int)(Math.random()*200);
		blue = (int)(Math.random()*200);
		color = new Color(red , green , blue);
		g.setColor(color);
		g.drawOval(130,130,250,250);
		
		red = (int)(Math.random()*200);
		green = (int)(Math.random()*200);
		blue = (int)(Math.random()*200);
		color = new Color(red , green , blue);
		g.setColor(color);
		g.drawOval(165,165,180,180);
		
		red = (int)(Math.random()*200);
		green = (int)(Math.random()*200);
		blue = (int)(Math.random()*200);
		color = new Color(red , green , blue);
		g.setColor(color);
		g.drawOval(203,203,105,105);
		
		red = (int)(Math.random()*200);
		green = (int)(Math.random()*200);
		blue = (int)(Math.random()*200);
		color = new Color(red , green , blue);
		g.setColor(color);
		g.drawOval(230,230,50,50);
		
		red = (int)(Math.random()*200);
		green = (int)(Math.random()*200);
		blue = (int)(Math.random()*200);
		color = new Color(red , green , blue);
		g.setColor(color);
		g.fillOval(247,247,15,15);
		
		
		
	}
		
	dart(){
		setLayout(null);
		getGraphics();
		
	
	}
		
	public static void main(String[] args){
		JFrame frame = new dart();
		frame.setTitle("Play Dart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800,200,500,450);
		frame.setVisible(true);
	}
}
