package Classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import Frames.*;



public class useracc
{
	private String username;
	private String userpass;
	private String useremail;
	
	File file;
	FileWriter fwrite;
	
	Scanner sc;
	
	public useracc()
	{
		this.username="";
		this.userpass="";
		this.useremail="";
	}
	
	public useracc(String username,String userpass,String useremail)
	{
		this.username=username;
		this.userpass=userpass;
		this.useremail=useremail;
	}
	
	public void setUserName(String username)
	{
		this.username=username;
	}
	
	public void setUserpass(String userpass)
	{
		this.userpass=userpass;
	}
	
	public void setUserEmail(String useremail)
	{
		this.useremail=useremail;
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public String getUserpass()
	{
		return userpass;
	}
	
	public String getUserEmail()
	{
		return useremail;
	}
	
	
	

	
	public void adduseracc()
	{
		
		
		try
		{
			file=new File(".\\Datas\\userdata.txt");
			file.createNewFile();
			
			fwrite=new FileWriter(file,true);
			
			fwrite.write(getUserName()+"/t");
			fwrite.write(getUserpass()+"/t");
			fwrite.write(getUserEmail()+"/n");
			
			
			fwrite.flush();
			fwrite.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean check(String username,String userpass)
	{
		boolean flag=false;
		file=new File(".\\Datas\\userdata.txt");
		try
		{
			
			
			sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("/t");
				if(value[0].equals(username)&&value[1].equals(userpass))
				{
					flag=true;
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
	}
	/*public static void deleteAccount(String username) {
        String filePath = ".\\Datas\\userdata.txt";
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean userFound = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length >= 7 && parts[0].trim().equals(username)) {
                    userFound = true;
                    continue; // Skip writing this line
                }
                writer.write(line + System.lineSeparator());
            }

            if (!userFound) {
                System.out.println("User not found.");
                return;
            }
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }

        // Rename the temporary file to the original file
        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                System.err.println("Failed to rename the temporary file.");
            }
        } else {
            System.err.println("Failed to delete the original file.");
        }
        JOptionPane.showMessageDialog(null, "Account Deleted. Thanks for using!", "Account Deleted", JOptionPane.PLAIN_MESSAGE);
    }
	*/
}