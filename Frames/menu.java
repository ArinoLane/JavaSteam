package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import Classes.*;

 
public class menu extends JFrame implements  MouseListener, ActionListener 
{
    JPanel MyProfilePanel,LibraryPanel;
    JPanel mainPanel, upperPanel, game0,game1,game2,game3,game4,game5,game6,game7,game8,game9,game10,game11,game12,game13,game14,game15,game16,game17,game18,game19,game20,game21,game22,game23,game24,game25,game26,game27,game28,game29,game30,game30_1, game31,game32,game33,game34,game35,game36,game37,game38,game39,game40,game41,game42,game43,game44,game45,game46,game47,game48,game49,game50,game51,game52,game53,game54;
    ImageIcon imgback, img,img000,img111,img222,img333,img444,img555,img666,img777,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,img30_1,img31,img32,img33,img34,img35,img36,img37,img38,img39,img40,img41,img42,img43,img44,img45,img46,img47,img48,img49,img50,img51,img52,img53,img54,imgs;
    JLabel imgbacklabel, imglabels,imglabel,imgLabe000,imgLabe111,imgLabe222,imgLabe333,imgLabe444,imgLabe555,imgLabe666,imgLabe777,imgLabel1,imgLabel2,imgLabel3,imgLabel4,imgLabel5,imgLabel6,imgLabel7,imgLabel8,imgLabel9,imgLabel10,imgLabel11,imgLabel12,imgLabel13,imgLabel14,imgLabel15,imgLabel16,imgLabel17,imgLabel18,imgLabel19,imgLabel20,imgLabel21,imgLabel22,imgLabel23,imgLabel24,imgLabel25,imgLabel26,imgLabel27,imgLabel28,imgLabel29,imgLabel30,imgLabel30_1,imgLabel31,imgLabel32,imgLabel33,imgLabel34,imgLabel35,imgLabel36,imgLabel37,imgLabel38,imgLabel39,imgLabel40,imgLabel41,imgLabel42,imgLabel43,imgLabel44,imgLabel45,imgLabel46,imgLabel47,imgLabel48,imgLabel49,imgLabel50,imgLabel51,imgLabel52,imgLabel53,imgLabel54;
    JScrollPane scrollPane;
    JButton userLabel,store,logOutbtn, left, right,storebtn;
    JButton buy0,buy1,buy2,buy3,buy4,buy5,buy6,buy7,buy8,buy9,buy10,buy11,buy12,buy13,buy14,buy15,buy16,buy17,buy18,buy19,buy20,buy21,buy22,buy23,buy24,buy25,buy26,buy27,buy28,buy29,buy30,buy31,buy32,buy33,buy34,buy35,buy36,buy37,buy38,buy39,buy40,buy41,buy42,buy43,buy44,buy45,buy46,buy47,buy48,buy49,buy50,buy51,buy52,buy53,buy54;
    JPanel game[] = new JPanel[8];

    File file;
    FileWriter fwrite;

    //codes for name and mail passing 
    JFrame l1;
    String s1;
    String s2;



    public menu ()  //default constractor
    { }


    public menu (String s1, String s2,JFrame l1) //parameter constructor 
    {        
        super("STEAM");
        this.setSize(1024, 768);
        this.setLocation(250,42);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        //name and email passing
        this.l1=l1;
        this.s1=s1; //Username
        this.s2=s2; //User email
		

 
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(53,97,140));
        scrollPane = new JScrollPane(mainPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0, 0, 1010, 750); //it controls the scroll
        mainPanel.setPreferredSize(new Dimension(1024,7200)); ///it controls the JPanel that is attached with scrollPane
 
        upperPanel=new JPanel();
        upperPanel.setLayout(null);
        upperPanel.setBackground(new Color(23,26,33));
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
        store.setForeground(new Color(177,179,182));
		store.setBackground(new Color(23,26,33));
        store.setBorderPainted(false);
        store.setContentAreaFilled(false);
        store.addActionListener(this);
        upperPanel.add(store);


        userLabel = new JButton(s1.toUpperCase());
        userLabel.setBounds(480,35,150,30);
        userLabel.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        userLabel.setBackground(Color.GREEN);
        userLabel.setOpaque(false);
        userLabel.setForeground(new Color(177,179,182));
        userLabel.setContentAreaFilled(false);
        userLabel.addActionListener(this);
        userLabel.setBorderPainted(false);
        upperPanel.add(userLabel);

        logOutbtn = new JButton("LOG OUT");
        logOutbtn.setBounds(680,35,150,30);
        logOutbtn.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        logOutbtn.setBackground(Color.GREEN);
        logOutbtn.setOpaque(false);
        logOutbtn.setForeground(new Color(251,187,197));
        logOutbtn.setContentAreaFilled(false);
        logOutbtn.addActionListener(this);
        logOutbtn.setBorderPainted(false);
        upperPanel.add(logOutbtn);        
	


        mainPanel.add(upperPanel);  //this.add jemon sobar last e add korte hoy temni ei panel er mdode jehetu sob dukbe, tai sob kisu dukanor por .add korbo {()}. anekta, ekta bag er modde sob jinis dukanor por cain off kora. Oi jinis gulo nijera add/chain off hobe than amar bag er chain off hobe sobar last e .




//images---------------------------------------------
game[0] = new JPanel();
game[0].setLayout(null);
game[0].setBackground(new Color(34,57,75));
game[0].setBounds(90,150,250,390);
game[0].setVisible(true);
mainPanel.add(game[0]);

game[1] = new JPanel();
game[1].setLayout(null);
game[1].setBackground(new Color(34,57,75));
game[1].setBounds(350,150,250,390);
game[1].setVisible(true);
mainPanel.add(game[1]);

game[2] = new JPanel();
game[2].setLayout(null);
game[2].setBackground(new Color(34,57,75));
game[2].setBounds(620,150,300,195);
game[2].setVisible(true);
mainPanel.add(game[2]);

game[3] = new JPanel();
game[3].setLayout(null);
game[3].setBackground(new Color(34,57,75));
game[3].setBounds(620,355,300,195);
game[3].setVisible(true);
mainPanel.add(game[3]);

game[4] = new JPanel();
game[4].setLayout(null);
game[4].setBackground(new Color(34,57,75));
game[4].setBounds(90,150,250,390);
game[4].setVisible(true);
mainPanel.add(game[4]);

game[5] = new JPanel();
game[5].setLayout(null);
game[5].setBackground(new Color(34,57,75));
game[5].setBounds(350,150,250,390);
game[5].setVisible(true);
mainPanel.add(game[5]);

game[6] = new JPanel();
game[6].setLayout(null);
game[6].setBackground(new Color(34,57,75));
game[6].setBounds(620,150,300,195);
game[6].setVisible(true);
mainPanel.add(game[6]);

game[7] = new JPanel();
game[7].setLayout(null);
game[7].setBackground(new Color(34,57,75));
game[7].setBounds(620,355,300,195);
game[7].setVisible(true);
mainPanel.add(game[7]);




//images---------------------------------------------

 


buy0 = new JButton("<");
buy0.setBounds(0,270,70,70);
buy0.addActionListener(this);
mainPanel.add(buy0);

buy1 = new JButton(">");
buy1.setBounds(930,270,70,70);
buy1.addActionListener(this);
mainPanel.add(buy1);

 

//images---------------------------------------------
img000 = new ImageIcon("Images/farCry3.png");
imgLabe000 = new JLabel(img000);
imgLabe000.setBounds(0,0, 250, 390);
game[0].add(imgLabe000);

img111 = new ImageIcon("Images/falloutThree.png");
imgLabe111 = new JLabel(img111);
imgLabe111.setBounds(0,0, 250, 390);
game[1].add(imgLabe111);

img222 = new ImageIcon("Images/heads.png");
imgLabe222 = new JLabel(img222);
imgLabe222.setBounds(0,0, 300,195);
game[2].add(imgLabe222);

img333 = new ImageIcon("Images/fcea24.png");
imgLabe333 = new JLabel(img333);
imgLabe333.setBounds(0,0, 300,195);
game[3].add(imgLabe333);

img444 = new ImageIcon("Images/DH.png");
imgLabe444 = new JLabel(img444);
imgLabe444.setBounds(0,0, 250, 390);
game[4].add(imgLabe444);

img555 = new ImageIcon("Images/dyingL.png");
imgLabe555 = new JLabel(img555);
imgLabe555.setBounds(0,0, 250, 390);
game[5].add(imgLabe555);

img666 = new ImageIcon("Images/acbflag.png");
imgLabe666 = new JLabel(img666);
imgLabe666.setBounds(0,0, 300,195);
game[6].add(imgLabe666);

img777 = new ImageIcon("Images/dh2.png");
imgLabe777 = new JLabel(img777);
imgLabe777.setBounds(0,0, 300,195);
game[7].add(imgLabe777);


//images---------------------------------------------

 
buy3 = new JButton();
buy3.setBounds(20,560,960,110);
buy3.setBackground(null);
buy3.setBorderPainted(false);
buy3.addActionListener(this);
mainPanel.add(buy3);
 
game3 = new JPanel();
game3.setLayout(null);
game3.setBackground(new Color(34,57,75));
game3.setBounds(50,0,990,110);
buy3.add(game3);
 
img3 = new ImageIcon("Images/ac2r.jpg");
imgLabel3 = new JLabel(img3);
imgLabel3.setBounds(-45,0, 340, 100);
game3.add(imgLabel3);
 
JLabel name3 = new JLabel ("Assassin's Creed Revelations");
name3.setBounds(350,42,380,23);
name3.setForeground(new Color(250,250,250));
name3.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game3.add(name3);

JLabel namep3 = new JLabel ("$30.99");
namep3.setBounds(820,42,300,23);
namep3.setForeground(new Color(250,250,250));
namep3.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game3.add(namep3);

//----------------------------------------------------------------------------------------------------
 
buy4 = new JButton();
buy4.setBounds(20,690,960,110);
buy4.setBackground(null);
buy4.setBorderPainted(false);
buy4.addActionListener(this);
mainPanel.add(buy4);
 
game4 = new JPanel();
game4.setLayout(null);
game4.setBackground(new Color(34,57,75));
game4.setBounds(50,0,990,110);
buy4.add(game4);
 
img4 = new ImageIcon("Images/ac3.jpg");
imgLabel4 = new JLabel(img4);
imgLabel4.setBounds(-45,0, 340, 100);
game4.add(imgLabel4);

JLabel name4 = new JLabel ("Assassin's Creed III: Liberation");
name4.setBounds(350,42,380,23);
name4.setForeground(new Color(250,250,250));
name4.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game4.add(name4);

JLabel namep4 = new JLabel ("$40.99");
namep4.setBounds(820,42,300,23);
namep4.setForeground(new Color(250,250,250));
namep4.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game4.add(namep4);
 
//----------------------------------------------------------------------------------------------------
 
buy5 = new JButton();
buy5.setBounds(20,820,960,110);
buy5.setBackground(null);
buy5.setBorderPainted(false);
buy5.addActionListener(this);
mainPanel.add(buy5);
 
game5 = new JPanel();
game5.setLayout(null);
game5.setBackground(new Color(34,57,75));
game5.setBounds(50,0,990,110);
buy5.add(game5);
 
img5 = new ImageIcon("Images/ac4.jpg");
imgLabel5 = new JLabel(img5);
imgLabel5.setBounds(-45,0, 340, 100);
game5.add(imgLabel5);

JLabel name5 = new JLabel ("Assassin's Creed IV: Black Flag");
name5.setBounds(350,42,380,23);
name5.setForeground(new Color(250,250,250));
name5.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game5.add(name5);

JLabel namep5 = new JLabel ("$35.99");
namep5.setBounds(820,42,300,23);
namep5.setForeground(new Color(250,250,250));
namep5.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game5.add(namep5);
 
//----------------------------------------------------------------------------------------------------
 
buy6 = new JButton();
buy6.setBounds(20,950,960,110);
buy6.setBackground(null);
buy6.setBorderPainted(false);
buy6.addActionListener(this);
mainPanel.add(buy6);
 
game6 = new JPanel();
game6.setLayout(null);
game6.setBackground(new Color(34,57,75));
game6.setBounds(50,0,990,110);
buy6.add(game6);
 
img6 = new ImageIcon("Images/aco.jpg");
imgLabel6 = new JLabel(img6);
imgLabel6.setBounds(-45,0, 340, 100);
game6.add(imgLabel6);

JLabel name6 = new JLabel ("Assassin's Creed Origins");
name6.setBounds(350,42,380,23);
name6.setForeground(new Color(250,250,250));
name6.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game6.add(name6);

JLabel namep6 = new JLabel ("$36.99");
namep6.setBounds(820,42,300,23);
namep6.setForeground(new Color(250,250,250));
namep6.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game6.add(namep6);
 
//----------------------------------------------------------------------------------------------------
 
buy7 = new JButton();
buy7.setBounds(20,1080,960,110);
buy7.setBackground(null);
buy7.setBorderPainted(false);
buy7.addActionListener(this);
mainPanel.add(buy7);
 
game7 = new JPanel();
game7.setLayout(null);
game7.setBackground(new Color(34,57,75));
game7.setBounds(50,0,990,110);
buy7.add(game7);
 
img7 = new ImageIcon("Images/acr.jpg");
imgLabel7 = new JLabel(img7);
imgLabel7.setBounds(-45,0, 340, 100);
game7.add(imgLabel7);

JLabel name7 = new JLabel ("Assassin's Creed Rogue");
name7.setBounds(350,42,380,23);
name7.setForeground(new Color(250,250,250));
name7.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game7.add(name7);

JLabel namep7 = new JLabel ("$37.99");
namep7.setBounds(820,42,300,23);
namep7.setForeground(new Color(250,250,250));
namep7.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game7.add(namep7);
 
//----------------------------------------------------------------------------------------------------
 
buy8 = new JButton();
buy8.setBounds(20,1210,960,110);
buy8.setBackground(null);
buy8.setBorderPainted(false);
buy8.addActionListener(this);
mainPanel.add(buy8);
 
game8 = new JPanel();
game8.setLayout(null);
game8.setBackground(new Color(34,57,75));
game8.setBounds(50,0,990,110);
buy8.add(game8);
 
img8 = new ImageIcon("Images/acu.jpg");
imgLabel8 = new JLabel(img8);
imgLabel8.setBounds(-45,0, 340, 100);
game8.add(imgLabel8);

JLabel name8 = new JLabel ("Assassin's Creed Unity");
name8.setBounds(350,42,380,23);
name8.setForeground(new Color(250,250,250));
name8.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game8.add(name8);

JLabel namep8 = new JLabel ("$38.99");
namep8.setBounds(820,42,300,23);
namep8.setForeground(new Color(250,250,250));
namep8.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game8.add(namep8);
 
//----------------------------------------------------------------------------------------------------
 
buy9 = new JButton();
buy9.setBounds(20,1340,960,110);
buy9.setBackground(null);
buy9.setBorderPainted(false);
buy9.addActionListener(this);
mainPanel.add(buy9);
 
game9 = new JPanel();
game9.setLayout(null);
game9.setBackground(new Color(34,57,75));
game9.setBounds(50,0,990,110);
buy9.add(game9);
 
img9 = new ImageIcon("Images/Apex_Legends.jpg");
imgLabel9 = new JLabel(img9);
imgLabel9.setBounds(-45,0, 340, 100);
game9.add(imgLabel9);

JLabel name9 = new JLabel ("Apex Legends");
name9.setBounds(350,42,380,23);
name9.setForeground(new Color(250,250,250));
name9.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game9.add(name9);

JLabel namep9 = new JLabel ("$39.99");
namep9.setBounds(820,42,300,23);
namep9.setForeground(new Color(250,250,250));
namep9.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game9.add(namep9);
 
//----------------------------------------------------------------------------------------------------
 
buy10 = new JButton();
buy10.setBounds(20,1470,960,110);
buy10.setBackground(null);
buy10.setBorderPainted(false);
buy10.addActionListener(this);
mainPanel.add(buy10);
 
game10 = new JPanel();
game10.setLayout(null);
game10.setBackground(new Color(34,57,75));
game10.setBounds(50,0,990,110);
buy10.add(game10);
 
img10 = new ImageIcon("Images/batmna.jpg");
imgLabel10 = new JLabel(img10);
imgLabel10.setBounds(-45,0, 340, 100);
game10.add(imgLabel10);

JLabel name10 = new JLabel ("Batman: Arkham Knight");
name10.setBounds(350,42,380,23);
name10.setForeground(new Color(250,250,250));
name10.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game10.add(name10);

JLabel namep10 = new JLabel ("$41.99");
namep10.setBounds(820,42,300,23);
namep10.setForeground(new Color(250,250,250));
namep10.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game10.add(namep10);
 
//----------------------------------------------------------------------------------------------------
 
buy11 = new JButton();
buy11.setBounds(20,1600,960,110);
buy11.setBackground(null);
buy11.setBorderPainted(false);
buy11.addActionListener(this);
mainPanel.add(buy11);
 
game11 = new JPanel();
game11.setLayout(null);
game11.setBackground(new Color(34,57,75));
game11.setBounds(50,0,990,110);
buy11.add(game11);
 
img11 = new ImageIcon("Images/black_squad.jpg");
imgLabel11 = new JLabel(img11);
imgLabel11.setBounds(-45,0, 340, 100);
game11.add(imgLabel11);

JLabel name11 = new JLabel ("Black Squad");
name11.setBounds(350,42,380,23);
name11.setForeground(new Color(250,250,250));
name11.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game11.add(name11);

JLabel namep11 = new JLabel ("$11.99");
namep11.setBounds(820,42,300,23);
namep11.setForeground(new Color(250,250,250));
namep11.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game11.add(namep11);
 
//----------------------------------------------------------------------------------------------------
 
buy12 = new JButton();
buy12.setBounds(20,1730,960,110);
buy12.setBackground(null);
buy12.setBorderPainted(false);
buy12.addActionListener(this);
mainPanel.add(buy12);
 
game12 = new JPanel();
game12.setLayout(null);
game12.setBackground(new Color(34,57,75));
game12.setBounds(50,0,990,110);
buy12.add(game12);
 
img12 = new ImageIcon("Images/cs2.jpg");
imgLabel12 = new JLabel(img12);
imgLabel12.setBounds(-45,0, 340, 100);
game12.add(imgLabel12);

JLabel name12 = new JLabel ("Counter-Strike 2");
name12.setBounds(350,42,380,23);
name12.setForeground(new Color(250,250,250));
name12.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game12.add(name12);

JLabel namep12 = new JLabel ("$20.99");
namep12.setBounds(820,42,300,23);
namep12.setForeground(new Color(250,250,250));
namep12.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game12.add(namep12);
 
//----------------------------------------------------------------------------------------------------
 
buy13 = new JButton();
buy13.setBounds(20,1860,960,110);
buy13.setBackground(null);
buy13.setBorderPainted(false);
buy13.addActionListener(this);
mainPanel.add(buy13);
 
game13 = new JPanel();
game13.setLayout(null);
game13.setBackground(new Color(34,57,75));
game13.setBounds(50,0,990,110);
buy13.add(game13);
 
img13 = new ImageIcon("Images/Cyberpunk.jpg");
imgLabel13 = new JLabel(img13);
imgLabel13.setBounds(-45,0, 340, 100);
game13.add(imgLabel13);

 JLabel name13 = new JLabel ("Cyberpunk 2077");
name13.setBounds(350,42,380,23);
name13.setForeground(new Color(250,250,250));
name13.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game13.add(name13);

JLabel namep13 = new JLabel ("$49.99");
namep13.setBounds(820,42,300,23);
namep13.setForeground(new Color(250,250,250));
namep13.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game13.add(namep13);

 
//----------------------------------------------------------------------------------------------------
 
buy14 = new JButton();
buy14.setBounds(20,1990,960,110);
buy14.setBackground(null);
buy14.setBorderPainted(false);
buy14.addActionListener(this);
mainPanel.add(buy14);
 
game14 = new JPanel();
game14.setLayout(null);
game14.setBackground(new Color(34,57,75));
game14.setBounds(50,0,990,110);
buy14.add(game14);
 
img14 = new ImageIcon("Images/deadspace.jpg");
imgLabel14 = new JLabel(img14);
imgLabel14.setBounds(-45,0, 340, 100);
game14.add(imgLabel14);

JLabel name14 = new JLabel ("Dead Space");
name14.setBounds(350,42,380,23);
name14.setForeground(new Color(250,250,250));
name14.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game14.add(name14);

JLabel namep14 = new JLabel ("$43.99");
namep14.setBounds(820,42,300,23);
namep14.setForeground(new Color(250,250,250));
namep14.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game14.add(namep14);
 
//----------------------------------------------------------------------------------------------------
 
buy15 = new JButton();
buy15.setBounds(20,2120,960,110);
buy15.setBackground(null);
buy15.setBorderPainted(false);
buy15.addActionListener(this);
mainPanel.add(buy15);
 
game15 = new JPanel();
game15.setLayout(null);
game15.setBackground(new Color(34,57,75));
game15.setBounds(50,0,990,110);
buy15.add(game15);
 
img15 = new ImageIcon("Images/dishonored.jpg");
imgLabel15 = new JLabel(img15);
imgLabel15.setBounds(-45,0, 340, 100);
game15.add(imgLabel15);
 
 JLabel name15 = new JLabel ("Dishonored");
name15.setBounds(350,42,380,23);
name15.setForeground(new Color(250,250,250));
name15.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game15.add(name15);

JLabel namep15 = new JLabel ("$15.99");
namep15.setBounds(820,42,300,23);
namep15.setForeground(new Color(250,250,250));
namep15.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game15.add(namep15);
 
//----------------------------------------------------------------------------------------------------
 
buy16 = new JButton();
buy16.setBounds(20,2250,960,110);
buy16.setBackground(null);
buy16.setBorderPainted(false);
buy16.addActionListener(this);
mainPanel.add(buy16);
 
game16 = new JPanel();
game16.setLayout(null);
game16.setBackground(new Color(34,57,75));
game16.setBounds(50,0,990,110);
buy16.add(game16);
 
img16 = new ImageIcon("Images/dishonored2.jpg");
imgLabel16 = new JLabel(img16);
imgLabel16.setBounds(-45,0, 340, 100);
game16.add(imgLabel16);

JLabel name16 = new JLabel ("Dishonored 2");
name16.setBounds(350,42,380,23);
name16.setForeground(new Color(250,250,250));
name16.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game16.add(name16);

JLabel namep16 = new JLabel ("$16");
namep16.setBounds(820,42,300,23);
namep16.setForeground(new Color(250,250,250));
namep16.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game16.add(namep16);
 
//----------------------------------------------------------------------------------------------------
 
buy17 = new JButton();
buy17.setBounds(20,2380,960,110);
buy17.setBackground(null);
buy17.setBorderPainted(false);
buy17.addActionListener(this);
mainPanel.add(buy17);
 
game17 = new JPanel();
game17.setLayout(null);
game17.setBackground(new Color(34,57,75));
game17.setBounds(50,0,990,110);
buy17.add(game17);
 
img17 = new ImageIcon("Images/Dishonoreddot.jpg");
imgLabel17 = new JLabel(img17);
imgLabel17.setBounds(-45,0, 340, 100);
game17.add(imgLabel17);

JLabel name17 = new JLabel ("Dishonored: Death of the Outsider");
name17.setBounds(350,42,380,23);
name17.setForeground(new Color(250,250,250));
name17.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game17.add(name17);

JLabel namep17 = new JLabel ("$17");
namep17.setBounds(820,42,300,23);
namep17.setForeground(new Color(250,250,250));
namep17.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game17.add(namep17);
 
//----------------------------------------------------------------------------------------------------
 
buy18 = new JButton();
buy18.setBounds(20,2510,960,110);
buy18.setBackground(null);
buy18.setBorderPainted(false);
buy18.addActionListener(this);
mainPanel.add(buy18);
 
game18 = new JPanel();
game18.setLayout(null);
game18.setBackground(new Color(34,57,75));
game18.setBounds(50,0,990,110);
buy18.add(game18);
 
img18 = new ImageIcon("Images/dota.jpg");
imgLabel18 = new JLabel(img18);
imgLabel18.setBounds(-45,0, 340, 100);
game18.add(imgLabel18);

JLabel name18 = new JLabel ("Dota 2");
name18.setBounds(350,42,380,23);
name18.setForeground(new Color(250,250,250));
name18.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game18.add(name18);

JLabel namep18 = new JLabel ("$28.99");
namep18.setBounds(820,42,300,23);
namep18.setForeground(new Color(250,250,250));
namep18.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game18.add(namep18);
 
//----------------------------------------------------------------------------------------------------
 
buy19 = new JButton();
buy19.setBounds(20,2640,960,110);
buy19.setBackground(null);
buy19.setBorderPainted(false);
buy19.addActionListener(this);
mainPanel.add(buy19);
 
game19 = new JPanel();
game19.setLayout(null);
game19.setBackground(new Color(34,57,75));
game19.setBounds(50,0,990,110);
buy19.add(game19);
 
img19 = new ImageIcon("Images/dyinglight.jpg");
imgLabel19 = new JLabel(img19);
imgLabel19.setBounds(-45,0, 340, 100);
game19.add(imgLabel19);

JLabel name19 = new JLabel ("Dying Light");
name19.setBounds(350,42,380,23);
name19.setForeground(new Color(250,250,250));
name19.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game19.add(name19);

JLabel namep19 = new JLabel ("$2.01");
namep19.setBounds(820,42,300,23);
namep19.setForeground(new Color(250,250,250));
namep19.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game19.add(namep19);
 
//----------------------------------------------------------------------------------------------------
 
buy20 = new JButton();
buy20.setBounds(20,2770,960,110);
buy20.setBackground(null);
buy20.setBorderPainted(false);
buy20.addActionListener(this);
mainPanel.add(buy20);
 
game20 = new JPanel();
game20.setLayout(null);
game20.setBackground(new Color(34,57,75));
game20.setBounds(50,0,990,110);
buy20.add(game20);
 
img20 = new ImageIcon("Images/fallout3.jpg");
imgLabel20 = new JLabel(img20);
imgLabel20.setBounds(-45,0, 340, 100);
game20.add(imgLabel20);

JLabel name20 = new JLabel ("Fallout 3");
name20.setBounds(350,42,380,23);
name20.setForeground(new Color(250,250,250));
name20.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game20.add(name20);

JLabel namep20 = new JLabel ("$25.99");
namep20.setBounds(820,42,300,23);
namep20.setForeground(new Color(250,250,250));
namep20.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game20.add(namep20);
 
//----------------------------------------------------------------------------------------------------
 
buy21 = new JButton();
buy21.setBounds(20,2900,960,110);
buy21.setBackground(null);
buy21.setBorderPainted(false);
buy21.addActionListener(this);
mainPanel.add(buy21);
 
game21 = new JPanel();
game21.setLayout(null);
game21.setBackground(new Color(34,57,75));
game21.setBounds(50,0,990,110);
buy21.add(game21);
 
img21 = new ImageIcon("Images/fallout4.jpg");
imgLabel21 = new JLabel(img21);
imgLabel21.setBounds(-45,0, 340, 100);
game21.add(imgLabel21);

JLabel name21 = new JLabel ("Fallout 4");
name21.setBounds(350,42,380,23);
name21.setForeground(new Color(250,250,250));
name21.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game21.add(name21);

JLabel namep21 = new JLabel ("$29.99");
namep21.setBounds(820,42,300,23);
namep21.setForeground(new Color(250,250,250));
namep21.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game21.add(namep21);
 
//----------------------------------------------------------------------------------------------------
 
buy22 = new JButton();
buy22.setBounds(20,3030,960,110);
buy22.setBackground(null);
buy22.setBorderPainted(false);
buy22.addActionListener(this);
mainPanel.add(buy22);
 
game22 = new JPanel();
game22.setLayout(null);
game22.setBackground(new Color(34,57,75));
game22.setBounds(50,0,990,110);
buy22.add(game22);
 
img22 = new ImageIcon("Images/falloutnv.jpg");
imgLabel22 = new JLabel(img22);
imgLabel22.setBounds(-45,0, 340, 100);
game22.add(imgLabel22);

JLabel name22 = new JLabel ("Fallout: New Vegas");
name22.setBounds(350,42,380,23);
name22.setForeground(new Color(250,250,250));
name22.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game22.add(name22);

JLabel namep22 = new JLabel ("$28.99");
namep22.setBounds(820,42,300,23);
namep22.setForeground(new Color(250,250,250));
namep22.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game22.add(namep22);
 
//----------------------------------------------------------------------------------------------------
 
buy23 = new JButton();
buy23.setBounds(20,3160,960,110);
buy23.setBackground(null);
buy23.setBorderPainted(false);
buy23.addActionListener(this);
mainPanel.add(buy23);
 
game23 = new JPanel();
game23.setLayout(null);
game23.setBackground(new Color(34,57,75));
game23.setBounds(50,0,990,110);
buy23.add(game23);
 
img23 = new ImageIcon("Images/fc.jpg");
imgLabel23 = new JLabel(img23);
imgLabel23.setBounds(-45,0, 340, 100);
game23.add(imgLabel23);

JLabel name23 = new JLabel ("Far Cry");
name23.setBounds(350,42,380,23);
name23.setForeground(new Color(250,250,250));
name23.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game23.add(name23);

JLabel namep23 = new JLabel ("$23.99");
namep23.setBounds(820,42,300,23);
namep23.setForeground(new Color(250,250,250));
namep23.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game23.add(namep23);
 
//----------------------------------------------------------------------------------------------------
 
buy24 = new JButton();
buy24.setBounds(20,3290,960,110);
buy24.setBackground(null);
buy24.setBorderPainted(false);
buy24.addActionListener(this);
mainPanel.add(buy24);
 
game24 = new JPanel();
game24.setLayout(null);
game24.setBackground(new Color(34,57,75));
game24.setBounds(50,0,990,110);
buy24.add(game24);
 
img24 = new ImageIcon("Images/fc2.jpg");
imgLabel24 = new JLabel(img24);
imgLabel24.setBounds(-45,0, 340, 100);
game24.add(imgLabel24);

JLabel name24 = new JLabel ("Far Cry 2");
name24.setBounds(350,42,380,23);
name24.setForeground(new Color(250,250,250));
name24.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game24.add(name24);

JLabel namep24 = new JLabel ("$24.99");
namep24.setBounds(820,42,300,23);
namep24.setForeground(new Color(250,250,250));
namep24.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game24.add(namep24);
 
//----------------------------------------------------------------------------------------------------
 
buy25 = new JButton();
buy25.setBounds(20,3420,960,110);
buy25.setBackground(null);
buy25.setBorderPainted(false);
buy25.addActionListener(this);
mainPanel.add(buy25);
 
game25 = new JPanel();
game25.setLayout(null);
game25.setBackground(new Color(34,57,75));
game25.setBounds(50,0,990,110);
buy25.add(game25);
 
img25 = new ImageIcon("Images/fc3.jpg");
imgLabel25 = new JLabel(img25);
imgLabel25.setBounds(-45,0, 340, 100);
game25.add(imgLabel25);

JLabel name25 = new JLabel ("Far Cry 3");
name25.setBounds(350,42,380,23);
name25.setForeground(new Color(250,250,250));
name25.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game25.add(name25);

JLabel namep25 = new JLabel ("$23.99");
namep25.setBounds(820,42,300,23);
namep25.setForeground(new Color(250,250,250));
namep25.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game25.add(namep25);
 
//----------------------------------------------------------------------------------------------------
 
buy26 = new JButton();
buy26.setBounds(20,3550,960,110);
buy26.setBackground(null);
buy26.setBorderPainted(false);
buy26.addActionListener(this);
mainPanel.add(buy26);
 
game26 = new JPanel();
game26.setLayout(null);
game26.setBackground(new Color(34,57,75));
game26.setBounds(50,0,990,110);
buy26.add(game26);
 
img26 = new ImageIcon("Images/fc4.jpg");
imgLabel26 = new JLabel(img26);
imgLabel26.setBounds(-45,0, 340, 100);
game26.add(imgLabel26);

JLabel name26 = new JLabel ("Far Cry 4");
name26.setBounds(350,42,380,23);
name26.setForeground(new Color(250,250,250));
name26.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game26.add(name26);

JLabel namep26 = new JLabel ("$26.99");
namep26.setBounds(820,42,300,23);
namep26.setForeground(new Color(250,250,250));
namep26.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game26.add(namep26);
 
//----------------------------------------------------------------------------------------------------
 
buy27 = new JButton();
buy27.setBounds(20,3680,960,110);
buy27.setBackground(null);
buy27.setBorderPainted(false);
buy27.addActionListener(this);
mainPanel.add(buy27);
 
game27 = new JPanel();
game27.setLayout(null);
game27.setBackground(new Color(34,57,75));
game27.setBounds(50,0,990,110);
buy27.add(game27);
 
img27 = new ImageIcon("Images/fc5.jpg");
imgLabel27 = new JLabel(img27);
imgLabel27.setBounds(-45,0, 340, 100);
game27.add(imgLabel27);

JLabel name27 = new JLabel ("Far Cry 5");
name27.setBounds(350,42,380,23);
name27.setForeground(new Color(250,250,250));
name27.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game27.add(name27);

JLabel namep27 = new JLabel ("$27.99");
namep27.setBounds(820,42,300,23);
namep27.setForeground(new Color(250,250,250));
namep27.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game27.add(namep27);
 
//----------------------------------------------------------------------------------------------------
 
buy28 = new JButton();
buy28.setBounds(20,3810,960,110);
buy28.setBackground(null);
buy28.setBorderPainted(false);
buy28.addActionListener(this);
mainPanel.add(buy28);
 
game28 = new JPanel();
game28.setLayout(null);
game28.setBackground(new Color(34,57,75));
game28.setBounds(50,0,990,110);
buy28.add(game28);
 
img28 = new ImageIcon("Images/fc6.jpg");
imgLabel28 = new JLabel(img28);
imgLabel28.setBounds(-45,0, 340, 100);
game28.add(imgLabel28);

JLabel name28 = new JLabel ("Far Cry 6");
name28.setBounds(350,42,380,23);
name28.setForeground(new Color(250,250,250));
name28.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game28.add(name28);

JLabel namep28 = new JLabel ("$38.99");
namep28.setBounds(820,42,300,23);
namep28.setForeground(new Color(250,250,250));
namep28.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game28.add(namep28);
 
//----------------------------------------------------------------------------------------------------
 
buy29 = new JButton();
buy29.setBounds(20,3940,960,110);
buy29.setBackground(null);
buy29.setBorderPainted(false);
buy29.addActionListener(this);
mainPanel.add(buy29);
 
game29 = new JPanel();
game29.setLayout(null);
game29.setBackground(new Color(34,57,75));
game29.setBounds(50,0,990,110);
buy29.add(game29);
 
img29 = new ImageIcon("Images/fc24.jpg");
imgLabel29 = new JLabel(img29);
imgLabel29.setBounds(-45,0, 340, 100);
game29.add(imgLabel29);

JLabel name29 = new JLabel ("EA Sports FC 24");
name29.setBounds(350,42,380,23);
name29.setForeground(new Color(250,250,250));
name29.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game29.add(name29);

JLabel namep29 = new JLabel ("$29.99");
namep29.setBounds(820,42,300,23);
namep29.setForeground(new Color(250,250,250));
namep29.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game29.add(namep29);
 
//----------------------------------------------------------------------------------------------------
 
buy30 = new JButton();
buy30.setBounds(20,4070,960,110);
buy30.setBackground(null);
buy30.setBorderPainted(false);
buy30.addActionListener(this);
mainPanel.add(buy30);
 
game30 = new JPanel();
game30.setLayout(null);
game30.setBackground(new Color(34,57,75));
game30.setBounds(50,0,990,110);
buy30.add(game30);
 
img30 = new ImageIcon("Images/Hades2.jpg");
imgLabel30 = new JLabel(img30);
imgLabel30.setBounds(-45,0, 340, 100);
game30.add(imgLabel30);

JLabel name30 = new JLabel ("Hades II");
name30.setBounds(350,42,380,23);
name30.setForeground(new Color(250,250,250));
name30.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game30.add(name30);

JLabel namep30 = new JLabel ("$30.99");
namep30.setBounds(820,42,300,23);
namep30.setForeground(new Color(250,250,250));
namep30.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game30.add(namep30);
 
//----------------------------------------------------------------------------------------------------
 
buy31 = new JButton();
buy31.setBounds(20,4200,960,110);
buy31.setBackground(null);
buy31.setBorderPainted(false);
buy31.addActionListener(this);
mainPanel.add(buy31);
 
game31 = new JPanel();
game31.setLayout(null);
game31.setBackground(new Color(34,57,75));
game31.setBounds(50,0,990,110);
buy31.add(game31);
 
img31 = new ImageIcon("Images/halflife.jpg");
imgLabel31 = new JLabel(img31);
imgLabel31.setBounds(-45,0, 340, 100);
game31.add(imgLabel31);

JLabel name31 = new JLabel ("Half-Life");
name31.setBounds(350,42,380,23);
name31.setForeground(new Color(250,250,250));
name31.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game31.add(name31);

JLabel namep31 = new JLabel ("$30.99");
namep31.setBounds(820,42,300,23);
namep31.setForeground(new Color(250,250,250));
namep31.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game31.add(namep31);
 
//----------------------------------------------------------------------------------------------------
 
buy32 = new JButton();
buy32.setBounds(20,4330,960,110);
buy32.setBackground(null);
buy32.setBorderPainted(false);
buy32.addActionListener(this);
mainPanel.add(buy32);
 
game32 = new JPanel();
game32.setLayout(null);
game32.setBackground(new Color(34,57,75));
game32.setBounds(50,0,990,110);
buy32.add(game32);
 
img32 = new ImageIcon("Images/hitman.jpg");
imgLabel32 = new JLabel(img32);
imgLabel32.setBounds(-45,0, 340, 100);
game32.add(imgLabel32);

JLabel name32 = new JLabel ("Hitman");
name32.setBounds(350,42,380,23);
name32.setForeground(new Color(250,250,250));
name32.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game32.add(name32);

JLabel namep32= new JLabel ("$32.99");
namep32.setBounds(820,42,300,23);
namep32.setForeground(new Color(250,250,250));
namep32.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game32.add(namep32);
 
//----------------------------------------------------------------------------------------------------
 
buy33 = new JButton();
buy33.setBounds(20,4460,960,110);
buy33.setBackground(null);
buy33.setBorderPainted(false);
buy33.addActionListener(this);
mainPanel.add(buy33);
 
game33 = new JPanel();
game33.setLayout(null);
game33.setBackground(new Color(34,57,75));
game33.setBounds(50,0,990,110);
buy33.add(game33);
 
img33 = new ImageIcon("Images/hitman2.jpg");
imgLabel33 = new JLabel(img33);
imgLabel33.setBounds(-45,0, 340, 100);
game33.add(imgLabel33);

JLabel name33 = new JLabel ("Hitman 2");
name33.setBounds(350,42,380,23);
name33.setForeground(new Color(250,250,250));
name33.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game33.add(name33);

JLabel namep33 = new JLabel ("$33.99");
namep33.setBounds(820,42,300,23);
namep33.setForeground(new Color(250,250,250));
namep33.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game33.add(namep33);
 
//----------------------------------------------------------------------------------------------------
 
buy34 = new JButton();
buy34.setBounds(20,4590,960,110);
buy34.setBackground(null);
buy34.setBorderPainted(false);
buy34.addActionListener(this);
mainPanel.add(buy34);
 
game34 = new JPanel();
game34.setLayout(null);
game34.setBackground(new Color(34,57,75));
game34.setBounds(50,0,990,110);
buy34.add(game34);
 
img34 = new ImageIcon("Images/kindom.jpg");
imgLabel34 = new JLabel(img34);
imgLabel34.setBounds(-45,0, 340, 100);
game34.add(imgLabel34);

JLabel name34 = new JLabel ("Kingdom Come: Deliverance");
name34.setBounds(350,42,380,23);
name34.setForeground(new Color(250,250,250));
name34.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game34.add(name34);

JLabel namep34 = new JLabel ("$34.99");
namep34.setBounds(820,42,300,23);
namep34.setForeground(new Color(250,250,250));
namep34.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game34.add(namep34);
 
//----------------------------------------------------------------------------------------------------
 
buy35 = new JButton();
buy35.setBounds(20,4720,960,110);
buy35.setBackground(null);
buy35.setBorderPainted(false);
buy35.addActionListener(this);
mainPanel.add(buy35);
 
game35 = new JPanel();
game35.setLayout(null);
game35.setBackground(new Color(34,57,75));
game35.setBounds(50,0,990,110);
buy35.add(game35);
 
img35 = new ImageIcon("Images/lifeisstrange.jpg");
imgLabel35 = new JLabel(img35);
imgLabel35.setBounds(-45,0, 340, 100);
game35.add(imgLabel35);

JLabel name35 = new JLabel ("Life is Strange");
name35.setBounds(350,42,380,23);
name35.setForeground(new Color(250,250,250));
name35.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game35.add(name35);

JLabel namep35 = new JLabel ("$35.99");
namep35.setBounds(820,42,300,23);
namep35.setForeground(new Color(250,250,250));
namep35.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game35.add(namep35);
 
//----------------------------------------------------------------------------------------------------
 
buy36 = new JButton();
buy36.setBounds(20,4850,960,110);
buy36.setBackground(null);
buy36.setBorderPainted(false);
buy36.addActionListener(this);
mainPanel.add(buy36);
 
game36 = new JPanel();
game36.setLayout(null);
game36.setBackground(new Color(34,57,75));
game36.setBounds(50,0,990,110);
buy36.add(game36);
 
img36 = new ImageIcon("Images/metro3.jpg");
imgLabel36 = new JLabel(img36);
imgLabel36.setBounds(-45,0, 340, 100);
game36.add(imgLabel36);

JLabel name36 = new JLabel ("Metro Exodus");
name36.setBounds(350,42,380,23);
name36.setForeground(new Color(250,250,250));
name36.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game36.add(name36);

JLabel namep36 = new JLabel ("$36");
namep36.setBounds(820,42,300,23);
namep36.setForeground(new Color(250,250,250));
namep36.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game36.add(namep36);
 
//----------------------------------------------------------------------------------------------------
 
buy37 = new JButton();
buy37.setBounds(20,4980,960,110);
buy37.setBackground(null);
buy37.setBorderPainted(false);
buy37.addActionListener(this);
mainPanel.add(buy37);
 
game37 = new JPanel();
game37.setLayout(null);
game37.setBackground(new Color(34,57,75));
game37.setBounds(50,0,990,110);
buy37.add(game37);
 
img37 = new ImageIcon("Images/metro2033.jpg");
imgLabel37 = new JLabel(img37);
imgLabel37.setBounds(-45,0, 340, 100);
game37.add(imgLabel37);

JLabel name37 = new JLabel ("Metro 2033");
name37.setBounds(350,42,380,23);
name37.setForeground(new Color(250,250,250));
name37.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game37.add(name37);

JLabel namep37 = new JLabel ("$37.99");
namep37.setBounds(820,42,300,23);
namep37.setForeground(new Color(250,250,250));
namep37.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game37.add(namep37);
 
//----------------------------------------------------------------------------------------------------
 
buy38 = new JButton();
buy38.setBounds(20,5110,960,110);
buy38.setBackground(null);
buy38.setBorderPainted(false);
buy38.addActionListener(this);
mainPanel.add(buy38);
 
game38 = new JPanel();
game38.setLayout(null);
game38.setBackground(new Color(34,57,75));
game38.setBounds(50,0,990,110);
buy38.add(game38);
 
img38 = new ImageIcon("Images/metro2033r.jpg");
imgLabel38 = new JLabel(img38);
imgLabel38.setBounds(-45,0, 340, 100);
game38.add(imgLabel38);

JLabel name38 = new JLabel ("Metro: Redux");
name38.setBounds(350,42,380,23);
name38.setForeground(new Color(250,250,250));
name38.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game38.add(name38);

JLabel namep38 = new JLabel ("$38");
namep38.setBounds(820,42,300,23);
namep38.setForeground(new Color(250,250,250));
namep38.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game38.add(namep38);
 
//----------------------------------------------------------------------------------------------------
 
buy39 = new JButton();
buy39.setBounds(20,5240,960,110);
buy39.setBackground(null);
buy39.setBorderPainted(false);
buy39.addActionListener(this);
mainPanel.add(buy39);
 
game39 = new JPanel();
game39.setLayout(null);
game39.setBackground(new Color(34,57,75));
game39.setBounds(50,0,990,110);
buy39.add(game39);
 
img39 = new ImageIcon("Images/metrolastlight.jpg");
imgLabel39 = new JLabel(img39);
imgLabel39.setBounds(-45,0, 340, 100);
game39.add(imgLabel39);

JLabel name39 = new JLabel ("Metro: Last Light");
name39.setBounds(350,42,380,23);
name39.setForeground(new Color(250,250,250));
name39.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game39.add(name39);

JLabel namep39 = new JLabel ("$39.99");
namep39.setBounds(820,42,300,23);
namep39.setForeground(new Color(250,250,250));
namep39.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game39.add(namep39);
 
//----------------------------------------------------------------------------------------------------
 
buy40 = new JButton();
buy40.setBounds(20,5370,960,110);
buy40.setBackground(null);
buy40.setBorderPainted(false);
buy40.addActionListener(this);
mainPanel.add(buy40);
 
game40 = new JPanel();
game40.setLayout(null);
game40.setBackground(new Color(34,57,75));
game40.setBounds(50,0,990,110);
buy40.add(game40);
 
img40 = new ImageIcon("Images/portal.jpg");
imgLabel40 = new JLabel(img40);
imgLabel40.setBounds(-45,0, 340, 100);
game40.add(imgLabel40);

JLabel name40 = new JLabel ("Portal 2");
name40.setBounds(350,42,380,23);
name40.setForeground(new Color(250,250,250));
name40.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game40.add(name40);

JLabel namep40 = new JLabel ("$39.99");
namep40.setBounds(820,42,300,23);
namep40.setForeground(new Color(250,250,250));
namep40.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game40.add(namep40);
 
//----------------------------------------------------------------------------------------------------
 
buy41 = new JButton();
buy41.setBounds(20,5500,960,110);
buy41.setBackground(null);
buy41.setBorderPainted(false);
buy41.addActionListener(this);
mainPanel.add(buy41);
 
game41 = new JPanel();
game41.setLayout(null);
game41.setBackground(new Color(34,57,75));
game41.setBounds(50,0,990,110);
buy41.add(game41);
 
img41 = new ImageIcon("Images/pubg.jpg");
imgLabel41 = new JLabel(img41);
imgLabel41.setBounds(-45,0, 340, 100);
game41.add(imgLabel41);

JLabel name41 = new JLabel ("PlayerUnknown's Battlegrounds");
name41.setBounds(350,42,380,23);
name41.setForeground(new Color(250,250,250));
name41.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game41.add(name41);

JLabel namep41 = new JLabel ("$41.99");
namep41.setBounds(820,42,300,23);
namep41.setForeground(new Color(250,250,250));
namep41.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game41.add(namep41);
 
//----------------------------------------------------------------------------------------------------
 
buy42 = new JButton();
buy42.setBounds(20,5630,960,110);
buy42.setBackground(null);
buy42.setBorderPainted(false);
buy42.addActionListener(this);
mainPanel.add(buy42);
 
game42 = new JPanel();
game42.setLayout(null);
game42.setBackground(new Color(34,57,75));
game42.setBounds(50,0,990,110);
buy42.add(game42);
 
img42 = new ImageIcon("Images/R6.jpg");
imgLabel42 = new JLabel(img42);
imgLabel42.setBounds(-45,0, 340, 100);
game42.add(imgLabel42);

JLabel name42 = new JLabel ("Tom Clancy's Rainbow Six Siege");
name42.setBounds(350,42,380,23);
name42.setForeground(new Color(250,250,250));
name42.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game42.add(name42);

JLabel namep42 = new JLabel ("$42.99");
namep42.setBounds(820,42,300,23);
namep42.setForeground(new Color(250,250,250));
namep42.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game42.add(namep42);
 
//----------------------------------------------------------------------------------------------------
 
buy43 = new JButton();
buy43.setBounds(20,5760,960,110);
buy43.setBackground(null);
buy43.setBorderPainted(false);
buy43.addActionListener(this);
mainPanel.add(buy43);
 
game43 = new JPanel();
game43.setLayout(null);
game43.setBackground(new Color(34,57,75));
game43.setBounds(50,0,990,110);
buy43.add(game43);
 
img43 = new ImageIcon("Images/re2.jpg");
imgLabel43 = new JLabel(img43);
imgLabel43.setBounds(-45,0, 340, 100);
game43.add(imgLabel43);

JLabel name43 = new JLabel ("Resident Evil 2");
name43.setBounds(350,42,380,23);
name43.setForeground(new Color(250,250,250));
name43.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game43.add(name43);

JLabel namep43 = new JLabel ("$43");
namep43.setBounds(820,42,300,23);
namep43.setForeground(new Color(250,250,250));
namep43.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game43.add(namep43);
 
//----------------------------------------------------------------------------------------------------
 
buy44 = new JButton();
buy44.setBounds(20,5890,960,110);
buy44.setBackground(null);
buy44.setBorderPainted(false);
buy44.addActionListener(this);
mainPanel.add(buy44);
 
game44 = new JPanel();
game44.setLayout(null);
game44.setBackground(new Color(34,57,75));
game44.setBounds(50,0,990,110);
buy44.add(game44);
 
img44 = new ImageIcon("Images/re3.jpg");
imgLabel44 = new JLabel(img44);
imgLabel44.setBounds(-45,0, 340, 100);
game44.add(imgLabel44);

JLabel name44 = new JLabel ("Resident Evil 3");
name44.setBounds(350,42,380,23);
name44.setForeground(new Color(250,250,250));
name44.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game44.add(name44);

JLabel namep44 = new JLabel ("$44.99");
namep44.setBounds(820,42,300,23);
namep44.setForeground(new Color(250,250,250));
namep44.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game44.add(namep44);
 
//----------------------------------------------------------------------------------------------------
 
buy45 = new JButton();
buy45.setBounds(20,6020,960,110);
buy45.setBackground(null);
buy45.setBorderPainted(false);
buy45.addActionListener(this);
mainPanel.add(buy45);
 
game45 = new JPanel();
game45.setLayout(null);
game45.setBackground(new Color(34,57,75));
game45.setBounds(50,0,990,110);
buy45.add(game45);
 
img45 = new ImageIcon("Images/re4.jpg");
imgLabel45 = new JLabel(img45);
imgLabel45.setBounds(-45,0, 340, 100);
game45.add(imgLabel45);

JLabel name45 = new JLabel ("Resident Evil 4");
name45.setBounds(350,42,380,23);
name45.setForeground(new Color(250,250,250));
name45.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game45.add(name45);

JLabel namep45 = new JLabel ("$45.99");
namep45.setBounds(820,42,300,23);
namep45.setForeground(new Color(250,250,250));
namep45.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game45.add(namep45);
 
//----------------------------------------------------------------------------------------------------
 
buy46 = new JButton();
buy46.setBounds(20,6150,960,110);
buy46.setBackground(null);
buy46.setBorderPainted(false);
buy46.addActionListener(this);
mainPanel.add(buy46);
 
game46 = new JPanel();
game46.setLayout(null);
game46.setBackground(new Color(34,57,75));
game46.setBounds(50,0,990,110);
buy46.add(game46);
 
img46 = new ImageIcon("Images/RE7.jpg");
imgLabel46 = new JLabel(img46);
imgLabel46.setBounds(-45,0, 340, 100);
game46.add(imgLabel46);

JLabel name46 = new JLabel ("Resident Evil 7: Biohazard");
name46.setBounds(350,42,380,23);
name46.setForeground(new Color(250,250,250));
name46.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game46.add(name46);

JLabel namep46 = new JLabel ("$50.99");
namep46.setBounds(820,42,300,23);
namep46.setForeground(new Color(250,250,250));
namep46.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game46.add(namep46);
 
//----------------------------------------------------------------------------------------------------
 
buy47 = new JButton();
buy47.setBounds(20,6280,960,110);
buy47.setBackground(null);
buy47.setBorderPainted(false);
buy47.addActionListener(this);
mainPanel.add(buy47);
 
game47 = new JPanel();
game47.setLayout(null);
game47.setBackground(new Color(34,57,75));
game47.setBounds(50,0,990,110);
buy47.add(game47);
 
img47 = new ImageIcon("Images/re8.jpg");
imgLabel47 = new JLabel(img47);
imgLabel47.setBounds(-45,0, 340, 100);
game47.add(imgLabel47);

JLabel name47 = new JLabel ("Resident Evil Village");
name47.setBounds(350,42,380,23);
name47.setForeground(new Color(250,250,250));
name47.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game47.add(name47);

JLabel namep47 = new JLabel ("$47.99");
namep47.setBounds(820,42,300,23);
namep47.setForeground(new Color(250,250,250));
namep47.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game47.add(namep47);
 
//----------------------------------------------------------------------------------------------------
 
buy48 = new JButton();
buy48.setBounds(20,6410,960,110);
buy48.setBackground(null);
buy48.setBorderPainted(false);
buy48.addActionListener(this);
mainPanel.add(buy48);
 
game48 = new JPanel();
game48.setLayout(null);
game48.setBackground(new Color(34,57,75));
game48.setBounds(50,0,990,110);
buy48.add(game48);
 
img48 = new ImageIcon("Images/readdead2.jpg");
imgLabel48 = new JLabel(img48);
imgLabel48.setBounds(-45,0, 340, 100);
game48.add(imgLabel48);

JLabel name48 = new JLabel ("Red Dead Redemption 2");
name48.setBounds(350,42,380,23);
name48.setForeground(new Color(250,250,250));
name48.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game48.add(name48);

JLabel namep48 = new JLabel ("$48.99");
namep48.setBounds(820,42,300,23);
namep48.setForeground(new Color(250,250,250));
namep48.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game48.add(namep48);
 
//----------------------------------------------------------------------------------------------------
 
buy49 = new JButton();
buy49.setBounds(20,6540,960,110);
buy49.setBackground(null);
buy49.setBorderPainted(false);
buy49.addActionListener(this);
mainPanel.add(buy49);
 
game49 = new JPanel();
game49.setLayout(null);
game49.setBackground(new Color(34,57,75));
game49.setBounds(50,0,990,110);
buy49.add(game49);
 
img49 = new ImageIcon("Images/rust.jpg");
imgLabel49 = new JLabel(img49);
imgLabel49.setBounds(-45,0, 340, 100);
game49.add(imgLabel49);

JLabel name49 = new JLabel ("Rust");
name49.setBounds(350,42,380,23);
name49.setForeground(new Color(250,250,250));
name49.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game49.add(name49);

JLabel namep49 = new JLabel ("$39.99");
namep49.setBounds(820,42,300,23);
namep49.setForeground(new Color(250,250,250));
namep49.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game49.add(namep49);
 
//----------------------------------------------------------------------------------------------------
 
buy50 = new JButton();
buy50.setBounds(20,6670,960,110);
buy50.setBackground(null);
buy50.setBorderPainted(false);
buy50.addActionListener(this);
mainPanel.add(buy50);
 
game50 = new JPanel();
game50.setLayout(null);
game50.setBackground(new Color(34,57,75));
game50.setBounds(50,0,990,110);
buy50.add(game50);
 
img50 = new ImageIcon("Images/warface.jpg");
imgLabel50 = new JLabel(img50);
imgLabel50.setBounds(-45,0, 340, 100);
game50.add(imgLabel50);

JLabel name50 = new JLabel ("Warface");
name50.setBounds(350,42,380,23);
name50.setForeground(new Color(250,250,250));
name50.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game50.add(name50);

JLabel namep50 = new JLabel ("$50.99");
namep50.setBounds(820,42,300,23);
namep50.setForeground(new Color(250,250,250));
namep50.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game50.add(namep50);
 
//----------------------------------------------------------------------------------------------------
 
buy51 = new JButton();
buy51.setBounds(20,6800,960,110);
buy51.setBackground(null);
buy51.setBorderPainted(false);
buy51.addActionListener(this);
mainPanel.add(buy51);
 
game51 = new JPanel();
game51.setLayout(null);
game51.setBackground(new Color(34,57,75));
game51.setBounds(50,0,990,110);
buy51.add(game51);
 
img51 = new ImageIcon("Images/witcher2.jpg");
imgLabel51 = new JLabel(img51);
imgLabel51.setBounds(-45,0, 340, 100);
game51.add(imgLabel51);

JLabel name51 = new JLabel ("The Witcher 2: Assassins of Kings");
name51.setBounds(350,42,380,23);
name51.setForeground(new Color(250,250,250));
name51.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game51.add(name51);

JLabel namep51 = new JLabel ("$51.99");
namep51.setBounds(820,42,300,23);
namep51.setForeground(new Color(250,250,250));
namep51.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game51.add(namep51);
 
//----------------------------------------------------------------------------------------------------
 
buy52 = new JButton();
buy52.setBounds(20,6930,960,110);
buy52.setBackground(null);
buy52.setBorderPainted(false);
buy52.addActionListener(this);
mainPanel.add(buy52);
 
game52 = new JPanel();
game52.setLayout(null);
game52.setBackground(new Color(34,57,75));
game52.setBounds(50,0,990,110);
buy52.add(game52);
 
img52 = new ImageIcon("Images/withcer.jpg");
imgLabel52 = new JLabel(img52);
imgLabel52.setBounds(-45,0, 340, 100);
game52.add(imgLabel52);

JLabel name52 = new JLabel ("The Witcher");
name52.setBounds(350,42,380,23);
name52.setForeground(new Color(250,250,250));
name52.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game52.add(name52);

JLabel namep52 = new JLabel ("$52.99");
namep52.setBounds(820,42,300,23);
namep52.setForeground(new Color(250,250,250));
namep52.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game52.add(namep52);
 
//----------------------------------------------------------------------------------------------------
 
buy53 = new JButton();
buy53.setBounds(20,7060,960,110);
buy53.setBackground(null);
buy53.setBorderPainted(false);
buy53.addActionListener(this);
mainPanel.add(buy53);
 
game53 = new JPanel();
game53.setLayout(null);
game53.setBackground(new Color(34,57,75));
game53.setBounds(50,0,990,110);
buy53.add(game53);
 
img53 = new ImageIcon("Images/wither3.jpg");
imgLabel53 = new JLabel(img53);
imgLabel53.setBounds(-45,0, 340, 100);
game53.add(imgLabel53);

JLabel name53 = new JLabel ("The Witcher 3: Wild Hunt");
name53.setBounds(350,42,380,23);
name53.setForeground(new Color(250,250,250));
name53.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game53.add(name53);

JLabel namep53 = new JLabel ("$53");
namep53.setBounds(820,42,300,23);
namep53.setForeground(new Color(250,250,250));
namep53.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
game53.add(namep53);
 
//----------------------------------------------------------------------------------------------------

        imgback=new ImageIcon("Images/menubackgroud.png");
        imgbacklabel=new JLabel(imgback);
        imgbacklabel.setBounds(0,0,1024,7200);
        mainPanel.add(imgbacklabel);

        this.getContentPane().add(scrollPane);  
          
     }

     public JPanel getGamePanel() 
     {
        return game0;
     }

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}

boolean isGame0Visible = true;
public void actionPerformed(ActionEvent ae){
    
     if (ae.getSource() == buy0 || ae.getSource() == buy1) 
	{
			if (isGame0Visible) 
			{
				game[0].setVisible(false);
				game[4].setVisible(true);
				game[1].setVisible(false);
				game[5].setVisible(true);
				game[2].setVisible(false);
				game[6].setVisible(true);
				game[3].setVisible(false);
				game[7].setVisible(true);
			} 
			else 
			{
				game[0].setVisible(true);
				game[4].setVisible(false);
				game[1].setVisible(true);
				game[5].setVisible(false);
				game[2].setVisible(true);
				game[6].setVisible(false);
				game[3].setVisible(true);
				game[7].setVisible(false);
				
			}
			isGame0Visible = !isGame0Visible;
	}

		 else if(ae.getSource()==buy3||ae.getSource()==buy4||ae.getSource()==buy5||ae.getSource()==buy6||ae.getSource()==buy7||ae.getSource()==buy8||ae.getSource()==buy9||ae.getSource()==buy10||ae.getSource()==buy11||ae.getSource()==buy12||ae.getSource()==buy13||ae.getSource()==buy14||ae.getSource()==buy15||ae.getSource()==buy16||ae.getSource()==buy17||ae.getSource()==buy18||ae.getSource()==buy19||ae.getSource()==buy20||ae.getSource()==buy21||ae.getSource()==buy22||ae.getSource()==buy23||ae.getSource()==buy24||ae.getSource()==buy25||ae.getSource()==buy26||ae.getSource()==buy27||ae.getSource()==buy28||ae.getSource()==buy29||ae.getSource()==buy30||ae.getSource()==buy31||ae.getSource()==buy32||ae.getSource()==buy33||ae.getSource()==buy34||ae.getSource()==buy35||ae.getSource()==buy36||ae.getSource()==buy37||ae.getSource()==buy38||ae.getSource()==buy39||ae.getSource()==buy40||ae.getSource()==buy41||ae.getSource()==buy42||ae.getSource()==buy43||ae.getSource()==buy44||ae.getSource()==buy45||ae.getSource()==buy46||ae.getSource()==buy47||ae.getSource()==buy48||ae.getSource()==buy49||ae.getSource()==buy50||ae.getSource()==buy51||ae.getSource()==buy52||ae.getSource()==buy53)
		 {
		 	MStore store1 =new MStore(s1,s2,this);
             store1.setVisible(true);
		 	this.setVisible(false);
			if (ae.getSource()==buy3)
        {
            addGameToLibrary("Assassin's Creed Revelations");
        }
else if (ae.getSource()==buy4)
{
addGameToLibrary("Assassin's Creed III: Liberation" );
}
//--------------------------
else if (ae.getSource()==buy5)
{
addGameToLibrary( "Assassin's Creed IV: Black Flag");
}
//--------------------------
else if (ae.getSource()==buy6)
{
addGameToLibrary("Assassin's Creed Origins" );
}
//--------------------------
else if (ae.getSource()==buy7)
{
addGameToLibrary( "Assassin's Creed Rogue");
}
//--------------------------
else if (ae.getSource()==buy8)
{
addGameToLibrary("Assassin's Creed Unity" );
}
//--------------------------
else if (ae.getSource()==buy9)
{
addGameToLibrary("Apex Legends" );
}
//--------------------------
else if (ae.getSource()==buy10)
{
addGameToLibrary("Batman: Arkham Knight" );
}
//--------------------------
else if (ae.getSource()==buy11)
{
addGameToLibrary("Black Squad" );
}
//--------------------------
else if (ae.getSource()==buy12)
{
addGameToLibrary( "Counter-Strike 2");
}
//--------------------------
else if (ae.getSource()==buy13)
{
addGameToLibrary( "Cyberpunk 2077");
}
//--------------------------
else if (ae.getSource()==buy14)
{
addGameToLibrary("Images/deadspace.jpg" );
}
//--------------------------
else if (ae.getSource()==buy15)
{
addGameToLibrary("Dishonored" );
}
//--------------------------
else if (ae.getSource()==buy16)
{
addGameToLibrary("Dishonored 2" );
}
//--------------------------
else if (ae.getSource()==buy17)
{
addGameToLibrary("Dishonored: Death of the Outsider" );
}
//--------------------------
else if (ae.getSource()==buy18)
{
addGameToLibrary( "Dota 2");
}
//--------------------------
else if (ae.getSource()==buy19)
{
addGameToLibrary("Dying Light" );
}
//--------------------------
else if (ae.getSource()==buy20)
{
addGameToLibrary("Fallout 3" );
}
//--------------------------
else if (ae.getSource()==buy21)
{
addGameToLibrary( "Fallout 4");
}
//--------------------------
else if (ae.getSource()==buy22)
{
addGameToLibrary("Fallout: New Vegas" );
}
//--------------------------
else if (ae.getSource()==buy23)
{
addGameToLibrary("Far Cry" );
}
//--------------------------
else if (ae.getSource()==buy24)
{
addGameToLibrary( "Far Cry 2");
}
//--------------------------
else if (ae.getSource()==buy25)
{
addGameToLibrary("Far Cry 3" );
}
//--------------------------
else if (ae.getSource()==buy26)
{
addGameToLibrary("Far Cry 4" );
}
//--------------------------
else if (ae.getSource()==buy27)
{
addGameToLibrary("Far Cry 5" );
}
//--------------------------
else if (ae.getSource()==buy28)
{
addGameToLibrary( "Far Cry 6");
}
//--------------------------
else if (ae.getSource()==buy29)
{
addGameToLibrary( "EA Sports FC 24");
}
//--------------------------
else if (ae.getSource()==buy30)
{
addGameToLibrary( "Hades II");
}
//--------------------------
else if (ae.getSource()==buy31)
{
addGameToLibrary( "Half-Life");
}
//--------------------------
else if (ae.getSource()==buy32)
{
addGameToLibrary( "Hitman");
}
//--------------------------
else if (ae.getSource()==buy33)
{
addGameToLibrary( "Hitman 2");
}
//--------------------------
else if (ae.getSource()==buy34)
{
addGameToLibrary("Kingdom Come: Deliverance" );
}
//--------------------------
else if (ae.getSource()==buy35)
{
addGameToLibrary("Life is Strange" );
}
//--------------------------
else if (ae.getSource()==buy36)
{
addGameToLibrary( "Metro Exodus");
}
//--------------------------
else if (ae.getSource()==buy37)
{
addGameToLibrary( "Metro 2033");
}
//--------------------------
else if (ae.getSource()==buy38)
{
addGameToLibrary("Metro: Redux" );
}
//--------------------------
else if (ae.getSource()==buy39)
{
addGameToLibrary( "Metro: Last Light");
}
//--------------------------
else if (ae.getSource()==buy40)
{
addGameToLibrary( "Portal 2");
}
//--------------------------
else if (ae.getSource()==buy41)
{
addGameToLibrary( "PlayerUnknown's Battlegrounds");
}
//--------------------------
else if (ae.getSource()==buy42)
{
addGameToLibrary("Tom Clancy's Rainbow Six Siege");
}
//--------------------------
else if (ae.getSource()==buy43)
{
addGameToLibrary("Resident Evil 2");
}
//--------------------------
else if (ae.getSource()==buy44)
{
addGameToLibrary("Resident Evil 3");
}
//--------------------------
else if (ae.getSource()==buy45)
{
addGameToLibrary("Resident Evil 4");
}
//--------------------------
else if (ae.getSource()==buy46)
{
addGameToLibrary("Resident Evil 7: Biohazard");
}
//--------------------------
else if (ae.getSource()==buy47)
{
addGameToLibrary("Resident Evil Village");
}
//--------------------------
else if (ae.getSource()==buy48)
{
addGameToLibrary("Red Dead Redemption 2");
}
//--------------------------
else if (ae.getSource()==buy49)
{
addGameToLibrary("Rust");
}
//--------------------------
else if (ae.getSource()==buy50)
{
addGameToLibrary("Warface");
}
//--------------------------
else if (ae.getSource()==buy51)
{
addGameToLibrary("The Witcher 2: Assassins of Kings");
}
//--------------------------
else if (ae.getSource()==buy52)
{
addGameToLibrary("The Witcher");
}
//--------------------------
else if (ae.getSource()==buy53)
{
addGameToLibrary( "The Witcher 3: Wild Hunt");
}
//--------------------------

		 }
        
       
        else if (ae.getSource()==userLabel)
        {
            profile p1 = new profile(s1,s2,this);
            p1.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getSource()==logOutbtn)
        {
            logIn l1=new logIn();
            l1.setVisible(true);
            this.setVisible(false);
        }

	}

    private void addGameToLibrary(String gameName) 
    {
        File file = new File(".\\Datas\\library_" + s1 + ".txt"); // One library file per user
        try (FileWriter fwrite = new FileWriter(file, true)) 
        
        { // Append to the file
            fwrite.write(gameName + "\n");
            fwrite.flush();
        } 
        catch (IOException e) 

        {
            e.printStackTrace();
        }
    }

}