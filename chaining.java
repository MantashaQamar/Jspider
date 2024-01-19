package javaqueations;

public class chaining {
	static void disp1(int x) {
		System.out.print("x");
		disp3("45");
		System.out.print(x);
	}
static void disp2(int x) {
	System.out.print(x);
}
static void disp3(String x) {
	System.out.print(x);
	disp2(45);
	System.out.print("x");
}
public static void main (String[]args) {
	disp1(11);
	disp3("45");
}
}
