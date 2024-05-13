package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContributorsFrame extends JFrame
{
	JPanel panelContributors;
	JLabel ContributorsImglabel;
	ImageIcon imgContributors;
	
	JButton backbtn;
	

	public ContributorsFrame()
	{
		super("Contributors");
		this.setSize(500,670);
		this.setLocation(550,100);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		panelContributors = new JPanel();
		panelContributors.setLayout(null);
		panelContributors.setBackground(new Color(34,57,75));
		panelContributors.setBounds(0,0,500,700);
 
		imgContributors = new ImageIcon("Images/Contributors.png");
		ContributorsImglabel = new JLabel(imgContributors);
		ContributorsImglabel.setBounds(0,-30,500,700);
		panelContributors.add(ContributorsImglabel);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(160, 490, 80, 30);
		backbtn.setForeground(new Color(250,250,250));
		backbtn.setBackground(new Color(7, 187, 255));
		panelContributors.add(backbtn);


		this.add(panelContributors);

	}
}
