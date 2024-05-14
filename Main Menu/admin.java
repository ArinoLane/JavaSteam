//package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import Classes.*;

public class admin extends JFrame implements MouseListener, ActionListener

{
	JPanel panel;
	Color mycolor;
	ImageIcon img,imgbackground;
	JLabel name,pass,imglabel,backgroundImglabel;
	JTextField namef;
	JPasswordField passf,rpassf;
	JButton loginbtn,backbtn;
	public admin()
	{
		super("Admin Login");
		this.setSize(500,700);
		this.setLocation(550,100);
		
		mycolor=new Color(25,28,35);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		JLabel createIntext = new JLabel("LOG IN AS ADMIN");
		createIntext.setBounds(110,100,400,100);
		createIntext.setForeground(new Color(250,250,250));
		createIntext.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(createIntext);
		
		name=new JLabel("ADMIN NAME");
		name.setForeground(new Color(250,250,250));
		name.setOpaque(true);
		name.setBounds(100, 250, 284, 30);
		name.setForeground(new Color(27,151,255));
		name.setBackground(new Color(25,28,35));
		name.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(name);
		
		namef=new JTextField();
		namef.setBounds(100, 290, 282, 30);
		panel.add(namef);
		
		pass=new JLabel("ENTER PASSWORD");
		pass.setBounds(100, 370, 282, 30);
		pass.setForeground(new Color(27,151,255));
		pass.setBackground(new Color(25,28,35));
		pass.setFont(new Font("Arial",Font.PLAIN, 17));
		pass.setOpaque(true);
		panel.add(pass);
		
		passf=new JPasswordField();
		passf.setBounds(100, 410, 282, 30);
		passf.setEchoChar('•');
		panel.add(passf);
		
		loginbtn=new JButton("Log In");
		loginbtn.setBounds(130, 490, 100, 30);
		loginbtn.setFont(new Font("Arial", Font.PLAIN, 15));
		loginbtn.setForeground(new Color(250,250,250));
		loginbtn.setBackground(new Color(7, 187, 255));
		loginbtn.addMouseListener(this);
		loginbtn.addActionListener(this);
		panel.add(loginbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(260,490, 80, 30);
		backbtn.setForeground(new Color(250,250,250));
		backbtn.setBackground(new Color(7, 187, 255));
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		img=new ImageIcon("Images/logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(150,20,200,50);
		panel.add(imglabel);

		imgbackground = new ImageIcon ("Images/background.jpg");
		backgroundImglabel = new JLabel (imgbackground);
		backgroundImglabel.setBounds(0,0,500,700);
		panel.add(backgroundImglabel);
		
		
		this.add(panel);
	}
		
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1=namef.getText();
		String s2=passf.getText();
		
		adminacc ad=new adminacc(s1,s2);
		if(ae.getSource()==loginbtn)
		{
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"FILL UP EVERY REQUIREMENTS");
			}
			
			else if(ad.checkad(s1,s2))
			{
				
			JOptionPane.showMessageDialog(this,"HELLO BOSS");
			menu p1=new menu();
			p1.setVisible(true);
			this.setVisible(false);
			}
			else 
			{
				JOptionPane.showMessageDialog(this,"Incorrect");
			}
		}
	}
	
}
		
	