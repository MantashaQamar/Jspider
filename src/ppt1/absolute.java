package ppt1;
import java.util.Scanner;
public class absolute {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a number");
		int num = sc.nextInt();
   if(num<0) {
     num = num*(-1);
     System.out.println(num);
	}
   else if(num>0) {
	   System.out.println(num);
   }

}
}
