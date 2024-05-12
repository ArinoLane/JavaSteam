import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
//import Frames.*;


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
	
	public useracc(String username,String userpass,String useremail)//username=s1,userpass=s2
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
	
	public String getUserEmail()
	{
		return useremail;
	}
	
	
	
	public String getUserpass()
	{
		return userpass;
	}
	
	public void adduseracc()
	{
		
		
		try
		{
			file=new File("./userdata.txt");
			file.createNewFile();
			
			fwrite=new FileWriter(file,true);
			
			fwrite.write(getUserName()+"\t");
			fwrite.write(getUserpass()+"\t");
			fwrite.write(getUserEmail()+"\t");
			
			
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
		file=new File("./userdata.txt");
		try
		{
			
			
			sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
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
	
}