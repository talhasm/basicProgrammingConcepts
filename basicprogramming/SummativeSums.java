package SummativeSums;

// Write a static method that takes in an array of ints, adds them together, and returns the result.
//Call your new method inside a main method and print out the result for the following three example arrays:

//{ 1, 90, -33, -55, 67, -16, 28, -55, 15 }
//{ 999, -60, -77, 14, 160, 301 }
//{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
//140, 150, 160, 170, 180, 190, 200, -99 } 

public class SummativeSums {

	public static void main(String[] args) {

		int [] array1 = new int [] { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int [] array2 = new int [] { 999, -60, -77, 14, 160, 301 };
		int [] array3 = new int [] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
		
		System.out.println("Sum of Array 1: " + addingArrays(array1));
		System.out.println("Sum of Array 2: " + addingArrays(array2));
		System.out.println("Sum of Array 3: " + addingArrays(array3));

	}

	public static int addingArrays(int[] array) {
		int result = 0;
		
		for(int i=0; i < array.length; i++) {
			result = result + array[i];
		}
		
		return result;
	}			
}