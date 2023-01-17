package wk1dt1;

public class SubstringLastword {

	public static void main(String[] args) {
		String s="Hello world";
		int length = s.length()-1;
		//String substring = s.substring();
	    for(int i=length;i>=0;i--) {
     if(s.charAt(i)==' ') {
            for(int j=i+1;j<s.length();j++) {
            	
                System.out.print(s.charAt(j));
            }
           
     }
 }

	}

}