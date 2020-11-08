
public class HelloWorld {

	public static void main(String[] args) {
		
		String[] names = new String [3]; 
		
		names[0] = "Alex";
		names[1] = "Konsti";
		names[2] = "Test";
		
		System.out.println(names[1]);
		
		int number = 2;
		
		switch(number) {
		case 1: System.out.println("Number hat den Wert 1 "); break;
		case 2: System.out.println("Number hat den Wert 2 "); break;
		case 3: System.out.println("Number hat den Wert 3 "); break;
		default: System.out.println("Number hat einen anderen Wert...");	
		}
		
		if(number == 2); {
		System.out.println("Der Int ist 2");
		}
		
	}
	
}
