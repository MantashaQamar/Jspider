package javaqueations;
import java.util.Scanner;
public class SumOfFactors {
	
	public static int SumFact(int n){
		int sum=0;
		for(int i =1; i<=n; i++) {
			if(n%i==0) {
				sum = sum+i;
			}
			
		}return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
      System.out.println(SumFact(n));
	}

}
