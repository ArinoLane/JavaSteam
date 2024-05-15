import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class project extends JFrame 
{   
    ImageIcon img;
	JLabel nameLabel,emailLabel,levelLabel;
	JButton StoreBtn,ARINOBtn,EditProfileBtn;
	JLabel imglabel;
    Color myColor,myColor1;
    JPanel panel,panel1,panel2;
	Font myFont;
	
		public project()
		{
        super("My First GUI");
		this.setSize(1024, 768);
		this.setLocation(250,40);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		myColor1 = new Color(74,85,255);
		myColor = new Color(34,62,90);
		myFont = new Font("Cambria", Font.PLAIN, 28);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(100,100,1024,100);
		
		
		panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(myColor1);
		panel1.setBounds(0,0,1024,100);
		
		this.add(panel1);
		this.add(panel);
		
		img=new ImageIcon("logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(40,35,200,50);
		panel1.add(imglabel);
		
		
		StoreBtn = new JButton("Store");
		StoreBtn.setBounds(300, 50, 80, 30);
		StoreBtn.setForeground(new Color(250,250,250));
		StoreBtn.setBackground(new Color(7, 187, 255));
		panel.add(StoreBtn);
		
	
		
		ARINOBtn = new JButton("ARINO");
		ARINOBtn.setBounds(400, 50, 80, 30);
		ARINOBtn.setForeground(new Color(250,250,250));
		ARINOBtn.setBackground(new Color(7, 187, 255));
		panel.add(ARINOBtn);
		
		
		
		EditProfileBtn = new JButton("Edit Profile");
		EditProfileBtn.setBounds(350, 600, 400, 50);
		EditProfileBtn.setBackground(Color.WHITE);
		//EditProfileBtn.addMouseListener(this);
		//EditProfileBtn.addActionListener(this);
		panel.add(EditProfileBtn);
		
		nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(150, 160, 400, 100);
        nameLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		nameLabel.setForeground(Color.WHITE);
		panel.add(nameLabel);
		
		emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(150, 290, 400, 70);
	    emailLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		emailLabel.setForeground(Color.WHITE);
		panel.add(emailLabel);
		
		levelLabel = new JLabel("Level: ");
		levelLabel.setBounds(150, 420, 400, 70);
		levelLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		levelLabel.setForeground(Color.WHITE);
		panel.add(levelLabel);


	}
	
	
}
