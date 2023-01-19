package wkendAssignments;

public class IsPrime {
	public static void main(String[] args) {
int num =10;
for (int i=2; i<=num-1; i++) {
	for(int j=2; j<=i; j++) {
		if(i%j==0)
			System.out.println(j);
	}
}
	}

}
