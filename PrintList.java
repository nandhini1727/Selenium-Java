package sel.java.workout;

import java.util.ArrayList;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {
		/*
		 * 2. Write a java program to print the list (Need 3 different answers) Input:
		 * [B,u,g,a,t,t,i, ,C,h,i,r,o,n]
		 */		String str = "Bugatti Chiron";
		List<Character> listval = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) {
			listval.add(str.charAt(i));
		}
		for (int i = 0; i < listval.size(); i++) {
			System.out.print(listval.get(i));
		}

		
	}

}
