package Assessment1jsp;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		double bill, amt;
		double surcharge =0;
    Scanner sc = new Scanner(System.in);		
    System.out.println("Enter the units used");
    double unit = sc.nextDouble();
    if(unit<=199) {
    	amt = unit*1.20;
    	bill = amt;
    	if(bill>400 )
    	{
    		surcharge= bill+ (15/100.0)*bill;
    	}
    	
    		//bill!<100
    	System.out.println(bill);

    	System.out.println("After extra charge bill is " + surcharge);
    }
    if(unit>200 && unit<400) {
    	unit = unit -199;
    	amt = (unit*1.50);
    	bill = 1.20+ amt;
    	System.out.println(bill);
    }
    if(unit>400 && unit<600) {
    	unit = unit -400;
    	amt = (unit*1.80);
    	bill = 1.20+1.50+ amt;
    	System.out.println(bill);
	}
    if(unit>600) {
    	unit = unit -600;
    	amt = (unit*2.00);
    	bill = 1.20+1.50+1.80+ amt;
    	System.out.println(bill);

}}}