package src.com.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateandTimeDemo {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	System.out.println(date);
	
	LocalDate tmrw=date.plusDays(1);
	System.out.println(tmrw);
	
	LocalDate nextweek=date.plusWeeks(1);
	System.out.println(nextweek);
	
	LocalDate nextMonth=date.plusMonths(1);
	System.out.println(nextMonth);
	
	System.out.println(date.getYear());
	System.out.println(date.getMonth());
	System.out.println(date.getDayOfMonth());
	System.out.println(date.getDayOfWeek());
	
	//Time
	LocalTime time=LocalTime.now();
	System.out.println(time);
	System.out.println("Hours : "+time.getHour());
	System.out.println("Mints : "+time.getMinute());
	System.out.println("Seconds : "+time.getSecond());
	System.out.println("Nano Seconds : "+time.getNano());
	
	//set date and time
	LocalDate sd=date.of(1995, 06, 04);
	System.out.println(sd);
	LocalTime st=time.of(12, 12,12,12);
	System.out.println(st);
	
	LocalDate dt=LocalDate.of(1989, 04,05);
	
	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-mm-yyyy");
	System.out.println(f);
	
//	String r=dt.format(f);
//	System.out.println(r);
	
	LocalDate bdy=LocalDate.of(2005, 8, 28);
	LocalDate tdy=LocalDate.now();
	
	Period period=Period.between(bdy, tdy);
	System.out.println(period.getYears()+"-"+period.getMonths	()+"-"+period.getDays());
	
	ZonedDateTime india=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	System.out.println(india);
	
	ZonedDateTime usa=ZonedDateTime.now(ZoneId.of("America/New_York"));
	System.out.println(usa);
	
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a year Number : ");
	int n=s.nextInt();
	
	
}
}
