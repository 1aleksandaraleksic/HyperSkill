package coffee_machine;

public class Sada {

	public static void main(String[] args) {
		boolean b1 = false;
		boolean b2 = true;
		boolean b3 = false;
		
		boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
		
		System.out.println(result);

	}

}
