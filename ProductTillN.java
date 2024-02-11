package javaqueations;
import java.util.Scanner;
public class ProductTillN {
public static void Product(int n) {
	int prod = 1;
	//for(int i= 1; i <=n; i++) {
	
	// solution for factorial as well as product
	for(int i=n; i >=1; i--) {	
		prod = prod *i;
	}
	System.out.println(prod);
}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		Product(n);
	}

}
