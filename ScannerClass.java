package module1programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		
		int i,a=50,b=25;
		int r=10;
		double areaofcircle=Math.PI*Math.random()*r;
		double r1=s1.nextDouble();
		double areaofsq=Math.random()*r;
		double areaofrectangle=a*b;
		double areoftriangle=0.5*a*b;
		for(i=0;i<50;i++)
		System.out.println("the area of circle is:"+areaofcircle);
		System.out.println("the area of square is:"+areaofsq);
		System.out.println("the area of rectangle is:"+areaofrectangle);
		System.out.println("the area of triangle is:"+areoftriangle);
		
	}

}