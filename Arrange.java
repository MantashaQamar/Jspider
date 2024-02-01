package Assessment1jsp;

public class Arrange {
	public static int arrangementasc(int a, int b, int c) {
		
		if(a>b) {
			int x=a;
			a=b;
			b=x;
			
		}
		 if(b>c) {
			int y=b;
			b=c;
			c=y;
		
		}
	if(a>b){
			int z=a;
			a=b;
			b=z;
		}
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangementasc(76,564,4));
		
	}

}
