package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Classes.*;

public class profile extends JFrame implements ActionListener 
{   
    ImageIcon img;
	JLabel nameLabel,emailLabel,levelLabel;
	JButton store,userLabel,LogOutbtn;
	JLabel imglabel;
    Color myColor,myColor1;
    JPanel panel,panel1,panel2,mainPanel, upperPanel;
	Font myFont;

	//codes for name and mail passing
    String s1;
    String s3;
    menu m1;
	
public profile(String s1, String s3, menu m1)
{
        super("My First GUI");
		this.setSize(1024, 768);
		this.setLocation(250,40);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.s1 = s1; //username
        this.s3 = s3; //user email
        this.m1 = m1; //from menu class

		mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(25,28,35));
        mainPanel.setBounds(0,0,1024,7200);
 
        upperPanel=new JPanel();
        upperPanel.setLayout(null);
        upperPanel.setBackground(new Color(53,97,140));
        upperPanel.setBounds(0,0,1024,100);


        img=new ImageIcon("Images/logo_steam.png");
        imglabel=new JLabel(img);
        imglabel.setBounds(200,23,230,50);
        upperPanel.add(imglabel);
		


        store = new JButton("STORE");
        store.setBounds(400,35,100,30);
        store.setFont(new Font("Bahnschrift", Font.BOLD, 15));
        store.setBackground(Color.GREEN);
        store.setOpaque(false);
        store.setForeground(new Color(177,179,182));
		store.setBackground(new Color(23,26,33));
        store.setBorderPainted(false);
        store.setContentAreaFilled(false);
        store.addActionListener(this);
        upperPanel.add(store);

        userLabel = new JButton(s1.toUpperCase());
        userLabel.setBounds(480,35,150,30);
        userLabel.setFont(new Font("Bahnschrift", Font.BOLD, 15));
        userLabel.setBackground(Color.GREEN);
        userLabel.setOpaque(false);
        userLabel.setForeground(new Color(177,179,182));
        userLabel.setContentAreaFilled(false);
        userLabel.setBorderPainted(false);
        upperPanel.add(userLabel);


        mainPanel.add(upperPanel); 		
		
		
		LogOutbtn = new JButton("Log Out");
		LogOutbtn.setBounds(350, 600, 400, 50);
		LogOutbtn.setForeground(new Color(250,250,250));
		LogOutbtn.setBackground(new Color(7, 187, 255));
		LogOutbtn.addActionListener(this);
		mainPanel.add(LogOutbtn);
		
		nameLabel = new JLabel("Name: "+ s1);
		nameLabel.setBounds(150, 160, 400, 100);
        nameLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		nameLabel.setForeground(new Color(27,151,255));
		mainPanel.add(nameLabel);
		
		emailLabel = new JLabel("Email: "+s3);
		emailLabel.setBounds(150, 290, 400, 70);
	    emailLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		emailLabel.setForeground(new Color(27,151,255));
		mainPanel.add(emailLabel);
		

		this.add(mainPanel);

	}

	public void actionPerformed(ActionEvent ae)
	{
	if (ae.getSource()==store)
        {
            menu m1 = new menu(s1,s3,this);
            m1.setVisible(true);
            this.setVisible(false);
        }
		
		else if (ae.getSource()==LogOutbtn)
{
    logIn l1 = new logIn();
    l1.setVisible(true);
    this.setVisible(false);

    
}

	
	
}
}
