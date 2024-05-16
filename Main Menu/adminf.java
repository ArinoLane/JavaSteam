import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adminf extends JFrame implements MouseListener, ActionListener 
{
	ImageIcon img;
	JLabel userLabel,namelabel, passLabel,imglabel,emailabel,populabel ;
	JTextField namefield,userTF,emailTF ;
	JPasswordField passPF;
	JButton InsertBtn, BackBtn,DELETEBtn,backbtn;
	JScrollPane scroll;
    JTable table;
	JPanel panel,upperPanel;
	Color myColor;
	Font myFont;
	
	
	 private String[] column = { "User Name", "Password",};
    private String[] rows = new String[3];

	public adminf()
	{
		super("Admin Regiom");
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
		 
		 this.add(panel);
		 
		 
		 table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);
        table.getColumnModel().getColumn(5).setPreferredWidth(220);
		 
		 
		 scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 578, 300);
        scroll.setBackground(Color.WHITE);
       panel.add(scroll);
		 
		 String file = "data.txt";
        String temp = "temp.txt";
		 
		 try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(12); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(11); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Email
                  
                    model.addRow(rows);
                }
            }

        } 
        catch (Exception ex) 
        {
            return;
        }
    }

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae)
	{
        if(ae.getSource()==btn1)
        {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);

         }

       else if(ae.getSource()==btn2)
       {

                if (table.getSelectionModel().isSelectionEmpty()) 
                {
                    JOptionPane.showMessageDialog(null, "Please select a user to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				else 
                {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try 
                    {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } 
                    catch (Exception ex) 
                    {
                        return;
                    }

                    try 
                    {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } 
                    catch (Exception ex) 
                    {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    UserData frame = new UserData();
                    frame.setVisible(true);
                }

            }
	}  

}   

      
        