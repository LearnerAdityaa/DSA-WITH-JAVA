import java.util.*;
class Calculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Float a=sc.nextFloat();
		Float b=sc.nextFloat();
		Float sum=a+b;
		Float diff=a-b;
		Float mux=a*b;
		Float div=a/b;
		Float modulus=a%b;
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mux);
		System.out.println(div);
		System.out.println(modulus);
}}	