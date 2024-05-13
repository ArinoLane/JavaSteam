/*import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
//import Frames.*;


public class editnameacc
{
	private String username;
	
	
	File file;
	FileWriter fwrite;
	
	Scanner sc;
	
	public editnameacc()
	{
		this.username="";
		
	}
	
	public editnameacc(String username)
	{
		this.username=username;
	}
	
	public void seteditname(String username)
	{
		this.username=username;
	}
	
	
	public String getEditName()
	{
		return username;
	}
	
	
	
	public void editname()
	{
		
		
		try
		{
			file=new File("./userdata.txt");
			file.createNewFile();
			
			fwrite=new FileWriter(file,true);
			
			fwrite.write(getEditName()+"\t");
			
			
			fwrite.flush();
			fwrite.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean checkname(String username)
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
	
	
	public void deleteAcc(String username)
	            {
		
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==username)
			{
				acc[i]=null;
				flag=1;
				break;
			}
			username.deleteAcc()
		}
	
}