import java.lang.*;
import java.util.*;
import java.io.*;


public class accoun{

	private String username;
	private String userpass;
	File file;
	fileWriter fwrite;
	public accoun(){}

	public account (String username, String userpass)
	{
		this.userpass = userpass;
		this.username = username;
	}

	public void setUsername (String username)
	{
		this.username = username;
	}
	public void setUserpass (String userpass)
	{
		this.userpass = userpass;
	}
	public String getUserName ()
	{
		return username
	}
	public String getUserpass ()
	{
		return userpass;
	}
	public void addAccount()
	{
		try
		{
			file=new File("./data.txt");
			file.createNewFile();	
			fwrite = new fileWriter(file,true);

			fwrite.write(getUserName()+"\t");
			fwrite.write(getUserpass()+"\n");

			fwrite.flush();
			fwrite.close();





		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}