import java.util.Date;
import java.text.SimpleDateFormat;
public class entry
{
	Date dt;
	String date;
	String time,year,day,hour,min;
	public void getdateandtime()
	{
		dt=new Date();
		SimpleDateFormat f=new SimpleDateFormat("ddMMyyyy");
		date=f.format(dt);
		year="";
	}
	public static void testing()
	{
		entry et=new entry();
		et.getdateandtime();
		System.out.println(et.date);
	}
	public static void main(String args[])
	{
		testing();
	}
}