import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class menu extends JFrame implements  MouseListener, ActionListener 
{
    JPanel mainPanel, upperPanel, game0,game00,game1,game2,game3,game4,game5,game6,game7,game8,game9,game10,game11,game12,game13,game14,game15,game16,game17,game18,game19,game20,game21,game22,game23,game24,game25,game26,game27,game28,game29,game30,game30_1, game31,game32,game33,game34,game35,game36,game37,game38,game39,game40,game41,game42,game43,game44,game45,game46,game47,game48,game49,game50,game51,game52,game53,game54;
    ImageIcon img,img0,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,img30_1,img31,img32,img33,img34,img35,img36,img37,img38,img39,img40,img41,img42,img43,img44,img45,img46,img47,img48,img49,img50,img51,img52,img53,img54,imgs;
    JLabel name1;
    JLabel imglabels,imglabel,imgLabel0,imgLabel1,imgLabel2,imgLabel3,imgLabel4,imgLabel5,imgLabel6,imgLabel7,imgLabel8,imgLabel9,imgLabel10,imgLabel11,imgLabel12,imgLabel13,imgLabel14,imgLabel15,imgLabel16,imgLabel17,imgLabel18,imgLabel19,imgLabel20,imgLabel21,imgLabel22,imgLabel23,imgLabel24,imgLabel25,imgLabel26,imgLabel27,imgLabel28,imgLabel29,imgLabel30,imgLabel30_1,imgLabel31,imgLabel32,imgLabel33,imgLabel34,imgLabel35,imgLabel36,imgLabel37,imgLabel38,imgLabel39,imgLabel40,imgLabel41,imgLabel42,imgLabel43,imgLabel44,imgLabel45,imgLabel46,imgLabel47,imgLabel48,imgLabel49,imgLabel50,imgLabel51,imgLabel52,imgLabel53,imgLabel54;
    JScrollPane scrollPane;
    JButton userLabel,store,library, left, right,storebtn;
    JButton buy0,buy1,buy2,buy3,buy4,buy5,buy6,buy7,buy8,buy9,buy10,buy11,buy12,buy13,buy14,buy15,buy16,buy17,buy18,buy19,buy20,buy21,buy22,buy23,buy24,buy25,buy26,buy27,buy28,buy29,buy30,buy31,buy32,buy33,buy34,buy35,buy36,buy37,buy38,buy39,buy40,buy41,buy42,buy43,buy44,buy45,buy46,buy47,buy48,buy49,buy50,buy51,buy52,buy53,buy54;
    



    public menu ()
    {        
        super("STEAM");
        this.setSize(1024, 768);
        this.setLocation(250,40);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

 
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


        img=new ImageIcon("logo_steam.png");
        imglabel=new JLabel(img);
        imglabel.setBounds(200,25,200,50);
        upperPanel.add(imglabel);
		
		
		imgs=new ImageIcon("storebag.png");
 
		storebtn = new JButton(imgs);
		storebtn.setBounds(870,25,50,50);
		storebtn.setBackground(new Color(23,26,33));
		storebtn.setBorderPainted(false);
		storebtn.setContentAreaFilled(false);
		storebtn.addMouseListener(this);
		storebtn.addActionListener(this);
		upperPanel.add(storebtn);


        store = new JButton("STORE");
        store.setBounds(400,40,100,30);
        store.setFont(new Font("Arial", Font.BOLD, 15));
        store.setBackground(Color.GREEN);
        store.setOpaque(false);
        store.setForeground(new Color(177,179,182));
		store.setBackground(new Color(23,26,33));
        store.setBorderPainted(false);
        store.setContentAreaFilled(false);
        store.addActionListener(this);
        upperPanel.add(store);


        userLabel = new JButton("USERNAME");
        userLabel.setBounds(480,40,150,30);
        userLabel.setFont(new Font("Arial", Font.BOLD, 15));
        userLabel.setBackground(Color.GREEN);
        userLabel.setOpaque(false);
        userLabel.setForeground(new Color(177,179,182));
        userLabel.setContentAreaFilled(false);
        userLabel.setBorderPainted(false);
        upperPanel.add(userLabel);


        library = new JButton("LIBRARY");
        library.setBounds(605,40,150,30);
        library.setFont(new Font("Arial", Font.BOLD, 15));
        library.setBackground(Color.GREEN);
        library.setOpaque(false);
        library.setForeground(new Color(177,179,182));
        library.setContentAreaFilled(false);
        library.setBorderPainted(false);
        library.addActionListener(this);
        upperPanel.add(library);


        mainPanel.add(upperPanel); //this.add jemon sobar last e add korte hoy temni ei panel er mdode jehetu sob dukbe, tai sob kisu dukanor por .add korbo {()}. anekta, ekta bag er modde sob jinis dukanor por cain off kora. Oi jinis gulo nijera add/chain off hobe than amar bag er chain off hobe sobar last e .

buy0 = new JButton();
buy0.setBounds(20,170,960,110);
buy0.setBackground(null);
buy0.setBorderPainted(false);
buy0.addActionListener(this);
mainPanel.add(buy0);
 
game0 = new JPanel();
game0.setLayout(null);
game0.setBackground(new Color(34,57,75));
game0.setBounds(50,0,990,110);
buy0.add(game0);
 
img0 = new ImageIcon("ac.jpg");
imgLabel0 = new JLabel(img0);
imgLabel0.setBounds(-45,0, 340, 100);
game0.add(imgLabel0);
 
//----------------------------------------------------------------------------------------------------
 
buy1 = new JButton();
buy1.setBounds(20,300,960,110);
buy1.setBackground(null);
buy1.setBorderPainted(false);
buy1.addActionListener(this);
mainPanel.add(buy1);
 
game1 = new JPanel();
game1.setLayout(null);
game1.setBackground(new Color(34,57,75));
game1.setBounds(50,0,990,110);
buy1.add(game1);

 
img1 = new ImageIcon("ac2.jpg");
imgLabel1 = new JLabel(img1);
imgLabel1.setBounds(-45,0, 340, 100);
game1.add(imgLabel1);

JLabel name1 = new JLabel ("assassins creed 2"+"\n"+"$10");
name1.setBounds(500,10,300,20);
name1.setFont(new Font("Arial", Font.BOLD, 15));
game1.add(name1);

//----------------------------------------------------------------------------------------------------
 
buy2 = new JButton();
buy2.setBounds(20,430,960,110);
buy2.setBackground(null);
buy2.setBorderPainted(false);
buy2.addActionListener(this);
mainPanel.add(buy2);
 
game2 = new JPanel();
game2.setLayout(null);
game2.setBackground(new Color(34,57,75));
game2.setBounds(50,0,990,110);
buy2.add(game2);
 
img2 = new ImageIcon("ac2b.jpg");
imgLabel2 = new JLabel(img2);
imgLabel2.setBounds(-45,0, 340, 100);
game2.add(imgLabel2);
 
//----------------------------------------------------------------------------------------------------
 
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
 
img3 = new ImageIcon("ac2r.jpg");
imgLabel3 = new JLabel(img3);
imgLabel3.setBounds(-45,0, 340, 100);
game3.add(imgLabel3);
 
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
 
img4 = new ImageIcon("ac3.jpg");
imgLabel4 = new JLabel(img4);
imgLabel4.setBounds(-45,0, 340, 100);
game4.add(imgLabel4);
 
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
 
img5 = new ImageIcon("ac4.jpg");
imgLabel5 = new JLabel(img5);
imgLabel5.setBounds(-45,0, 340, 100);
game5.add(imgLabel5);
 
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
 
img6 = new ImageIcon("aco.jpg");
imgLabel6 = new JLabel(img6);
imgLabel6.setBounds(-45,0, 340, 100);
game6.add(imgLabel6);
 
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
 
img7 = new ImageIcon("acr.jpg");
imgLabel7 = new JLabel(img7);
imgLabel7.setBounds(-45,0, 340, 100);
game7.add(imgLabel7);
 
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
 
img8 = new ImageIcon("acu.jpg");
imgLabel8 = new JLabel(img8);
imgLabel8.setBounds(-45,0, 340, 100);
game8.add(imgLabel8);
 
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
 
img9 = new ImageIcon("Apex_Legends.jpg");
imgLabel9 = new JLabel(img9);
imgLabel9.setBounds(-45,0, 340, 100);
game9.add(imgLabel9);
 
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
 
img10 = new ImageIcon("batmna.jpg");
imgLabel10 = new JLabel(img10);
imgLabel10.setBounds(-45,0, 340, 100);
game10.add(imgLabel10);
 
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
 
img11 = new ImageIcon("black_squad.jpg");
imgLabel11 = new JLabel(img11);
imgLabel11.setBounds(-45,0, 340, 100);
game11.add(imgLabel11);
 
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
 
img12 = new ImageIcon("cs2.jpg");
imgLabel12 = new JLabel(img12);
imgLabel12.setBounds(-45,0, 340, 100);
game12.add(imgLabel12);
 
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
 
img13 = new ImageIcon("Cyberpunk.jpg");
imgLabel13 = new JLabel(img13);
imgLabel13.setBounds(-45,0, 340, 100);
game13.add(imgLabel13);
 
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
 
img14 = new ImageIcon("deadspace.jpg");
imgLabel14 = new JLabel(img14);
imgLabel14.setBounds(-45,0, 340, 100);
game14.add(imgLabel14);
 
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
 
img15 = new ImageIcon("dishonored.jpg");
imgLabel15 = new JLabel(img15);
imgLabel15.setBounds(-45,0, 340, 100);
game15.add(imgLabel15);
 
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
 
img16 = new ImageIcon("dishonored2.jpg");
imgLabel16 = new JLabel(img16);
imgLabel16.setBounds(-45,0, 340, 100);
game16.add(imgLabel16);
 
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
 
img17 = new ImageIcon("Dishonoreddot.jpg");
imgLabel17 = new JLabel(img17);
imgLabel17.setBounds(-45,0, 340, 100);
game17.add(imgLabel17);
 
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
 
img18 = new ImageIcon("dota.jpg");
imgLabel18 = new JLabel(img18);
imgLabel18.setBounds(-45,0, 340, 100);
game18.add(imgLabel18);
 
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
 
img19 = new ImageIcon("dyinglight.jpg");
imgLabel19 = new JLabel(img19);
imgLabel19.setBounds(-45,0, 340, 100);
game19.add(imgLabel19);
 
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
 
img20 = new ImageIcon("fallout3.jpg");
imgLabel20 = new JLabel(img20);
imgLabel20.setBounds(-45,0, 340, 100);
game20.add(imgLabel20);
 
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
 
img21 = new ImageIcon("fallout4.jpg");
imgLabel21 = new JLabel(img21);
imgLabel21.setBounds(-45,0, 340, 100);
game21.add(imgLabel21);
 
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
 
img22 = new ImageIcon("falloutnv.jpg");
imgLabel22 = new JLabel(img22);
imgLabel22.setBounds(-45,0, 340, 100);
game22.add(imgLabel22);
 
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
 
img23 = new ImageIcon("fc.jpg");
imgLabel23 = new JLabel(img23);
imgLabel23.setBounds(-45,0, 340, 100);
game23.add(imgLabel23);
 
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
 
img24 = new ImageIcon("fc2.jpg");
imgLabel24 = new JLabel(img24);
imgLabel24.setBounds(-45,0, 340, 100);
game24.add(imgLabel24);
 
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
 
img25 = new ImageIcon("fc3.jpg");
imgLabel25 = new JLabel(img25);
imgLabel25.setBounds(-45,0, 340, 100);
game25.add(imgLabel25);
 
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
 
img26 = new ImageIcon("fc4.jpg");
imgLabel26 = new JLabel(img26);
imgLabel26.setBounds(-45,0, 340, 100);
game26.add(imgLabel26);
 
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
 
img27 = new ImageIcon("fc5.jpg");
imgLabel27 = new JLabel(img27);
imgLabel27.setBounds(-45,0, 340, 100);
game27.add(imgLabel27);
 
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
 
img28 = new ImageIcon("fc6.jpg");
imgLabel28 = new JLabel(img28);
imgLabel28.setBounds(-45,0, 340, 100);
game28.add(imgLabel28);
 
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
 
img29 = new ImageIcon("fc24.jpg");
imgLabel29 = new JLabel(img29);
imgLabel29.setBounds(-45,0, 340, 100);
game29.add(imgLabel29);
 
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
 
img30 = new ImageIcon("Hades2.jpg");
imgLabel30 = new JLabel(img30);
imgLabel30.setBounds(-45,0, 340, 100);
game30.add(imgLabel30);
 
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
 
img31 = new ImageIcon("halflife.jpg");
imgLabel31 = new JLabel(img31);
imgLabel31.setBounds(-45,0, 340, 100);
game31.add(imgLabel31);
 
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
 
img32 = new ImageIcon("hitman.jpg");
imgLabel32 = new JLabel(img32);
imgLabel32.setBounds(-45,0, 340, 100);
game32.add(imgLabel32);
 
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
 
img33 = new ImageIcon("hitman2.jpg");
imgLabel33 = new JLabel(img33);
imgLabel33.setBounds(-45,0, 340, 100);
game33.add(imgLabel33);
 
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
 
img34 = new ImageIcon("kindom.jpg");
imgLabel34 = new JLabel(img34);
imgLabel34.setBounds(-45,0, 340, 100);
game34.add(imgLabel34);
 
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
 
img35 = new ImageIcon("lifeisstrange.jpg");
imgLabel35 = new JLabel(img35);
imgLabel35.setBounds(-45,0, 340, 100);
game35.add(imgLabel35);
 
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
 
img36 = new ImageIcon("metro3.jpg");
imgLabel36 = new JLabel(img36);
imgLabel36.setBounds(-45,0, 340, 100);
game36.add(imgLabel36);
 
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
 
img37 = new ImageIcon("metro2033.jpg");
imgLabel37 = new JLabel(img37);
imgLabel37.setBounds(-45,0, 340, 100);
game37.add(imgLabel37);
 
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
 
img38 = new ImageIcon();
imgLabel38 = new JLabel(img38);
imgLabel38.setBounds(-45,0, 340, 100);
game38.add(imgLabel38);
 
//----------------------------------------------------------------------------------------------------
 
buy39 = new JButton("metro2033r.jpg");
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
 
img39 = new ImageIcon("metrolastlight.jpg");
imgLabel39 = new JLabel(img39);
imgLabel39.setBounds(-45,0, 340, 100);
game39.add(imgLabel39);
 
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
 
img40 = new ImageIcon("portal.jpg");
imgLabel40 = new JLabel(img40);
imgLabel40.setBounds(-45,0, 340, 100);
game40.add(imgLabel40);
 
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
 
img41 = new ImageIcon("pubg.jpg");
imgLabel41 = new JLabel(img41);
imgLabel41.setBounds(-45,0, 340, 100);
game41.add(imgLabel41);
 
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
 
img42 = new ImageIcon("R6.jpg");
imgLabel42 = new JLabel(img42);
imgLabel42.setBounds(-45,0, 340, 100);
game42.add(imgLabel42);
 
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
 
img43 = new ImageIcon("re2.jpg");
imgLabel43 = new JLabel(img43);
imgLabel43.setBounds(-45,0, 340, 100);
game43.add(imgLabel43);
 
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
 
img44 = new ImageIcon("re3.jpg");
imgLabel44 = new JLabel(img44);
imgLabel44.setBounds(-45,0, 340, 100);
game44.add(imgLabel44);
 
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
 
img45 = new ImageIcon("re4.jpg");
imgLabel45 = new JLabel(img45);
imgLabel45.setBounds(-45,0, 340, 100);
game45.add(imgLabel45);
 
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
 
img46 = new ImageIcon("RE7.jpg");
imgLabel46 = new JLabel(img46);
imgLabel46.setBounds(-45,0, 340, 100);
game46.add(imgLabel46);
 
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
 
img47 = new ImageIcon("re8.jpg");
imgLabel47 = new JLabel(img47);
imgLabel47.setBounds(-45,0, 340, 100);
game47.add(imgLabel47);
 
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
 
img48 = new ImageIcon("readdead2.jpg");
imgLabel48 = new JLabel(img48);
imgLabel48.setBounds(-45,0, 340, 100);
game48.add(imgLabel48);
 
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
 
img49 = new ImageIcon("rust.jpg");
imgLabel49 = new JLabel(img49);
imgLabel49.setBounds(-45,0, 340, 100);
game49.add(imgLabel49);
 
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
 
img50 = new ImageIcon("warface.jpg");
imgLabel50 = new JLabel(img50);
imgLabel50.setBounds(-45,0, 340, 100);
game50.add(imgLabel50);
 
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
 
img51 = new ImageIcon("witcher2.jpg");
imgLabel51 = new JLabel(img51);
imgLabel51.setBounds(-45,0, 340, 100);
game51.add(imgLabel51);
 
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
 
img52 = new ImageIcon("withcer.jpg");
imgLabel52 = new JLabel(img52);
imgLabel52.setBounds(-45,0, 340, 100);
game52.add(imgLabel52);
 
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
 
img53 = new ImageIcon("wither3.jpg");
imgLabel53 = new JLabel(img53);
imgLabel53.setBounds(-45,0, 340, 100);
game53.add(imgLabel53);
 
//----------------------------------------------------------------------------------------------------

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


public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==library)
        {
            library1 l1=new library1();
            l1.setVisible(true);
            this.setVisible(false);
        }
		
		else if (ae.getSource()==store)
        {
            /*MStore s1=new MStore();
            s1.setVisible(true);
			/*EditProfile s1=new EditProfile();
            s1.setVisible(true);
            this.setVisible(false);*/
        }
		else if(ae.getSource()==storebtn)
		{
			MStore s1=new MStore();
            s1.setVisible(true);
			this.setVisible(false);
		}
        else if (ae.getSource()== buy1)
        {
            menu m1 = new menu (name1,this);
        }
		
}

}