import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class library1 extends JFrame implements  MouseListener, ActionListener
{
    JPanel mainPanel, upperPanel;
    ImageIcon img;
    JLabel imglabel;
    JScrollPane scrollPane;
    JButton userLabel,store,library, left, right;
 
 
    public library1 ()
    {
        super("LIBRARY");
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
        store.addActionListener(this);
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
        library.addActionListener(this);
        upperPanel.add(library);


        mainPanel.add(upperPanel); //this.add jemon sobar last e add korte hoy temni ei panel er mdode jehetu sob dukbe, tai sob kisu dukanor por .add korbo {()}. anekta, ekta bag er modde sob jinis dukanor por cain off kora. Oi jinis gulo nijera add/chain off hobe than amar bag er chain off hobe sobar last e .

        

        this.getContentPane().add(scrollPane);  
          
     }
    public void mouseClicked(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}

    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==store )
        {
        menu m1 = new menu();
        m1.setVisible(true);
        this.setVisible(false);
        }
    }

}