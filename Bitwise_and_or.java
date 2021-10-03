package geekster;
import java.util.*;

public class Bitwise_and_or {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1");
	int a=sc.nextInt();
	System.out.println("Enter num2");
	int b=sc.nextInt();
	sc.close();
	int c=a|b;
	int d=a&b;
	System.out.println("Bitwise or= "+c);
	System.out.println("Bitwise and= "+d);
	}
}
