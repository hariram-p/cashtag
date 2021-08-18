import java.io.*;
public class entry
{
	public int balance=0;
	public FileReader reader;
	public FileWriter writer;
	public String entries="";
	boolean havefile=true;
	public entry(String file)
	{
		try{
		reader =new FileReader(file);
		}
		catch(Exception E)
		{
			System.out.println("file not found");
			havefile=false;
		}
		if(!havefile)
		{
			try{}
		
		}
	}
	public static void main(String args[])
	{
		new entry("entry.ct");
	}
}