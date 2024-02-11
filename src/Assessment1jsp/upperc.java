package Assessment1jsp;

public class upperc {
	public static boolean uppercase(char a) {
		if(a>=65 && a<=90) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uppercase('M'));
	}

}
