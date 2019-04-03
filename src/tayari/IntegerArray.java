package tayari;

import java.util.Scanner;

/**
 * 
 * @author shardulkulkarni
 * Given integer array, return true if value x appears exactly 3 times and no x’s are next to each other 
 * 
 *
 */

public class IntegerArray {


	public static void main(String args[]) {
		
		int arr[] = { 12, 2, 21, 22, 3, 4, 22, 2, 2 };
		int count = 0;
		boolean flag = true;

		System.out.println("Enter value of x: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < arr.length; i++) {

			if ((arr[i] == x)) {
				
				count += 1;
				
				if (count <= 3) {
				
					if ((arr[i + 1] == x) && (count > 0)) {
						System.out.format("%d appeared next to each other at positions %d and %d\n", x, i, ++i);
						flag = false;
						break;
					}
				}
			}

		}

		if (count == 3 && flag)
			System.out.println("Result is: true");
		else
			System.out.println("Result is: false");
	}

}
