import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class menu extends JFrame
{
	JPanel panel, panel1;
	ImageIcon img;
	JLabel imglabel;
 
 
	public menu ()
	{
		super("STEAM");
		this.setSize(1024, 768);
		this.setLocation(250,40);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(20,20,20));
 
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(new Color(100,100,100));
		panel1.setBounds(0,0,1024,100);
 
		img=new ImageIcon("logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(40,35,200,50);
		panel1.add(imglabel);
 
 
		
		this.add(panel1);
		this.add(panel);
	}
}