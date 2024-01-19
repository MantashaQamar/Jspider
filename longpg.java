package javaqueations;

public class longpg {
public static void main(String[] args)
{
	int i;
	// this is one way, when we define the size of the array and then input the values
//	int arr[] = new int[10];
//  arr[0] = 7;
//	arr[1] = 3;
//	arr[2] = 0;
//	arr[3] = 2;
//	arr[4] = 6;
//	arr[5] = 9;
//	arr[6] = 4;
//	arr[7] = 1;
//	arr[8] = 5;
//	arr[9] = 8;
	
	
	
//other way, without defining the size of the value
	int arr[] = {7,3,1,2,8,6,5,9,3,4};
	//printing in forward direction
	for( i =0; i<= arr.length-1; i++) {
		System.out.println(arr[i]);


	}
	//printing in backward direction
	
    System.out.println();
	for(i= arr.length; i<= 0; i--) {
    System.out.println(arr[i]);
	}
  }
}



