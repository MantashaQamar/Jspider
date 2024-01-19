package javaqueations;

public class Fb {
	static void login(String e, String p) {
		System.out.println("Login done via email");
	//	e = "mantashaqamar333@gmail.com";
		//p = "Mantashafb";
		System.out.println(e);
		System.out.println(p);
	}
	static void login(int ph, String p) {
		System.out.println("Login done via phone number");
	//	ph = 7302065986d;
		//p = "Mantashafb";
		System.out.println(ph);
		System.out.println(p);
}
	public static void main(String[]srgs) {
		login("mantashaqamar333@gmail.com" , "Mantashafb" );
		login(73020659 , "Mantashafb");
	}
}