package wk1dt1;

public class Palindrome {

	public static void main(String[] args) {
 String s = " ";
 int length = s.length()-1;
 String revstr="";
 for(int i=length; i>=0; i--) {
	 revstr=revstr+s.charAt(i);
 }
	 System.out.print(revstr);
 if(s.equals(revstr))
 {
	 System.out.print("=true");
 
 }
 else {
	 System.out.println("=false");
 }
	}

}
