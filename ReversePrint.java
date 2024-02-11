package javaqueations;
import java.util.Scanner;
public class ReversePrint {
   public static void Reverse(int n) {
	   for(int i=n; i>=1; i--) {
			System.out.println(i);
		}
		}
   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		Reverse(n);


	}

}
