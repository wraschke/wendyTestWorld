import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeDoodle {

	public static void main(String[] args) {
		String zuluDate = "2016-09-22T22:50:41Z";
		System.out.println("Zulu date: " + zuluDate);
		
		String year = zuluDate.substring(0, 4);
		String month = zuluDate.substring(5, 7);
		String date = zuluDate.substring(8, 10);
		String hour = zuluDate.substring(11, 13);
		String mins = zuluDate.substring(14, 16);
		String secs = zuluDate.substring(17, 19);
		
		System.out.println("year: " + Integer.parseInt(year));
		System.out.println("month: " + Integer.parseInt(month));
		System.out.println("date: " + Integer.parseInt(date));
		System.out.println("hour: " + Integer.parseInt(hour));
		System.out.println("minutes: " + Integer.parseInt(mins));
		System.out.println("secs: " + Integer.parseInt(secs));
		
		//TimeZone tz = TimeZone.getTimeZone("Etc/GMT+0");
		TimeZone tz = TimeZone.getTimeZone("Etc/Zulu");
		//TimeZone tz = TimeZone.getTimeZone("UTC");
		//Calendar cal = Calendar.getInstance(tz);
		GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(date), 
		        Integer.parseInt(hour), Integer.parseInt(mins), Integer.parseInt(secs));
		cal.setTimeZone(tz);
		//cal.clear();
		/*cal.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date), 
		        Integer.parseInt(hour), Integer.parseInt(mins), Integer.parseInt(secs));*/
		//cal.set(2016, 9, 22, 22, 50, 41);
			
		//System.out.println("cal = " + cal);
		//System.out.println("GMT date in milliseconds since UNIX epoch: " + cal.getTimeInMillis());
		/*String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.println(id);
		}*/
		
		/*Calendar cal2 = new Calendar(tz);
		cal2.setTimeInMillis(1474584641000);
		System.out.println("New calendar created with milliseconds: " + cal2);*/
	}

}