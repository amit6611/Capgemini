package capegemini;

/*Problem Statement - GIven an arrray of consecutive integers with one number missing.
 * Write a program to find the missing number*/
 
public class MissingNumInConsecArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arri[] = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int sum = (10*11)/2;
		int actualSum = 0;
		for (int i =0; i < arri.length; i++){
		
			actualSum= actualSum + arri[i];
		}
		System.out.println("Missing number is " +(sum- actualSum));
		
	}

}
