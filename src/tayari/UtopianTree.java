package tayari;

import java.util.Scanner;

/**
 * 
 * @author shardulkulkarni
 * 
 * 
 * The Utopian Tree goes through 2 cycles of growth every year. 
 * Each spring, it doubles in height. Each summer, its height increases by 1 meter. 
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. 
 * 
 * How tall will her tree be after  growth cycles?
 * For example, if the number of growth cycles is , the calculations are as follows:
 * Period  Height
 * 0          1
 * 1          2
 * 2          3
 * 3          6
 * 4          7
 * 5          14
 *
 */

public class UtopianTree {

	public static void main(String[] args) {

		System.out.println("Enter no of test cases:");
		Scanner s = new Scanner(System.in);
		int no_of_testcase = s.nextInt();
		int cycles, height;
		String output = "";

		for (int i = 1; i <= no_of_testcase; i++) {
			height = 1;
			System.out.println("Enter cycle:");
			cycles = s.nextInt();

			for (int j = 1; j <= cycles; j++) {

				if (j % 2 == 1)
					height *= 2;

				else
					height += 1;

			}

			output += height + " This is after cycle #: " + i + "\n";

		}

		System.out.println("1 This is initial height");
		System.out.print(output);

		s.close();
	}
}