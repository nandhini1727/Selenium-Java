package sel.java.workout;

public class Palindrome {
public static void main(String[] args) {
	
	String str="malayalam";
	String reverseStr="";
	for(int i=str.length()-1;i>=0;i--) {
		reverseStr +=str.charAt(i);
	}
	System.out.println(str.equals(reverseStr)?"It is a palindrome":"It i snot a palindrome");
}
}
