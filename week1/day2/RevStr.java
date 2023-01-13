package week1.day2;

public class RevStr {

	public static void main(String[] args) {
		String name= "TESTLEAF";
		char[] charArray = name.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
	}
		
	}


