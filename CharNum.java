package sel.java.workout;

public class CharNum {

	public static void main(String[] args) {
		String str= "1. It is Work from Home  not Work for Home";
		
		int upperCase = 0;
		int lowerCase = 0;
		int number = 0;
		int space = 0;
	
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isUpperCase(charArray[i])) {
				upperCase++;
			} else if (Character.isLowerCase(charArray[i])) {
				lowerCase++;
			} else if (Character.isDigit(charArray[i])) {
				number++;
			}else if (Character.isSpace(charArray[i])) {
				space++;
			}	
		}
		
		System.out.println("UpperCase is: " +upperCase);
		System.out.println("LowerCase is: " +lowerCase);
		System.out.println("Number is: " +number);
		System.out.println("Space is: " +space);
	}



	}


