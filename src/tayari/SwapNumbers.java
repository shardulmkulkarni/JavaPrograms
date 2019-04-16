package tayari;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int x = 15;
		int y = -10;
		
		System.out.println("X is: " + x);
		System.out.println("y is: " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("X is: " + x);
		System.out.println("y is: " + y);
		
	}

}
