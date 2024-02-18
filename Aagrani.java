// program to display input taken by user in  java
import java.util.*;
class Aagrani{
	public static void myname(String name){
		System.out.println(name);
		return;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name?");
		String name=sc.nextLine();
		myname(name);
	}
}