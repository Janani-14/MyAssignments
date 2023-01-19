package wkendAssignments;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 11;
		int first = 0;
		int second = 1;
		int total;
		System.out.println(first);
	    System.out.println(second);
		for (int i =1; i<=num; i++)
		{
			total=first+second;
			System.out.println(total);
			first=second;
			second=total;
		}

	}

}
