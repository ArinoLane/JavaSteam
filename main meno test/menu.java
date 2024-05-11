import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class menu extends JFrame implements MouseListener, ActionListener
{
    JPanel mainPanel, upperPanel, game0,game00,game1,game2,game3,game4,game5,game6,game7,game8,game9,game10,game11,game12,game13,game14,game15,game16,game17,game18,game19,game20,game21,game22,game23,game24,game25,game26,game27,game28,game29,game30,game30_1, game31,game32,game33,game34,game35,game36,game37,game38,game39,game40,game41,game42,game43,game44,game45,game46,game47,game48,game49,game50,game51,game52,game53,game54;
    ImageIcon img,img0,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,img30_1,img31,img32,img33,img34,img35,img36,img37,img38,img39,img40,img41,img42,img43,img44,img45,img46,img47,img48,img49,img50,img51,img52,img53,img54;
    JLabel imglabel,imgLabel0,imgLabel1,imgLabel2,imgLabel3,imgLabel4,imgLabel5,imgLabel6,imgLabel7,imgLabel8,imgLabel9,imgLabel10,imgLabel11,imgLabel12,imgLabel13,imgLabel14,imgLabel15,imgLabel16,imgLabel17,imgLabel18,imgLabel19,imgLabel20,imgLabel21,imgLabel22,imgLabel23,imgLabel24,imgLabel25,imgLabel26,imgLabel27,imgLabel28,imgLabel29,imgLabel30,imgLabel30_1,imgLabel31,imgLabel32,imgLabel33,imgLabel34,imgLabel35,imgLabel36,imgLabel37,imgLabel38,imgLabel39,imgLabel40,imgLabel41,imgLabel42,imgLabel43,imgLabel44,imgLabel45,imgLabel46,imgLabel47,imgLabel48,imgLabel49,imgLabel50,imgLabel51,imgLabel52,imgLabel53,imgLabel54;
    JScrollPane scrollPane;
    JButton userLabel,store,library, left, right;
 
 
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
        mainPanel.setPreferredSize(new Dimension(1024, 7500)); ///it controls the JPanel that is attached with scrollPane

 
        upperPanel=new JPanel();
        upperPanel.setLayout(null);
        upperPanel.setBackground(new Color(23,26,33));
        upperPanel.setBounds(0,0,1024,100);

        img=new ImageIcon("logo_steam.png");
        imglabel=new JLabel(img);
        imglabel.setBounds(200,25,200,50);
        upperPanel.add(imglabel);

        store = new JButton("STORE");
        store.setBounds(400,40,100,30);
        store.setFont(new Font("Arial", Font.BOLD, 15));
        store.setBackground(Color.GREEN);
        store.setOpaque(false);
        store.setForeground(new Color(177,179,182));
        store.setBorderPainted(false);
        upperPanel.add(store);

        userLabel = new JButton("USERNAME");
        userLabel.setBounds(480,40,150,30);
        userLabel.setFont(new Font("Arial", Font.BOLD, 15));
        userLabel.setBackground(Color.GREEN);
        userLabel.setOpaque(false);
        userLabel.setForeground(new Color(177,179,182));
        userLabel.setBorderPainted(false);
        upperPanel.add(userLabel);

        library = new JButton("LIBRARY");
        library.setBounds(605,40,150,30);
        library.setFont(new Font("Arial", Font.BOLD, 15));
        library.setBackground(Color.GREEN);
        library.setOpaque(false);
        library.setForeground(new Color(177,179,182));
        library.setBorderPainted(false);
        upperPanel.add(library);




        mainPanel.add(upperPanel); //this.add jemon sobar last e add korte hoy temni ei panel er mdode jehetu sob dukbe, tai sob kisu dukanor por .add korbo {()}. anekta, ekta bag er modde sob jinis dukanor por cain off kora. Oi jinis gulo nijera add/chain off hobe than amar bag er chain off hobe sobar last e .



game0 = new JPanel();
game0.setLayout(null);
game0.setBackground(new Color(34,57,75));
game0.setBounds(20,170,960,110);
mainPanel.add(game0);
 
img0 = new ImageIcon("Apex_Legends.jpg");
imgLabel0 = new JLabel(img0);
imgLabel0.setBounds(-32,0, 346, 130);
game0.add(imgLabel0);



game1 = new JPanel();
game1.setLayout(null);
game1.setBackground(new Color(34,57,75));
game1.setBounds(20,300,960,110);
mainPanel.add(game1);
 
img1 = new ImageIcon("cs2.jpg");
imgLabel1 = new JLabel(img1);
imgLabel1.setBounds(-32,0, 346, 130);
game1.add(imgLabel1);
game2 = new JPanel();
game2.setLayout(null);
game2.setBackground(new Color(34,57,75));
game2.setBounds(20,430,960,110);
mainPanel.add(game2);
 
img2 = new ImageIcon("batmna.jpg");
imgLabel2 = new JLabel(img2);
imgLabel2.setBounds(-32,0, 346, 130);
game2.add(imgLabel2);
game3 = new JPanel();
game3.setLayout(null);
game3.setBackground(new Color(34,57,75));
game3.setBounds(20,560,960,110);
mainPanel.add(game3);
 
img3 = new ImageIcon("black_squad.jpg");
imgLabel3 = new JLabel(img3);
imgLabel3.setBounds(-32,0, 346, 130);
game3.add(imgLabel3);
game4 = new JPanel();
game4.setLayout(null);
game4.setBackground(new Color(34,57,75));
game4.setBounds(20,690,960,110);
mainPanel.add(game4);
 
img4 = new ImageIcon("CODMW2.jpg");
imgLabel4 = new JLabel(img4);
imgLabel4.setBounds(-32,0, 346, 130);
game4.add(imgLabel4);
game5 = new JPanel();
game5.setLayout(null);
game5.setBackground(new Color(34,57,75));
game5.setBounds(20,820,960,110);
mainPanel.add(game5);
 
img5 = new ImageIcon("cs2.jpg");
imgLabel5 = new JLabel(img5);
imgLabel5.setBounds(-32,0, 346, 130);
game5.add(imgLabel5);
game6 = new JPanel();
game6.setLayout(null);
game6.setBackground(new Color(34,57,75));
game6.setBounds(20,950,960,110);
mainPanel.add(game6);
 
img6 = new ImageIcon("Cyberpunk.jpg");
imgLabel6 = new JLabel(img6);
imgLabel6.setBounds(-32,0, 346, 130);
game6.add(imgLabel6);
game7 = new JPanel();
game7.setLayout(null);
game7.setBackground(new Color(34,57,75));
game7.setBounds(20,1080,960,110);
mainPanel.add(game7);
 
img7 = new ImageIcon("deadisland.jpg");
imgLabel7 = new JLabel(img7);
imgLabel7.setBounds(-32,0, 346, 130);
game7.add(imgLabel7);
game8 = new JPanel();
game8.setLayout(null);
game8.setBackground(new Color(34,57,75));
game8.setBounds(20,1210,960,110);
mainPanel.add(game8);
 
img8 = new ImageIcon("deadspace.jpg");
imgLabel8 = new JLabel(img8);
imgLabel8.setBounds(-32,0, 346, 130);
game8.add(imgLabel8);
game9 = new JPanel();
game9.setLayout(null);
game9.setBackground(new Color(34,57,75));
game9.setBounds(20,1340,960,110);
mainPanel.add(game9);
 
img9 = new ImageIcon("ac.jpg");
imgLabel9 = new JLabel(img9);
imgLabel9.setBounds(-32,0, 346, 130);
game9.add(imgLabel9);
game10 = new JPanel();
game10.setLayout(null);
game10.setBackground(new Color(34,57,75));
game10.setBounds(20,1470,960,110);
mainPanel.add(game10);
 
img10 = new ImageIcon("ac2.jpg");
imgLabel10 = new JLabel(img10);
imgLabel10.setBounds(-32,0, 346, 130);
game10.add(imgLabel10);
game11 = new JPanel();
game11.setLayout(null);
game11.setBackground(new Color(34,57,75));
game11.setBounds(20,1600,960,110);
mainPanel.add(game11);
 
img11 = new ImageIcon("ac2b.jpg");
imgLabel11 = new JLabel(img11);
imgLabel11.setBounds(-32,0, 346, 130);
game11.add(imgLabel11);
game12 = new JPanel();
game12.setLayout(null);
game12.setBackground(new Color(34,57,75));
game12.setBounds(20,1730,960,110);
mainPanel.add(game12);
 
img12 = new ImageIcon("ac2r.jpg");
imgLabel12 = new JLabel(img12);
imgLabel12.setBounds(-32,0, 346, 130);
game12.add(imgLabel12);
game13 = new JPanel();
game13.setLayout(null);
game13.setBackground(new Color(34,57,75));
game13.setBounds(20,1860,960,110);
mainPanel.add(game13);
 
img13 = new ImageIcon("ac3.jpg");
imgLabel13 = new JLabel(img13);
imgLabel13.setBounds(-32,0, 346, 130);
game13.add(imgLabel13);
game14 = new JPanel();
game14.setLayout(null);
game14.setBackground(new Color(34,57,75));
game14.setBounds(20,1990,960,110);
mainPanel.add(game14);
 
img14 = new ImageIcon("ac4.jpg");
imgLabel14 = new JLabel(img14);
imgLabel14.setBounds(-32,0, 346, 130);
game14.add(imgLabel14);
game15 = new JPanel();
game15.setLayout(null);
game15.setBackground(new Color(34,57,75));
game15.setBounds(20,2120,960,110);
mainPanel.add(game15);
 
img15 = new ImageIcon("aco.jpg");
imgLabel15 = new JLabel(img15);
imgLabel15.setBounds(-32,0, 346, 130);
game15.add(imgLabel15);
game16 = new JPanel();
game16.setLayout(null);
game16.setBackground(new Color(34,57,75));
game16.setBounds(20,2250,960,110);
mainPanel.add(game16);
 
img16 = new ImageIcon("acr.jpg");
imgLabel16 = new JLabel(img16);
imgLabel16.setBounds(-32,0, 346, 130);
game16.add(imgLabel16);
game17 = new JPanel();
game17.setLayout(null);
game17.setBackground(new Color(34,57,75));
game17.setBounds(20,2380,960,110);
mainPanel.add(game17);
 
img17 = new ImageIcon("acu.jpg");
imgLabel17 = new JLabel(img17);
imgLabel17.setBounds(-32,0, 346, 130);
game17.add(imgLabel17);
game18 = new JPanel();
game18.setLayout(null);
game18.setBackground(new Color(34,57,75));
game18.setBounds(20,2510,960,110);
mainPanel.add(game18);
 
img18 = new ImageIcon("dishonored.jpg");
imgLabel18 = new JLabel(img18);
imgLabel18.setBounds(-32,0, 346, 130);
game18.add(imgLabel18);
game19 = new JPanel();
game19.setLayout(null);
game19.setBackground(new Color(34,57,75));
game19.setBounds(20,2640,960,110);
mainPanel.add(game19);
 
img19 = new ImageIcon("dishonored2.jpg");
imgLabel19 = new JLabel(img19);
imgLabel19.setBounds(-32,0, 346, 130);
game19.add(imgLabel19);
game20 = new JPanel();
game20.setLayout(null);
game20.setBackground(new Color(34,57,75));
game20.setBounds(20,2770,960,110);
mainPanel.add(game20);
 
img20 = new ImageIcon("Dishonoreddot.jpg");
imgLabel20 = new JLabel(img20);
imgLabel20.setBounds(-32,0, 346, 130);
game20.add(imgLabel20);
game21 = new JPanel();
game21.setLayout(null);
game21.setBackground(new Color(34,57,75));
game21.setBounds(20,2900,960,110);
mainPanel.add(game21);
 
img21 = new ImageIcon("dota.jpg");
imgLabel21 = new JLabel(img21);
imgLabel21.setBounds(-32,0, 346, 130);
game21.add(imgLabel21);
game22 = new JPanel();
game22.setLayout(null);
game22.setBackground(new Color(34,57,75));
game22.setBounds(20,3030,960,110);
mainPanel.add(game22);
 
img22 = new ImageIcon("dyinglight.jpg");
imgLabel22 = new JLabel(img22);
imgLabel22.setBounds(-32,0, 346, 130);
game22.add(imgLabel22);
game23 = new JPanel();
game23.setLayout(null);
game23.setBackground(new Color(34,57,75));
game23.setBounds(20,3160,960,110);
mainPanel.add(game23);
 
img23 = new ImageIcon("fallout3.jpg");
imgLabel23 = new JLabel(img23);
imgLabel23.setBounds(-32,0, 346, 130);
game23.add(imgLabel23);
game24 = new JPanel();
game24.setLayout(null);
game24.setBackground(new Color(34,57,75));
game24.setBounds(20,3290,960,110);
mainPanel.add(game24);
 
img24 = new ImageIcon("fallout4.jpg");
imgLabel24 = new JLabel(img24);
imgLabel24.setBounds(-32,0, 346, 130);
game24.add(imgLabel24);
game25 = new JPanel();
game25.setLayout(null);
game25.setBackground(new Color(34,57,75));
game25.setBounds(20,3420,960,110);
mainPanel.add(game25);
 
img25 = new ImageIcon("falloutnv.jpg");
imgLabel25 = new JLabel(img25);
imgLabel25.setBounds(-32,0, 346, 130);
game25.add(imgLabel25);
game26 = new JPanel();
game26.setLayout(null);
game26.setBackground(new Color(34,57,75));
game26.setBounds(20,3550,960,110);
mainPanel.add(game26);
 
img26 = new ImageIcon("fc.jpg");
imgLabel26 = new JLabel(img26);
imgLabel26.setBounds(-32,0, 346, 130);
game26.add(imgLabel26);
game27 = new JPanel();
game27.setLayout(null);
game27.setBackground(new Color(34,57,75));
game27.setBounds(20,3680,960,110);
mainPanel.add(game27);
 
img27 = new ImageIcon("fc2.jpg");
imgLabel27 = new JLabel(img27);
imgLabel27.setBounds(-32,0, 346, 130);
game27.add(imgLabel27);
game28 = new JPanel();
game28.setLayout(null);
game28.setBackground(new Color(34,57,75));
game28.setBounds(20,3810,960,110);
mainPanel.add(game28);
 
img28 = new ImageIcon("fc3.jpg");
imgLabel28 = new JLabel(img28);
imgLabel28.setBounds(-32,0, 346, 130);
game28.add(imgLabel28);
game29 = new JPanel();
game29.setLayout(null);
game29.setBackground(new Color(34,57,75));
game29.setBounds(20,3940,960,110);
mainPanel.add(game29);
 
img29 = new ImageIcon("fc4.jpg");
imgLabel29 = new JLabel(img29);
imgLabel29.setBounds(-32,0, 346, 130);
game29.add(imgLabel29);
game30 = new JPanel();
game30.setLayout(null);
game30.setBackground(new Color(34,57,75));
game30.setBounds(20,4070,960,110);
mainPanel.add(game30);



 
img30 = new ImageIcon("fc5.jpg");
imgLabel30 = new JLabel(img30);
imgLabel30.setBounds(-32,0, 346, 130);
game30.add(imgLabel30);
game31 = new JPanel();
game31.setLayout(null);
game31.setBackground(new Color(34,57,75));
game31.setBounds(20,4330,960,110);
mainPanel.add(game31);


game30_1 = new JPanel();
game30_1.setLayout(null);
game30_1.setBackground(new Color(34,57,75));
game30_1.setBounds(20,4200,960,110);
mainPanel.add(game30_1);
 
img30_1 = new ImageIcon("lifeisstrange.jpg");
imgLabel30_1 = new JLabel(img30_1);
imgLabel30_1.setBounds(-32,0, 346, 130);
game30_1.add(imgLabel30_1);



 
img31 = new ImageIcon("fc24.jpg");
imgLabel31 = new JLabel(img31);
imgLabel31.setBounds(-32,0, 346, 130);
game31.add(imgLabel31);
game32 = new JPanel();
game32.setLayout(null);
game32.setBackground(new Color(34,57,75));
game32.setBounds(20,4460,960,110);
mainPanel.add(game32);
 
img32 = new ImageIcon("forest.jpg");
imgLabel32 = new JLabel(img32);
imgLabel32.setBounds(-32,0, 346, 130);
game32.add(imgLabel32);
game33 = new JPanel();
game33.setLayout(null);
game33.setBackground(new Color(34,57,75));
game33.setBounds(20,4590,960,110);
mainPanel.add(game33);
 
img33 = new ImageIcon("withcer.jpg");
imgLabel33 = new JLabel(img33);
imgLabel33.setBounds(-32,0, 346, 130);
game33.add(imgLabel33);
game34 = new JPanel();
game34.setLayout(null);
game34.setBackground(new Color(34,57,75));
game34.setBounds(20,4720,960,110);
mainPanel.add(game34);
 
img34 = new ImageIcon("halflife.jpg");
imgLabel34 = new JLabel(img34);
imgLabel34.setBounds(-32,0, 346, 130);
game34.add(imgLabel34);
game35 = new JPanel();
game35.setLayout(null);
game35.setBackground(new Color(34,57,75));
game35.setBounds(20,4850,960,110);
mainPanel.add(game35);
 
img35 = new ImageIcon("HELLDIVERS.jpg");
imgLabel35 = new JLabel(img35);
imgLabel35.setBounds(-32,0, 346, 130);
game35.add(imgLabel35);
game36 = new JPanel();
game36.setLayout(null);
game36.setBackground(new Color(34,57,75));
game36.setBounds(20,4980,960,110);
mainPanel.add(game36);
 
img36 = new ImageIcon("hitman.jpg");
imgLabel36 = new JLabel(img36);
imgLabel36.setBounds(-32,0, 346, 130);
game36.add(imgLabel36);
game37 = new JPanel();
game37.setLayout(null);
game37.setBackground(new Color(34,57,75));
game37.setBounds(20,5110,960,110);
mainPanel.add(game37);
 
img37 = new ImageIcon("rust.jpg");
imgLabel37 = new JLabel(img37);
imgLabel37.setBounds(-32,0, 346, 130);
game37.add(imgLabel37);
game38 = new JPanel();
game38.setLayout(null);
game38.setBackground(new Color(34,57,75));
game38.setBounds(20,5240,960,110);
mainPanel.add(game38);
 
img38 = new ImageIcon("skyrim.jpg");
imgLabel38 = new JLabel(img38);
imgLabel38.setBounds(-32,0, 346, 130);
game38.add(imgLabel38);
game39 = new JPanel();
game39.setLayout(null);
game39.setBackground(new Color(34,57,75));
game39.setBounds(20,5370,960,110);
mainPanel.add(game39);
 
img39 = new ImageIcon("warface.jpg");
imgLabel39 = new JLabel(img39);
imgLabel39.setBounds(-32,0, 346, 130);
game39.add(imgLabel39);
game40 = new JPanel();
game40.setLayout(null);
game40.setBackground(new Color(34,57,75));
game40.setBounds(20,5500,960,110);
mainPanel.add(game40);
 
img40 = new ImageIcon("metro3.jpg");
imgLabel40 = new JLabel(img40);
imgLabel40.setBounds(-32,0, 346, 130);
game40.add(imgLabel40);
game41 = new JPanel();
game41.setLayout(null);
game41.setBackground(new Color(34,57,75));
game41.setBounds(20,5630,960,110);
mainPanel.add(game41);
 
img41 = new ImageIcon("metro2033.jpg");
imgLabel41 = new JLabel(img41);
imgLabel41.setBounds(-32,0, 346, 130);
game41.add(imgLabel41);
game42 = new JPanel();
game42.setLayout(null);
game42.setBackground(new Color(34,57,75));
game42.setBounds(20,5760,960,110);
mainPanel.add(game42);
 
img42 = new ImageIcon("metro2033r.jpg");
imgLabel42 = new JLabel(img42);
imgLabel42.setBounds(-32,0, 346, 130);
game42.add(imgLabel42);
game43 = new JPanel();
game43.setLayout(null);
game43.setBackground(new Color(34,57,75));
game43.setBounds(20,5890,960,110);
mainPanel.add(game43);
 
img43 = new ImageIcon("metrolastlight.jpg");
imgLabel43 = new JLabel(img43);
imgLabel43.setBounds(-32,0, 346, 130);
game43.add(imgLabel43);
game44 = new JPanel();
game44.setLayout(null);
game44.setBackground(new Color(34,57,75));
game44.setBounds(20,6020,960,110);
mainPanel.add(game44);
 
img44 = new ImageIcon("paladin.jpg");
imgLabel44 = new JLabel(img44);
imgLabel44.setBounds(-32,0, 346, 130);
game44.add(imgLabel44);
game45 = new JPanel();
game45.setLayout(null);
game45.setBackground(new Color(34,57,75));
game45.setBounds(20,6150,960,110);
mainPanel.add(game45);
 
img45 = new ImageIcon("payday.jpg");
imgLabel45 = new JLabel(img45);
imgLabel45.setBounds(-32,0, 346, 130);
game45.add(imgLabel45);
game46 = new JPanel();
game46.setLayout(null);
game46.setBackground(new Color(34,57,75));
game46.setBounds(20,6280,960,110);
mainPanel.add(game46);
 
img46 = new ImageIcon("portal.jpg");
imgLabel46 = new JLabel(img46);
imgLabel46.setBounds(-32,0, 346, 130);
game46.add(imgLabel46);
game47 = new JPanel();
game47.setLayout(null);
game47.setBackground(new Color(34,57,75));
game47.setBounds(20,6410,960,110);
mainPanel.add(game47);
 
img47 = new ImageIcon("pubg.jpg");
imgLabel47 = new JLabel(img47);
imgLabel47.setBounds(-32,0, 346, 130);
game47.add(imgLabel47);
game48 = new JPanel();
game48.setLayout(null);
game48.setBackground(new Color(34,57,75));
game48.setBounds(20,6540,960,110);
mainPanel.add(game48);
 
img48 = new ImageIcon("R6.jpg");
imgLabel48 = new JLabel(img48);
imgLabel48.setBounds(-32,0, 346, 130);
game48.add(imgLabel48);
game49 = new JPanel();
game49.setLayout(null);
game49.setBackground(new Color(34,57,75));
game49.setBounds(20,6670,960,110);
mainPanel.add(game49);
 
img49 = new ImageIcon("re2.jpg");
imgLabel49 = new JLabel(img49);
imgLabel49.setBounds(-32,0, 346, 130);
game49.add(imgLabel49);
game50 = new JPanel();
game50.setLayout(null);
game50.setBackground(new Color(34,57,75));
game50.setBounds(20,6800,960,110);
mainPanel.add(game50);
 
img50 = new ImageIcon("re3.jpg");
imgLabel50 = new JLabel(img50);
imgLabel50.setBounds(-32,0, 346, 130);
game50.add(imgLabel50);
game51 = new JPanel();
game51.setLayout(null);
game51.setBackground(new Color(34,57,75));
game51.setBounds(20,6930,960,110);
mainPanel.add(game51);
 
img51 = new ImageIcon("re4.jpg");
imgLabel51 = new JLabel(img51);
imgLabel51.setBounds(-32,0, 346, 130);
game51.add(imgLabel51);
game52 = new JPanel();
game52.setLayout(null);
game52.setBackground(new Color(34,57,75));
game52.setBounds(20,7060,960,110);
mainPanel.add(game52);
 
img52 = new ImageIcon("RE7.jpg");
imgLabel52 = new JLabel(img52);
imgLabel52.setBounds(-32,0, 346, 130);
game52.add(imgLabel52);
game53 = new JPanel();
game53.setLayout(null);
game53.setBackground(new Color(34,57,75));
game53.setBounds(20,7190,960,110);
mainPanel.add(game53);
 
img53 = new ImageIcon("re8.jpg");
imgLabel53 = new JLabel(img53);
imgLabel53.setBounds(-32,0, 346, 130);
game53.add(imgLabel53);
game54 = new JPanel();
game54.setLayout(null);
game54.setBackground(new Color(34,57,75));
game54.setBounds(20,7320,960,110);
mainPanel.add(game54);
 
img54 = new ImageIcon("wither3.jpg");
imgLabel54 = new JLabel(img54);
imgLabel54.setBounds(-32,0, 346, 130);
game54.add(imgLabel54);



// left = new JButton("<");
// left.setBounds(605,40,150,30);



        this.getContentPane().add(scrollPane);  
          
     }

    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}

    public void actionPerformed(ActionEvent ae){}


}