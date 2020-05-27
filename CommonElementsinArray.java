package sel.java.workout;

public class CommonElementsinArray {

	public static void main(String[] args) {
		/*
		 * 4. Write a java program to print the common numbers in between the two
		 * arrays. int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 }; 
		 * int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		 */
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		System.out.println("Common Elements are: ");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==(array2[j]))
				{System.out.println(array1[i]);
			}
		}
	}

}}