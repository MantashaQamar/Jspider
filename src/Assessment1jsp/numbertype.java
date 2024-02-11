package Assessment1jsp;
import java.util.Scanner;
public class numbertype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner(System.in);
 System.out.println("Enter a Number");
 int num = sc.nextInt();
   if(num>0) {
	   System.out.println("Positive number");
   }
   else if(num<0) {
	   System.out.println("Negative Number");
   }
   else if(num==0) {
	   System.out.println("Zero");
   }
	}

}
