// proagram to print  product and add condition continue(1) or exit (0)
import java .util.*;

class Aagrani2{
	public static int product(int a,int b){
	int mux =a*b;
	return mux;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input;
		do{
			System.out.println("enter any two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int mux=product(a,b);
			System.out.println("product :"+mux);
			System.out.println("want to continue(1) or exit(0)");
		    input=sc.nextInt();
			}
			while(input==1);
	}
}