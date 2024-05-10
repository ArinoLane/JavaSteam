import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame extends JFrame
{
	ImageIcon img;
	JLabel userLabel,namelabel, passLabel,imglabel,emailabel,populabel ;
	JTextField namefield,userTF,emailTF ;
	JPasswordField passPF;
	JButton InsertBtn, BackBtn,DELETEBtn;

	
	JPanel panel;
	Color myColor;
	Font myFont;

	public frame()
	{
		super("My First GUI");
		this.setSize(1024,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(900,100);
		
		myColor = new Color(25, 28, 35);
		myFont = new Font("Cambria", Font.PLAIN, 28);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		populabel = new JLabel ("THIS WEEK SPECIAL");
		populabel.setBounds(1400,100,550,30);
		populabel.setForeground(new Color(255,255,255));
		populabel.setFont(new Font("Cascadia Code", Font.BOLD, 40));
		panel.add(populabel);
		
		namelabel = new JLabel ("CHANGE NAME");
		namelabel.setBounds(200,180,300,30);
		namelabel.setForeground(new Color(27,151,255));
		namelabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(namelabel);
		
		emailabel = new JLabel ("CHANGE EMAIL");
		emailabel.setBounds(200,100,300,30);
		emailabel.setForeground(new Color(27,151,255));
		emailabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(emailabel);
		
		
	    passLabel = new JLabel ("CHANGE PASSWORD");
		passLabel.setForeground(new Color(27,151,255));
		passLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		passLabel.setBounds(200,260,350,30);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(550,260,295,30);
		passPF.setBackground(new Color(232,240,254));
		passPF.setEchoChar('•');
		panel.add(passPF);
		
		
		namefield = new JTextField("");
		namefield.setBounds(550,180,295,30);
		namefield.setBackground(new Color(232,240,254));
		panel.add(namefield);
		
		emailTF = new JPasswordField();
		emailTF.setBounds(550,100,295,30);
		emailTF.setBackground(new Color(232,240,254));
		panel.add(emailTF);
		
		InsertBtn = new JButton("SAVE CHANGES");
		InsertBtn.setBounds(400, 450, 195, 70);
		InsertBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		InsertBtn.setBackground(new Color(7, 187, 255));
		InsertBtn.setOpaque(true);
		panel.add(InsertBtn);
		
		DELETEBtn = new JButton("delete ACCOUNT");
		DELETEBtn.setBounds(800, 650, 195, 30);
		DELETEBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		DELETEBtn.setBackground(new Color(7, 187, 255));
		DELETEBtn.setOpaque(true);
		panel.add(DELETEBtn);
		
		img=new ImageIcon("logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(50,20,200,50);
		panel.add(imglabel);
		
		img=new ImageIcon("vampire.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(1404,200,400,150);
		panel.add(imglabel);
		
		img=new ImageIcon("warframe2.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(1404,400,400,150);
		panel.add(imglabel);
		
		img=new ImageIcon("blacksquad.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(1404,600,400,150);
		panel.add(imglabel);
		
		
		
		this.add(panel);
	}
	
}