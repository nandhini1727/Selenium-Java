package sel.java.workout;

public class ArraysReverse {

	public static void main(String[] args) {
		/*
		 * Input: int[] array = {5,1,33,79,22,11,45}; 
		 * reversed: {79,45,33,22,11,5,1}
		 */
		int[] nos = {5,1,33,79,22,11,45}; 
		System.out.println("Reversed: ");		
		for(int i=nos.length-1; i>=0;i--) {
			System.out.println(nos[i]);
			
		}
	}

}
