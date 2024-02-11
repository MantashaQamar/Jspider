package ppt1;
import java.util.Scanner;
public class electricity {

	public static void main(String[] args) {
		double amt;
		double totalamt;
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the units used");
	double unit = sc.nextDouble();
	if(unit>0 && unit<100) {
		amt = 0*unit;
		totalamt = amt;
		System.out.println("Electricity Bill = " + totalamt);
	}
	else if(unit>100 && unit<200) {
		unit = unit-100;
		amt = unit*5;
		totalamt = 0+amt;
		System.out.println("Electricity Bill = " + totalamt);
	}
	else if(unit>200) {
		unit = unit-200;
		amt = unit*10;
		totalamt = 0+ 500+ amt;
		System.out.println("Electricity Bill = " + totalamt);
	}
	}

}
