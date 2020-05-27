package sel.java.workout;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		/*2. Write a java program to sort it and reverse it.
		Input: int[] array = {5,1,33,79,22,11,45};
		output: 
		Sorted: {1,5,11,22,33,45,79}
		reversed: {79,45,33,22,11,5,1}
*/
		int[] numbers = {5,1,33,79,22,11,45};
		Arrays.sort(numbers);
		System.out.println("Sorted: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
