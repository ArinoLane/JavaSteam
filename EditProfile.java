import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditProfile extends JFrame implements  MouseListener, ActionListener 
{
	ImageIcon img;
	JLabel userLabel,namelabel, passLabel,imglabel,emailabel,populabel ;
	JTextField namefield,userTF,emailTF ;
	JPasswordField passPF;
	JButton InsertBtn, BackBtn,DELETEBtn,backbtn;

	
	JPanel panel,upperPanel;
	Color myColor;
	Font myFont;

	public EditProfile()
	{
		super("EDIT PROFILE");
		this.setSize(1024, 768);
        this.setLocation(250,40);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		myColor = new Color(25, 28, 35);
		myFont = new Font("Cambria", Font.PLAIN, 28);
		
		panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(25,28,35));
        panel.setPreferredSize(new Dimension(1024,4250));
		
		upperPanel=new JPanel();
        upperPanel.setLayout(null);
        upperPanel.setBackground(new Color(53,97,140));
        upperPanel.setBounds(0,0,1024,100);
		
		 panel.add(upperPanel);
		
		/*populabel = new JLabel ("THIS WEEK SPECIAL");
		populabel.setBounds(1400,100,550,30);
		populabel.setForeground(new Color(255,255,255));
		populabel.setFont(new Font("Cascadia Code", Font.BOLD, 40));
		panel.add(populabel);*/
		
		namelabel = new JLabel ("CHANGE NAME");
		namelabel.setBounds(200,200,300,30);
		namelabel.setForeground(new Color(27,151,255));
		namelabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(namelabel);
		
		emailabel = new JLabel ("CHANGE EMAIL");
		emailabel.setBounds(200,260,300,30);
		emailabel.setForeground(new Color(27,151,255));
		emailabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(emailabel);
		
		
	    passLabel = new JLabel ("CHANGE PASSWORD");
		passLabel.setForeground(new Color(27,151,255));
		passLabel.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		passLabel.setBounds(200,320,350,30);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(550,320,295,30);
		passPF.setBackground(new Color(232,240,254));
		passPF.setEchoChar('•');
		panel.add(passPF);
		
		
		namefield = new JTextField("");
		namefield.setBounds(550,200,295,30);
		namefield.setBackground(new Color(232,240,254));
		panel.add(namefield);
		
		emailTF = new JPasswordField();
		emailTF.setBounds(550,260,295,30);
		emailTF.setBackground(new Color(232,240,254));
		panel.add(emailTF);
		
		InsertBtn = new JButton("SAVE CHANGES");
		InsertBtn.setBounds(300, 450, 160, 30);
		InsertBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		InsertBtn.setForeground(new Color(250,250,250));
		InsertBtn.setBackground(new Color(7, 187, 255));
		InsertBtn.setOpaque(true);
		InsertBtn.addActionListener(this);
		panel.add(InsertBtn);
		
		backbtn=new JButton("BACK");
		backbtn.setBounds(600,450, 80, 30);
		backbtn.setForeground(new Color(250,250,250));
		backbtn.setBackground(new Color(7, 187, 255));
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		DELETEBtn = new JButton("DELETE ACCOUNT");
		DELETEBtn.setBounds(800, 650, 195, 30);
		DELETEBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		DELETEBtn.setForeground(new Color(250,250,250));
		DELETEBtn.setBackground(new Color(7, 187, 255));
		DELETEBtn.setOpaque(true);
		DELETEBtn.addActionListener(this);
		panel.add(DELETEBtn);
		
		img=new ImageIcon("logo_steam.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(425,20,200,50);
		upperPanel.add(imglabel);
		
		
		
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s1=namefield.getText();
		String s2=passPF.getText();
		String s3=emailTF.getText();
		
		useracc ad=new useracc();
		
		if(ae.getSource()==InsertBtn)
		{
			if(s1.isEmpty()&&s2.isEmpty()&&s3.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"FILL UP EVERY REQUIREMENTS");
			}
			else if(!s1.isEmpty()||!s2.isEmpty()||!s3.isEmpty()){
				
				JOptionPane.showMessageDialog(this,"DETAILS CHANGED");
			    logIn p1=new logIn();
			p1.setVisible(true);
			this.setVisible(false);
			
			
				 }
				

			//
			/*RegisterFrame p1=new RegisterFrame();
			p1.setVisible(true);
			this.setVisible(false);
			}*/
		
	
		else if(ae.getSource()==backbtn)
		{
			menu m1=new menu();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		
					
				
			
		}
	}
	
		}
	
