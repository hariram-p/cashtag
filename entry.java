import java.util.Date;
import java.text.SimpleDateFormat;
public class entry
{
	Date dt;
	int amount;
	String tags[];
	String datetime,record;
	String date,time;
	public void getdateandtime()
	{
		dt=new Date();
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyyHH:mm:ss");
		datetime=f.format(dt);
		date=datetime.substring(0,10);
		time=datetime.substring(10);	
	}
	public entry(int amount)
	{
		this.amount=amount;
		getdateandtime();
		record=amount+","+date+","+time;
		
	}
	public entry(int amount,String ...tags)
	{
		this.amount=amount;
		this.tags=tags;
		getdateandtime();
		record=amount+","+date+","+time;
		for(String s:tags)
		{
			record=record+","+s;
		}
	}
	public static void testing()
	{
		entry et=new entry(100);
		et.getdateandtime();
		System.out.println(et.date);
		System.out.println(et.time);
	}
	public static void testrecordwithout()
	{
		entry et=new entry(100);
		System.out.println(et.record);
	}
	public static void testtags()
	{
		entry et=new entry(100,"hello","how");
		System.out.println(et.record);
	}
	public static void main(String args[])
	{
		testtags();
	}
}