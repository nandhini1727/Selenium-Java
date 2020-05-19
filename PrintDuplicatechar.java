package sel.java.workout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintDuplicatechar {

	public static void main(String[] args) {
		/*
		 * 1. Write a java program to print the duplicate character using Collections
		 * Framework. Input: "When life gives you lemons, make lemonade"
		 */
		String str="When life gives you lemons, make lemonade";
List<Character> listval=new ArrayList<Character>()	;
for (int i = 0; i < str.length(); i++) {
	if(!listval.contains(str.charAt(i)))
	{listval.add(str.charAt(i));
}
	else {System.out.println(str.charAt(i)+",");
	
}}}}