package javaqueations;
import java.util.Scanner;
public class SumTillN {

	public static void SumN(int n) {
		int sum =0;
		for(int i= 1; i<=n ; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		SumN(n);

	}

}
