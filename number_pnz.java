package Assessment1jsp;

public class number_pnz {
	public static int numbercheck(int num) {
 // public static int numbercheck(int num) {
	  if(num>0) {
		  return num;
	  }
	  else if(num==0) {
		  return 0;
	  }
	  else
		  return num=num*-1;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(numbercheck(5));
	}

}
