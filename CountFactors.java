package javaqueations;
import java.util.Scanner;
public class CountFactors {
public static int CountFact(int n){
	int count=0;

	for(int i= 1;i<=n; i++) {
		if(n%i==0) {
			count++;
			
		}
	}return count;
	
}
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
       System.out.println(CountFact(n));

	}

}
