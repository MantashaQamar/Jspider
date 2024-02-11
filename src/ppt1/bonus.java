package ppt1;
import java.util.Scanner;
public class bonus {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Salary");
	double sal = sc.nextDouble();
	System.out.println("Enter Year of Service");
	double yos = sc.nextDouble();
	double netBonus;
	if(yos>5) {
		double bonus = sal*(5.0/100);
		netBonus = bonus +sal;
		System.out.println("Bonus "+ bonus);
		System.out.println("Salary after bonus "+ netBonus);
	}
	}

}
