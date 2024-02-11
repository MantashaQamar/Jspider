package ppt1;
import java.util.Scanner;
public class Discshop {

		    public static void main(String[] args) {
		        double disc;
		        double total;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Quantity");
		        int quantity = sc.nextInt();

		        double cost = quantity * 100;

		        if (cost > 1000) {
		            disc = (10.0 / 100) * cost; // Calculate discount amount
		            total = cost - disc; // Subtract discount from total cost
		            System.out.println("Total cost after 10% discount: " + total);
		        } else {
		            System.out.println("Total cost: " + cost);
		        }
		        
		    }
		}
   