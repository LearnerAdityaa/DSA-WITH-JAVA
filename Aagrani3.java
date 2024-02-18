// program to find factorial and include codintion continue(1) or exit(0)
import java.util.*;
class Aagrani3 {
    public static void factorial(int n){
    int factorial = 1;
     for(int i=n; i>=1; i--) {
           factorial = factorial * i;
       }

    System.out.println(factorial);
       return;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
	   int input;
	   do{
		   System.out.println("Enter any two number");
       int n = sc.nextInt();
	   factorial(n);
	   System.out.println("want to continue(1) or exit(0)");
	   input=sc.nextInt();}
	   while(input==1);
   }
}
