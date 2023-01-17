package wk1dt1;

public class FindSingleElement {

	public static void main(String[] args) {
		int num[] = {1,2,3,2};
		int len=num.length;
		for(int i=0;i<len; i++)
		{
			for(int j=i+1; j<len; j++) {
				if(num[i]!=num[j]) {
			System.out.println(num[i]);
			break;
				}
			
			}
			
		}
		
	}

}
