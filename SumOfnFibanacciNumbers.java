package javaqueations;
import java.util.Scanner;
public class SumOfnFibanacciNumbers {

	public static long add(int n) {
		long n1=1;
		long n2=1;
		if(n==1) {
			return n1;
		}
		if(n==2) {
		
		return n1+n2;
	}
		long sum = n1+n2;
		for(int i=3; i<=n; i++) {
			long n3 = n1+n2;
			sum = sum+n3;
			n1=n2;
			n2=n3;
		}
		return sum; }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer Number");
		int n = sc.nextInt();
       System.out.println(add(n));

	}

}
