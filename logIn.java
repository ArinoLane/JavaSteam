import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class logIn extends JFrame implements MouseListener, ActionListener
{
	JPanel panel,panelContributors;
	JLabel namelabel, passlabel, imglabel, adminp, ContributorsImglabel, backgroundImglabel;
	JTextField namefield;
	JPasswordField passfield;
	JButton signBut,CreatAccnount,adminbtn,Contributors;
	JButton signupbtn, backbtn;
	ImageIcon img,imgContributors,imgbackground;
	JScrollPane scrollPane;
	

	public logIn()
	{
		super("LOG IN");
		
		this.setSize(500,700);
		this.setLocation(550,100);
		//this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel ();
		panel.setLayout(null);
		panel.setBackground(new Color(25,28,35));
		panel.setBounds(0,0,500,500);



		JLabel signIntext = new JLabel("SIGN IN");
		signIntext.setBounds(180,50,150,100);
		signIntext.setForeground(new Color(250,250,250));
		signIntext.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(signIntext);



		JLabel creatNew = new JLabel("New to Steam?");
		creatNew.setBounds(190,490,120,30);
		creatNew.setForeground(new Color(250,250,250));
		creatNew.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(creatNew);
		
		JLabel adminp = new JLabel("Log As Admin");
		adminp.setBounds(190,420,120,30);
		adminp.setForeground(new Color(250,250,250));
		adminp.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(adminp);

		namelabel = new JLabel ("SIGN IN WITH ACCOUNT NAME");
		namelabel.setBounds(140,180,195,30);
		namelabel.setForeground(new Color(27,151,255));
		panel.add(namelabel);
		
		namefield = new JTextField();
		namefield.setBounds(140,205,195,30);
		namefield.setBackground(new Color(232,240,254));
		panel.add(namefield);
		
		adminbtn = new JButton("Log In");
		adminbtn.setBounds(140, 450, 195, 30);
		adminbtn.setForeground(new Color(250,250,250));
		adminbtn.setFont(new Font("Arial", Font.PLAIN, 15));
		adminbtn.setBackground(new Color(7, 187, 255));
		adminbtn.addActionListener(this);
		adminbtn.setOpaque(true);
		panel.add(adminbtn);
		
		passlabel = new JLabel ("PASSWORD");
		passlabel.setForeground(new Color(27,151,255));
		passlabel.setBounds(140,260,195,30);
		panel.add(passlabel);
		
		passfield = new JPasswordField();
		passfield.setBounds(140,285,195,30);
		passfield.setBackground(new Color(232,240,254));
		passfield.setEchoChar('•');
		panel.add(passfield);
		
		JCheckBox box = new JCheckBox("REMEMBER ME");
		box.setBounds(140, 330, 105,20);
		box.setFont(new Font("Arial", Font.PLAIN, 10));
		panel.add(box);
		
		signBut = new JButton ("Sign up");
		signBut.setBounds(140, 350, 195, 30);
		signBut.setForeground(new Color(250,250,250));
		signBut.setFont(new Font("Arial", Font.PLAIN, 15));
		signBut.setBackground(new Color(7, 187, 255));
		signBut.setOpaque(true);
		signBut.addActionListener(this);
		panel.add(signBut);


		Contributors = new JButton ("Contributors!");
		Contributors.setBounds(140, 600, 195, 30);
		Contributors.setForeground(new Color(37,51,118));
		Contributors.setFont(new Font("Arial", Font.PLAIN, 15));
		Contributors.setBackground(new Color(7, 187, 255));
		Contributors.setOpaque(true);
		Contributors.addActionListener(this);
		panel.add(Contributors);

		
		CreatAccnount = new JButton ("Creat an account");
		CreatAccnount.setBounds(140, 525, 195, 30);
		CreatAccnount.setForeground(new Color(250,250,250));
		CreatAccnount.setFont(new Font("Arial", Font.PLAIN, 15));
		CreatAccnount.setBackground(new Color(7, 187, 255));
		CreatAccnount.addActionListener(this);
		panel.add(CreatAccnount);
		
		
		
		img=new ImageIcon("logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(150,20,200,50);
		panel.add(imglabel);

		imgbackground = new ImageIcon ("background.jpg");
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
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==CreatAccnount )
		{
			create c1 = new create ();
			c1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource()==adminbtn){
			
			admin a1 = new admin ();
			a1.setVisible(true);
		}
		else if (ae.getSource() == Contributors)
		{
			ContributorsFrame Con1 = new ContributorsFrame();
			Con1.setVisible(true);
		}
		// else if (ae.getSource()==signBut){
			
		// menu m1 = new menu ();
		// m1.setVisible(true);
		// }
	}
	
}
