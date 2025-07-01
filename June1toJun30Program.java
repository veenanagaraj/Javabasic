package package2;

import java.util.Date;

public class June1toJun30Program {
	public static void main(String[] args)
	{
		
	Date d1 = new Date() ;
	Date d = new Date (d1.getTime()) ;
	System.out.println(d);
	for (int n = 1 ; n<=30 ; n++)
	{
	
	Date d2 = new Date ((d1.getTime()+(1000l*60*60*24*4) )  +((1000l*60*60*24*(n))  )); 

	String date = d2.toString() ;
	int a = date.length() ;
	String MM = date.substring(4, 7) ;

	String DD = date.substring(8, 10) ;

	String YYYY = date.substring(a-4) ;

	String dateformat = MM.concat(DD).concat(YYYY) ;

	System.out.println(dateformat);

	}

	}
	
}
