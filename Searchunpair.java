package geekster;

public class Searchunpair {
	public static void main(String []args) {
		int a[]= {2,2,5,5,7,7,4,6,6};
		int s=0;
		for(int i=0;i<a.length;i++) {
			s=s^a[i];
		}
		System.out.println("Number is not in pair = "+s);
	}

}
