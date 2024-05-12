import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MStore extends JFrame implements MouseListener, ActionListener

{
	JPanel panel;
	Color mycolor;
	ImageIcon img,img1;
	JLabel  createIntext ,amount,card,carddetails,cardnumber,imglabel,imglabel1,namecard;
	JTextField namef,money;
	JPasswordField numberf;
	JButton confirm,backbtn;
	JCheckBox s1;
	public MStore()
	{
		super("Steam Store");
		this.setSize(500,700);
		this.setLocation(550,100);
		
		mycolor=new Color(25,28,35);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		JLabel createIntext = new JLabel("ADD MONEY TO BUY GAMES");
		createIntext.setBounds(30,60,430,100);
		createIntext.setForeground(new Color(250,250,250));
		createIntext.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		panel.add(createIntext);
		
		amount=new JLabel("Enter Your Amount");
		amount.setForeground(new Color(250,250,250));
		amount.setOpaque(true);
		amount.setBounds(170, 190, 230, 30);
		amount.setForeground(new Color(27,151,255));
		amount.setBackground(new Color(25,28,35));
		amount.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(amount);
		
		money=new JTextField();
		money.setBounds(100, 230, 282, 30);
		panel.add(money);
		
		card=new JLabel("WE ACCEPT ONLY ");
		card.setBounds(40, 310, 170, 30);
		card.setForeground(new Color(27,151,255));
		card.setBackground(new Color(25,28,35));
		card.setFont(new Font("Arial",Font.PLAIN, 17));
		card.setOpaque(true);
		panel.add(card);
		
		img=new ImageIcon("visa.png");
		imglabel=new JLabel(img);
		imglabel.setBounds(170,270,200,100);
		panel.add(imglabel);
		
		img1=new ImageIcon("master card.png");
		imglabel1=new JLabel(img1);
		imglabel1.setBounds(280,270,200,100);
		panel.add(imglabel1);
		
		carddetails=new JLabel("CARD DETAILS");
		carddetails.setBounds(120, 365, 250, 30);
		carddetails.setForeground(new Color(250,250,250));
		carddetails.setBackground(new Color(25,28,35));
		carddetails.setFont(new Font("Cascadia Code", Font.BOLD, 30));
		carddetails.setOpaque(true);
		panel.add(carddetails);
		
		namecard=new JLabel("NAME ON CARD");
		namecard.setForeground(new Color(250,250,250));
		namecard.setOpaque(true);
		namecard.setBounds(40,440,150, 30);
		namecard.setForeground(new Color(27,151,255));
		namecard.setBackground(new Color(25,28,35));
		namecard.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(namecard);
		
		namef=new JTextField();
		namef.setBounds(190, 440, 190, 30);
		panel.add(namef);
		
		cardnumber=new JLabel("CARD NUMBER");
		cardnumber.setForeground(new Color(250,250,250));
		cardnumber.setOpaque(true);
		cardnumber.setBounds(40,510, 150, 30);
		cardnumber.setForeground(new Color(27,151,255));
		cardnumber.setBackground(new Color(25,28,35));
		cardnumber.setFont(new Font("Arial",Font.PLAIN, 17));
		panel.add(cardnumber);
		
		numberf=new JPasswordField();
		numberf.setBounds(190, 510, 190, 30);
		numberf.setEchoChar('•');
		panel.add(numberf);
		
		
		confirm=new JButton("CONFIRM PAYMENT");
		confirm.setBounds(50, 600,200, 30);
		confirm.setFont(new Font("Arial", Font.PLAIN, 15));
		confirm.setForeground(new Color(250,250,250));
		confirm.setBackground(new Color(7, 187, 255));
		confirm.addActionListener(this);
		panel.add(confirm);
		
		backbtn=new JButton("BACK");
		backbtn.setBounds(300,600, 80, 30);
		backbtn.setForeground(new Color(250,250,250));
		backbtn.setBackground(new Color(7, 187, 255));
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
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
		String s2=numberf.getText();
		String s3=money.getText();
		
		if(ae.getSource()==confirm)
		{
			if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"FILL UP EVERY REQUIREMENTS");
			}
			else{
			JOptionPane.showMessageDialog(this,"PAYMENT SUCCESSFULL");
			menu m1=new menu(); 
			m1.setVisible(true);
			this.setVisible(false);
			}
		}
		else if(ae.getSource()==backbtn)
		{
			menu m1=new menu();
			m1.setVisible(true);
			this.setVisible(false);
		}
	}
	}

