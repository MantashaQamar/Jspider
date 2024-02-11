package ppt1;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		double marks = sc.nextDouble();
		char grade;
		if(marks<25) {
			grade = 'F';
			System.out.println("Grade = " + grade);
		}
		if(marks>25 && marks <45) {
			grade = 'E';
			System.out.println("Grade = " + grade);
		}
		if(marks>45 && marks<50) {
			grade = 'E';
			System.out.println("Grade = " + grade);
		}
		if(marks>50 && marks<60) {
			grade = 'C';
			System.out.println("Grade = " + grade);
		}
		if(marks>60 && marks<80) {
			grade = 'B';
			System.out.println("Grade = " + grade);
		}
		if(marks>80) {
			grade = 'A';
			System.out.println("Grade = " + grade);
		}
	}

}
