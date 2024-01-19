package javaqueations;

public class sub {
 static void percentage(int m,int p, int c, int b) {
	 float sum = p+c+m+b;
	 float perc = (sum/400)*100;
	 System.out.println(perc);
 }
 public static void main(String[]args) {
	 percentage(90,85,88,98);
 }
}
