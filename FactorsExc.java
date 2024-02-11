package javaqueations;
import java.util.Scanner;
public class FactorsExc {
	
	public static int FactsExc(int n) {
		int count=0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count ++;
			
			}
		}return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(FactsExc(n));
	}

}
