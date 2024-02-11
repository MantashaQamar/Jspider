package javaqueations;
import java.util.Scanner;
public class SumOfEven {
public static void EvenSum(int n) {
	int sum =0;
	
	for(int i=1; i<=n; i++) {
		if(i%2==0) {

			sum = sum+i;	
		}
       }

	 System.out.println(sum);
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		EvenSum(n);
		
	}

}
