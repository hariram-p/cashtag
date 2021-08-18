import java.io.*;
import java.util.*;
public class entries
{
	public int balance=0;
	public FileReader reader;
	public FileWriter writer;
	public String entries="";
	boolean havefile=false;
	public entries(String file)
	{
		try{
		reader =new FileReader(file);
		havefile=true;
		}
		catch(Exception E)
		{
			System.out.println("file not found");
			havefile=false;
		}
		if(!havefile)
		{
			System.out.println("running funtion for no files");
		}
	}
	public addentry()
	{
		
	}
	public entries()
	{
		//createfile("entry.ct");
	}
	public void createfile(String file)
	{
		try{
			writer=new FileWriter(file);
			System.out.println("file created successfully");
			havefile=true;
		}
		catch(Exception E)
		{
			System.out.println("cannot create file");
		}
	}
	public static void testing()
	{
		System.out.println("calling entry with file name");
		new entries("hello");
		System.out.println("creating new instance of entry without file name");
		entries e=new entries();
	}
	public static void main(String args[])
	{
		testing();
	}
}