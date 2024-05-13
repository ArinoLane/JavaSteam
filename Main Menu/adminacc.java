import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
//import Frames.*;


public class adminacc
{
	private String adminname;
	private String adminpass;
	
	File file;
	FileWriter fwrite;
	
	Scanner sc;
	
	public adminacc()
	{
		this.adminname="";
		this.adminpass="";
	}
	
	public adminacc(String adminname,String adminpass)
	{
		this.adminname=adminname;
		this.adminpass=adminpass;
	}
	
	public void setAdminName(String adminname)
	{
		this.adminname=adminname;
	}
	
	public void setAdminpass(String adminpass)
	{
		this.adminpass=adminpass;
	}
	
	public String getAdminName()
	{
		return adminname;
	}
	
	
	public String getAdminpass()
	{
		return adminpass;
	}
	
	
	public boolean checkad(String adminname,String adminpass)
	{
		boolean flag=false;
		file=new File("./admindata.txt");
		try
		{
			
			
			sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(adminname)&&value[1].equals(adminpass))
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