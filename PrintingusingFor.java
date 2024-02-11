package javaqueations;
import java.util.Scanner;
public class PrintingusingFor {
	
 //program to print numbers from 1 to n
	
	public static void Print(int n) {
	for(int i=1; i<=n; i++) {
		System.out.println(i);
	}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		Print(n);

	}

}
