// program to calculate average of three numbers using function
import java.util.*;
class Average{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println(avg);
	}
}