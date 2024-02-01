package Assessment1jsp;

public class casecheck {
	public static String casecheck(char a) {
		if(a>=65 && a<=90) {
			return "UPPER CASE";
		}
		else if(a>=97 && a<=122) {
			return "lower case";
		}
		else if(a>=48 && a<=57) {
			return "Numeric";
		}
		else {
			return "Special Character";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(casecheck('m'));
	}

}
