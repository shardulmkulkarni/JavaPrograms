package tayari;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author shardulkulkarni
 * 
 * Given integer array, print true if the array has + and - value of each element and 
 * 						print false otherwise.
 *
 *
 */



public class BalancedArray {

	public static void main(String args[]) {

		System.out.println("The result is: " + isBalanced(new int[] { -2, 3, 2, 4, -4, -3 }));

	}

	public static boolean isBalanced(int[] a) {

		if ((a.length % 2) == 0) { // check if array has even number of elements and proceed only when even 

			Map<Integer, Integer> map = new HashMap<>();

			for (int number : a) {
				
				int key = AbsoluteValue(number);

				Integer value = map.get(key);

				if (value == null)
					map.put(key, number); 

				else if (value != number)
					map.put(key, 0);

			}

			for (int v : map.values()) {
				if (v != 0)
					return false;
			}

			return true;
		}

		else {
			return false;
		}
	}

	public static int AbsoluteValue(int a) {
		return (a < 0) ? -a : a;
	}

}