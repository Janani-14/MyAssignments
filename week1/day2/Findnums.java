package week1.day2;

public class Findnums {

	public static void main(String[] args) {
		String name = "Amazon laid down 12000 employees globally";
		String name1 = name.replaceAll("[^0-9]", "*");
		
		String name2 = name.substring(0, 4); // substring method
		
	// String name1 = name.replaceAll("[0-9]", "*");	// expect nos all will display
		
		System.out.println(name1);
		System.out.println(name2);
	}

}
