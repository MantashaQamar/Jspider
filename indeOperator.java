package javaqueations;

public class indeOperator {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int sum1=0;
		int sum2 = 0;
		sum1 = a++ + 10/b - 28 + ++b;
	//	sum2 = b*9 -(a++ -a)* a;
		sum2 = 20*9-(a++ -10)*10;
		System.out.println("sum1 is= " + sum1);
		System.out.println("sum2 is= " +sum2);

	}

}
