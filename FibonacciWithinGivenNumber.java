package javaqueations;
import java.util.Scanner;
public class FibonacciWithinGivenNumber {

	public static void print(int n) {
		int n1=1;
		int n2=1;
		if(n==1) {
			System.out.println(n1);
		}
		else if(n==2) {
			System.out.print(n1+" "+n2);
		}
		else {
			System.out.print(n1+" "+n2);
			for(int i = 1; i<=n; i++) {
				int n3= n1+n2;
				if(n3<=n) {
					System.out.print(" "+ n3);
					n1=n2;
					n2=n3;
				}
				else break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer Number");
		int n = sc.nextInt();
        print(n);
	}

}
