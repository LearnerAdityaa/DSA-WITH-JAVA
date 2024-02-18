// program to print all even number till n.
import java.util.*;
class Even{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i;
	for(i=2;i<=n;i++){
		if(i%2==0){
			System.out.println(i);
		}
	}
}
}