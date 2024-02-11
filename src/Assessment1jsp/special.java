package Assessment1jsp;

public class special {
 public static boolean specialchar(char a) {
		 if(a>=65 && a<=90) {
				return false;
			}
			else if(a>=97 && a<=122) {
				return false;
			}
			else if(a>=48 && a<=57) {
				return false;
			}
			else {
				return true; 
			}
		 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(specialchar('$'));
	}

}
