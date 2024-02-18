// program to add two number using function
import java.util.*;
class Aagrani1{
	public static int addition(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
					int ops;
		do{
			
		System.out.println("Enter any two number.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=addition(a,b);
		System.out.println(sum);
		System.out.println("want to continue(1) or exit(0)");
		ops=sc.nextInt();}
		while(ops==1);{}
		
	}
}