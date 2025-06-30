package module1programs;

import java.util.Date;

public class DateClassProgram {

	public static void main(String[] args) 
	{	
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()+(1000l*60*60*24*30));
		String format1=d2.toString();
		System.out.println(d2);
		}
	}
