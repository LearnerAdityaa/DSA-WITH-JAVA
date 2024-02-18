import java.util.*;
class Aditya{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input;
		do{
			System.out.println("Enter the sutdents marks");
			int marks=sc.nextInt();
			if(marks>=90){
				System.out.println(marks +"grade is A+");
			}
			else if(marks>=80){
				System.out.println("");
			}
			else if(marks>=70){
				System.out.println(marks +"grade is A");
				
			}
			else if(marks>=60){
				System.out.println(marks +"grade is B+");
				
			}else if(marks>=50){
				System.out.println("this is good as well");
				
			}
			else{
				System.out.println("invalid");
			}
			System.out.println("want to continue or not if yes(1)or no(0)");
		
		input=sc.nextInt();
		}
		
		while(input==1);
}}