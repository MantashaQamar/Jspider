package javaqueations;
import java.util.Scanner;
public class Factors {

	public static void Fact(int n) {
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
        Fact(n);
        
	}

}
