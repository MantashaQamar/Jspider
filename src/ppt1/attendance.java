package ppt1;
import java.util.Scanner;
public class attendance {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of Classes held");
		int ch = sc.nextInt();
        System.out.println("Enter the number of classes attended");
        int ca = sc.nextInt();
    double attper = (ca/ch)*100;
    if(attper>95) {
    	System.out.println("Percentage of class attended " + attper +"%");
    	System.out.println("Student is allowed to sir in class");
    }
    else {
    	System.out.println("Student is NOT ALLOWED to sir in class");
    }
 


	}

}
