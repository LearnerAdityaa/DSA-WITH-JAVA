// program to calculate circumference of circle
import java.util.*;
class Circum{
	public static double circumference(double r){
		double Pi=3.14;
		 double c=2*Pi*r;
		return c;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double r=sc.nextDouble();
		double circumference=circumference(r);
		System.out.println(circumference);
	}
}