package Assessment1jsp;

public class Largest3 {
	public static int largethree(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largethree(45,2,76));

	}

}
