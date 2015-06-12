import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class dart extends JFrame{
	
	JPanel indicate = new JPanel();
	JButton jbtHit = new JButton("Hit");
	JTextField jtfScore = new JTextField(8);
	JTextField jtfTimes = new JTextField(8);
	ImageIcon picture = new ImageIcon("catHit.jpg");
	JLabel hitPoint = new JLabel(picture);
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
		
		indicate.add(jbtHit);
		indicate.setBounds(180,370,150,40);
		add(indicate);
		
		JFrame frame1 = new JFrame();
		frame1.setTitle("計分表");
		frame1.add(new JLabel("Score: "));
		frame1.add(jtfScore);
		frame1.add(new JLabel("Times: "));
		frame1.add(jtfTimes);
		jtfScore.setText(String.format("%d",score));
		frame1.setLayout(new GridLayout(2,2));
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(200,80);
		frame1.setVisible(true);
		frame1.setLocationRelativeTo(null);

		jbtHit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				hitX = (int)(Math.random()*450);
				hitY = (int)(Math.random()*500);
				repaint();
				
				distance = Math.pow((Math.pow((hitX-(247 + 7.5/Math.pow(2,0.5))),2) + Math.pow((hitY-(247 + 7.5/Math.pow(2,0.5))),2)),0.5);
				
				times++;
				jtfTimes.setText(String.format("%d",times));
				
				if(times == 10){
					dispose();
					frame1.dispose();
					JFrame frame2 = new JFrame();
					frame2.setTitle("ENDING");
					frame2.add(new JLabel("Score: "));
					frame2.add(jtfScore);
					jtfScore.setText(String.format("%d",score));
					frame2.setLayout(new GridLayout(1,2));
					frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame2.setSize(250,80);
					frame2.setVisible(true);
					frame2.setLocationRelativeTo(null);
				}
				
				else if(distance <= 7.5){
					score += 60;
					jtfScore.setText(String.format("%d",score));
				}
				else if(distance > 7.5 && distance <= 25){
					score += 40;
					jtfScore.setText(String.format("%d",score));
				}
				else if(distance > 25 && distance <= 52.5){
					score += 20;
					jtfScore.setText(String.format("%d",score));
				}
				else if(distance > 52.5 && distance <= 90){
					score += 10;
					jtfScore.setText(String.format("%d",score));
				}
				else if(distance > 90 && distance <= 125){
					score += 5;
					jtfScore.setText(String.format("%d",score));
				}
				else{
					score += 0;
					jtfScore.setText(String.format("%d",score));
				}
			}
		});
		
		
	}
		
	public static void main(String[] args){
		JFrame frame = new dart();
		frame.setTitle("Play Dart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800,200,500,450);
		frame.setVisible(true);
	}
}
