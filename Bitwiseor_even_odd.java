package geekster;
import java.util.*;

public class Bitwiseor_even_odd {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		sc.close();
		int num=n|1;
		if(num>n) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
