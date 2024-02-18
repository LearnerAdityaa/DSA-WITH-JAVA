// program to find average of three number using function
import java.util.*;
class Average1{
	public static int Avg(int a,int b,int c){
		int avg=(a+b+c)/3;
		return avg;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    int input;
		do{
		System.out.println("Enter any three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int Average=Avg(a,b,c);
		System.out.println(Average);
		System.out.println("want to continue (1) or exit (0)");
		input=sc.nextInt();
		
		}
		while(input==1);
	}
	
}