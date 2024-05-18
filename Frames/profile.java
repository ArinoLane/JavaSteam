package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import Classes.*;


public class profile extends JFrame implements ActionListener 
{   
    ImageIcon icon,img,imgbackground;
	JLabel backgroundImglabel, nameLabel,emailLabel,levelLabel;
	JButton store,userLabel,editProfilebtn,editEmailbtn,logOutbtn;
	JLabel imglabel;
    Color myColor,myColor1;
    JPanel panel,panel1,panel2,mainPanel, upperPanel,libraryPanel;
	Font myFont;

	
	File file;
    FileWriter fwrite;
    
    Scanner sc;

	//codes for name and mail passing
    String s1UserName;
    String s2UserPass;
    String s3UserEmail;
    JFrame m1;
	
public profile(String s1UserName, String s2UserPass, String s3UserEmail, JFrame m1)
{
        super("User Details");
		this.setSize(1024, 768);
		this.setLocation(250,40);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Images/icon.png");
        this.setIconImage(icon.getImage());

        this.s1UserName = s1UserName; //user Name
        this.s2UserPass = s2UserPass; //user Pass
        this.s3UserEmail = s3UserEmail; //user Email
        this.m1 = m1; //from menu class


		mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color (23,26,33));
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
        store.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        store.setBackground(Color.GREEN);
        store.setOpaque(false);
        store.setForeground(new Color(228,230,231));
        store.setBorderPainted(false);
        store.setContentAreaFilled(false);
        store.addActionListener(this);
        upperPanel.add(store);

        userLabel = new JButton(s1UserName.toUpperCase());
        userLabel.setBounds(480,35,150,30);
        userLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        userLabel.setOpaque(false);
        userLabel.setForeground(new Color(228,230,231));
        userLabel.setContentAreaFilled(false);
        userLabel.setBorderPainted(false);
        upperPanel.add(userLabel);

        logOutbtn = new JButton("LOG OUT");
        logOutbtn.setBounds(680,35,150,30);
        logOutbtn.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        logOutbtn.setOpaque(false);
        logOutbtn.setForeground(new Color(253,0,6));
        logOutbtn.setContentAreaFilled(false);
        logOutbtn.addActionListener(this);
        logOutbtn.setBorderPainted(false);
        upperPanel.add(logOutbtn); 

        


        mainPanel.add(upperPanel); 


		
		editProfilebtn = new JButton("EDIT USERNAME");
		editProfilebtn.setBounds(50, 600, 250, 50);
		editProfilebtn.setForeground(new Color(250,250,250));
		editProfilebtn.setBackground(new Color(7, 187, 255));
        editProfilebtn.setFont(new Font("Arial", Font.BOLD, 18));
		editProfilebtn.addActionListener(this);
		mainPanel.add(editProfilebtn);
		
		editEmailbtn = new JButton("EDIT EMAIL");
        editEmailbtn.setBounds(50, 670, 250, 50);
        editEmailbtn.setForeground(new Color(250,250,250));
        editEmailbtn.setBackground(new Color(7, 187, 255));
        editEmailbtn.setFont(new Font("Arial", Font.BOLD, 18));
        editEmailbtn.addActionListener(this);
        mainPanel.add(editEmailbtn);
		
		nameLabel = new JLabel("Name: "+ s1UserName);
		nameLabel.setBounds(50, 160, 250, 30);
        nameLabel.setBackground(new Color(7, 187, 255));
        nameLabel.setOpaque(true);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        nameLabel.setForeground(Color.WHITE);
		mainPanel.add(nameLabel);
		
		emailLabel = new JLabel("Email: "+s3UserEmail);
		emailLabel.setBounds(50, 290, 250, 30);
        emailLabel.setBackground(new Color(7, 187, 255));
        emailLabel.setOpaque(true);
	    emailLabel.setFont(new Font("Arial", Font.BOLD, 18));
        emailLabel.setForeground(Color.WHITE);
		mainPanel.add(emailLabel);
		
		JLabel libraryName = new JLabel("LIBRARY:");
		libraryName.setBounds(550, 120, 90, 20);
        libraryName.setBackground(new Color(7, 187, 255));
        libraryName.setOpaque(true);
		libraryName.setFont(new Font("Arial", Font.BOLD, 18));
		libraryName.setForeground(new Color(255,255,255));
		mainPanel.add(libraryName);
		
		
		libraryPanel = new JPanel();
        libraryPanel.setLayout(new BoxLayout(libraryPanel, BoxLayout.Y_AXIS));
        libraryPanel.setBackground(new Color(48,54,69));
        libraryPanel.setBounds(550, 160, 330, 400);
        mainPanel.add(libraryPanel);

        refreshLibrary();

        imgbackground = new ImageIcon ("Images/back3.gif");
        backgroundImglabel = new JLabel (imgbackground);
        backgroundImglabel.setBounds(0,0,1024, 768);
        mainPanel.add(backgroundImglabel);      

		this.add(mainPanel);

	}

	public void actionPerformed(ActionEvent ae)
	{
	if (ae.getSource()==store)
        {
            menu m1 = new menu(s1UserName,s2UserPass,s3UserEmail,this);
            m1.setVisible(true);
            this.setVisible(false);
        }
		
		else if (ae.getSource()==editProfilebtn)
        {
            String newUsername = JOptionPane.showInputDialog("Enter new username:");
            if (newUsername.length() > 0) {
                editUsername(newUsername);

            }
        }
		 else if (ae.getSource()==editEmailbtn)
        {
            String newEmail = JOptionPane.showInputDialog("Enter new email:");
            if (newEmail.length() > 0) {
                editEmail(newEmail.trim());
            }
        }
                else if (ae.getSource()==logOutbtn)
        {
            logIn l1=new logIn();
            l1.setVisible(true);
            this.setVisible(false);
        }
    }

    private void editUsername(String newUsername) {
    File file = new File(".\\Datas\\userdata.txt");
        StringBuilder fileContent = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] userData = line.split("    ");
                if (userData[0].equals(s1UserName)) { // if the username matches
                userData[0] = newUsername; // replace the username
            }

                fileContent.append(String.join("    ", userData)).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fwrite = new FileWriter(file)) {
            fwrite.write(fileContent.toString());
            fwrite.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    // Update the username in the current session
    s1UserName = newUsername;
    nameLabel.setText("Name: " + s1UserName);
}
private void editEmail(String newEmail) {
        File file = new File(".\\Datas\\userdata.txt");
        StringBuilder fileContent = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] userData = line.split("    ");
                if (userData[0].equals(s1UserName)) { // if the username matches
                    userData[2] = newEmail; // replace the email
                }
                fileContent.append(String.join("    ", userData)).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (FileWriter fwrite = new FileWriter(file)) {
            fwrite.write(fileContent.toString());
            fwrite.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Update the email in the current session
        s3UserEmail = newEmail;
        emailLabel.setText("Email: " + s3UserEmail);
    }
	private void refreshLibrary() {
        libraryPanel.removeAll(); // Remove all existing labels

        File file = new File(".\\Datas\\library_" + s2UserPass + ".txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String gameName = scanner.nextLine();
                JLabel gameLabel = new JLabel(gameName);
                gameLabel.setForeground(Color.WHITE);
                gameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
                libraryPanel.add(gameLabel);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        libraryPanel.revalidate();
        libraryPanel.repaint();
    }


	
	
}