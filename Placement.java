package javaqueations;

public class Placement {

	public static String Eligible(int scode, int qcode, int yop) {
		if(yop ==2022 || yop == 2023 || yop == 2024) {
			if(scode == 1 || scode == 3 || scode == 4) {
				if(qcode == 1 || qcode == 3 || qcode == 4) {
					
					return "Eligible" ;
					
				}
				else 
					
					return "Stream not Eligible";
				
			}
			
			
					return "Qualification not Eligible";
		}
		
		return "Year of Passout not Eligible";
		
	}
	
	public static void main(String[] args) {
		System.out.println(Eligible(1,1,2029));
		
		
	}

}
