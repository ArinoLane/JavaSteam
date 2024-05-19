package Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;
import java.awt.Cursor;
import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;
import Classes.*;

public class adminf extends JFrame implements  ActionListener
{   
    ImageIcon icon,img;
    JLabel insert,deletef,nameLabel;
    JLabel imglabel;
    Color myColor,myColor1;
    JPanel upperPanel,mainPanel;
    Font myFont;
    JScrollPane scroll;
    JTable table;
    DefaultTableModel model;
    JButton Deletebtn,Insertbtn,logout;
    
    private String[] column = { "User Name", "Password", "Email" };
private String[] rows = new String[7];

String s1;
JFrame ad1;

public adminf(String s1){
	
    super("Admin Control");
    this.setSize(1024, 768);
    this.setLocation(250,40);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    ImageIcon icon = new ImageIcon("Images/icon.png");
    this.setIconImage(icon.getImage());
	
	this.s1 = s1;
	this.ad1 = ad1;
    
    myColor1 = new Color(74,85,255);
    myColor = new Color(34,62,90);
    myFont = new Font("Cambria", Font.PLAIN, 28);
    
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    mainPanel.setBackground(new Color(53,97,140));
    mainPanel.setPreferredSize(new Dimension(1024,7200));
    
    
    upperPanel=new JPanel();
    upperPanel.setLayout(null);
    upperPanel.setBackground(new Color(23,26,33));
    upperPanel.setBounds(0,0,1024,100);
    
    img=new ImageIcon("Images/logo_steam.png");
    imglabel=new JLabel(img);
    imglabel.setBounds(425,35,200,50);
    upperPanel.add(imglabel);
	
	Insertbtn=new JButton("Insert");
	Insertbtn.setBounds(700,230, 150, 40);
	Insertbtn.setForeground(new Color(250,250,250));
	Insertbtn.setBackground(new Color(23,26,33));
	Insertbtn.setFont(new Font("Arial", Font.PLAIN, 20));
	Insertbtn.setBorderPainted(false);
	Insertbtn.addActionListener(this);
	mainPanel.add(Insertbtn);
	
	Deletebtn=new JButton("Delete");
        Deletebtn.setBounds(700,360, 150, 40);
        Deletebtn.setForeground(new Color(250,250,250));
        Deletebtn.setBackground(new Color(23,26,33));
        Deletebtn.setFont(new Font("Arial", Font.PLAIN, 20));
        Deletebtn.setBorderPainted(false);
        Deletebtn.addActionListener(this); 
        mainPanel.add(Deletebtn);
		
		
		logout=new JButton("Log Out");
	logout.setBounds(700,550, 150, 40);
	logout.setForeground(new Color(250,250,250));
	logout.setBackground(new Color(23,26,33));
	logout.setFont(new Font("Arial", Font.PLAIN, 20));
	logout.setBorderPainted(false);
	logout.addActionListener(this);
	mainPanel.add(logout);
		
		insert=new JLabel("INSERT A NEW ACCOUNT");
		insert.setBounds(650, 150, 282, 30);
		insert.setForeground(new Color(250,250,250));
		insert.setBackground(new Color(53,97,140));
		insert.setFont(new Font("Arial",Font.PLAIN, 21));
		insert.setOpaque(true);
		mainPanel.add(insert);
		
		deletef=new JLabel("DELETE AN ACCOUNT");
		deletef.setBounds(665, 300, 282, 30);
		deletef.setForeground(new Color(250,250,250));
		deletef.setBackground(new Color(53,97,140));
		deletef.setFont(new Font("Arial",Font.PLAIN, 21));
		deletef.setOpaque(true);
		mainPanel.add(deletef);
		
		nameLabel = new JLabel("Admin Name: "+s1);
		nameLabel.setBounds(30, 550, 400, 100);
        nameLabel.setFont(new Font("Cascadia Code", Font.PLAIN, 30));
		nameLabel.setForeground(Color.WHITE);
		mainPanel.add(nameLabel);
    
    
    
    this.add(upperPanel);
    this.add(mainPanel);
    
    
    model = new DefaultTableModel();
    model.setColumnIdentifiers(column);

  
    try (BufferedReader br = new BufferedReader(new FileReader(".\\Datas\\userdata.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("    "); 
            model.addRow(data);
        }
    } catch (IOException e) {
        e.printStackTrace();
       
        JOptionPane.showMessageDialog(this, "Error reading data file: " + e.getMessage());
    }

    
    table = new JTable(model);
    table.setPreferredScrollableViewportSize(new Dimension(512, this.getHeight() / 2));
    table.setFillsViewportHeight(true);

    
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setBounds(0, 100, 512, this.getHeight() / 2); 

   
    mainPanel.add(scrollPane);

    
    this.validate();
    this.repaint();
}

public adminf(String s1,JFrame ad1)
{
    super("Admin Control");
    this.setSize(1024, 768);
    this.setLocation(250,40);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ImageIcon icon = new ImageIcon("Images/icon.png");
    this.setIconImage(icon.getImage());
	
	this.s1 = s1;
	this.ad1 = ad1;
    
    myColor1 = new Color(74,85,255);
    myColor = new Color(34,62,90);
    myFont = new Font("Cambria", Font.PLAIN, 28);
    
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    mainPanel.setBackground(new Color(53,97,140));
    mainPanel.setPreferredSize(new Dimension(1024,7200));
    
    
    upperPanel=new JPanel();
    upperPanel.setLayout(null);
    upperPanel.setBackground(new Color(23,26,33));
    upperPanel.setBounds(0,0,1024,100);
    
    img=new ImageIcon("Images/logo_steam.png");
    imglabel=new JLabel(img);
    imglabel.setBounds(425,35,200,50);
    upperPanel.add(imglabel);
	
	Insertbtn=new JButton("Insert");
	Insertbtn.setBounds(700,230, 150, 40);
	Insertbtn.setForeground(new Color(250,250,250));
	Insertbtn.setBackground(new Color(23,26,33));
	Insertbtn.setFont(new Font("Arial", Font.PLAIN, 20));
	Insertbtn.setBorderPainted(false);
	Insertbtn.addActionListener(this);
	mainPanel.add(Insertbtn);
	
	Deletebtn=new JButton("Delete");
        Deletebtn.setBounds(700,360, 150, 40);
        Deletebtn.setForeground(new Color(250,250,250));
        Deletebtn.setBackground(new Color(23,26,33));
        Deletebtn.setFont(new Font("Arial", Font.PLAIN, 20));
        Deletebtn.setBorderPainted(false);
        Deletebtn.addActionListener(this); 
        mainPanel.add(Deletebtn);
		
		
		logout=new JButton("Log Out");
	logout.setBounds(700,550, 150, 40);
	logout.setForeground(new Color(250,250,250));
	logout.setBackground(new Color(23,26,33));
	logout.setFont(new Font("Arial", Font.PLAIN, 20));
	logout.setBorderPainted(false);
	logout.addActionListener(this);
	mainPanel.add(logout);
		
		insert=new JLabel("INSERT A NEW ACCOUNT");
		insert.setBounds(650, 150, 282, 30);
		insert.setForeground(new Color(250,250,250));
		insert.setBackground(new Color(53,97,140));
		insert.setFont(new Font("Arial",Font.PLAIN, 21));
		insert.setOpaque(true);
		mainPanel.add(insert);
		
		deletef=new JLabel("DELETE AN ACCOUNT");
		deletef.setBounds(665, 300, 282, 30);
		deletef.setForeground(new Color(250,250,250));
		deletef.setBackground(new Color(53,97,140));
		deletef.setFont(new Font("Arial",Font.PLAIN, 21));
		deletef.setOpaque(true);
		mainPanel.add(deletef);
		
		nameLabel = new JLabel("Admin Name: "+s1);
		nameLabel.setBounds(30, 550, 400, 100);
        nameLabel.setFont(new Font("Cascadia Code", Font.PLAIN, 30));
		nameLabel.setForeground(Color.WHITE);
		mainPanel.add(nameLabel);
    
    
    
    this.add(upperPanel);
    this.add(mainPanel);
    
    
    model = new DefaultTableModel();
    model.setColumnIdentifiers(column);

    
    try (BufferedReader br = new BufferedReader(new FileReader(".\\Datas\\userdata.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split("    "); 
            model.addRow(data);
        }
    } catch (IOException e) {
        e.printStackTrace();
       
        JOptionPane.showMessageDialog(this, "Error reading data file: " + e.getMessage());
    }

    
    table = new JTable(model);
    table.setPreferredScrollableViewportSize(new Dimension(512, this.getHeight() / 2));
    table.setFillsViewportHeight(true);

    
    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setBounds(0, 100, 512, this.getHeight() / 2); 

    
    mainPanel.add(scrollPane);

   
    this.validate();
    this.repaint();
}


public void mouseClicked(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}

public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == Deletebtn){
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            
            String username = table.getValueAt(selectedRow, 0).toString();

           
            model.removeRow(selectedRow);

            
            try {
                File inputFile = new File(".\\Datas\\userdata.txt");
                File tempFile = new File(".\\Datas\\tempfile.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String currentLine;

                while((currentLine = reader.readLine()) != null) {
                   
                    String trimmedLine = currentLine.trim();
                    if(trimmedLine.startsWith(username)) continue;
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
                writer.close(); 
                reader.close(); 

               
                if (!inputFile.delete()) {
                    System.out.println("Could not delete file");
                    return;
                }

                
                if (!tempFile.renameTo(inputFile))
                    System.out.println("Could not rename file");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	else if(ae.getSource()==Insertbtn)
		{
			admincreate c1=new admincreate(s1,this);
			c1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==logout)
		{
			logIn l1 =new logIn();
			l1.setVisible(true);
			this.setVisible(false);
		}
}






}


	