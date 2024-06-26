package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class create extends JFrame implements MouseListener, ActionListener
{
	JPanel panel;
	Color mycolor;
	ImageIcon icon,img,imgbackground;
	JLabel name,pass,email,rpass,imglabel,createIntext,backgroundImglabel;
	JTextField namef,emailf;
	JPasswordField passf,rpassf;
	JButton createupbtn,backbtn;
	JCheckBox s1;
	public create()
	{
		super("Create Account");
		this.setSize(500,700);
		this.setLocation(550,100);
		ImageIcon icon = new ImageIcon("Images/icon.png");
		this.setIconImage(icon.getImage());
		
		mycolor=new Color(25,28,35);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		JLabel createIntext = new JLabel("CREATE NEW ACCOUNT");
		createIntext.setBounds(70,100,400,100);
		createIntext.setForeground(new Color(250,250,250));
		createIntext.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(createIntext);
		
		name=new JLabel("Create A Steam Account Name");
		name.setForeground(new Color(250,250,250));
		name.setBounds(100, 210, 284, 30);
		name.setForeground(new Color(27,151,255));
		name.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(name);
		
		namef=new JTextField();
		namef.setBounds(100, 250, 282, 30);
		panel.add(namef);
		
		
		email=new JLabel("Enter Your Email Address");
		email.setForeground(new Color(250,250,250));
		email.setBounds(100, 290, 284, 30);
		email.setForeground(new Color(27,151,255));
		email.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(email);
		
		emailf=new JTextField();
		emailf.setBounds(100, 330, 282, 30);
		panel.add(emailf);
		
		pass=new JLabel("Choose A Password");
		pass.setBounds(100, 370, 282, 30);
		pass.setForeground(new Color(27,151,255));
		pass.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(pass);
		
		passf=new JPasswordField();
		passf.setBounds(100, 410, 282, 30);
		passf.setEchoChar('•');
		panel.add(passf);
		
		rpass=new JLabel("Re-Enter The Password");
		rpass.setBounds(100, 450, 282, 30);
		rpass.setForeground(new Color(27,151,255));
		rpass.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(rpass);
		
		rpassf=new JPasswordField();
		rpassf.setBounds(100, 490, 282, 30);
		rpassf.setEchoChar('•');
		panel.add(rpassf);
		
		createupbtn=new JButton("Create");
		createupbtn.setBounds(110, 580, 100, 30);
		createupbtn.setFont(new Font("Arial", Font.PLAIN, 15));
		createupbtn.setForeground(new Color(250,250,250));
		createupbtn.setBackground(new Color(7, 187, 255));
		createupbtn.addMouseListener(this);
		createupbtn.addActionListener(this);
		panel.add(createupbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(270, 580, 80, 30);
		backbtn.setForeground(new Color(250,250,250));
		backbtn.setBackground(new Color(7, 187, 255));
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		img=new ImageIcon("Images/logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(150,20,200,50);
		panel.add(imglabel);
		
		s1 = new JCheckBox("I agree to the terms and privacy policy of Steam");
		s1.setForeground(new Color(27,151,255));
		s1.setOpaque(false);
		s1.setBounds(100, 540, 500, 20);
		panel.add(s1);

		imgbackground = new ImageIcon ("Images/background.gif");
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
		String s3=emailf.getText();
		String s2=passf.getText();
		String s4=rpassf.getText();
		

		 if(ae.getSource()==createupbtn)
		 
		{
			if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"FILL UP EVERY REQUIREMENTS");
			}
			else{
				menu m1 = new menu(s1,s3,this); //name and mail passing

				useracc ac=new useracc(s1,s2,s3);
				ac.adduseracc();
				
			JOptionPane.showMessageDialog(this,"SUCCESSFULLY CREATED AN ACCOUNT");
			logIn l1=new logIn();
			l1.setVisible(true);
			this.setVisible(false);
			
			}
		}
		else if(ae.getSource()==backbtn)
		{
			logIn l1=new logIn();
			l1.setVisible(true);
			this.setVisible(false);
		}
	}
	
}