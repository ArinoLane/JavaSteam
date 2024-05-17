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
    
	
	public useracc(String username)
    {
        this.username=username;
        
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
            
            fwrite.write(getUserName()+"    ");
            fwrite.write(getUserpass()+"    ");
            fwrite.write(getUserEmail()+"\n");
            
            fwrite.flush();
            fwrite.close();
            
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    
    public boolean check(String username,String userpass,String useremail)
    {
        boolean flag=false;
        file=new File(".\\Datas\\userdata.txt");
        try
        {
            sc=new Scanner(file);
            
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                String[] value=line.split("    ");
                if(value[0].equals(username)&&value[1].equals(userpass)&&value[2].equals(useremail))
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

    

}
