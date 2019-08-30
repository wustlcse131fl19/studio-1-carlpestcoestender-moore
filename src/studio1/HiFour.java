package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name1 = ap.nextString("Name of 1st person");
		String name2 = ap.nextString("Name of 2nd person");
		String name3 = ap.nextString("Name of 3rd person");
		String name4 = ap.nextString("Name of 4th person");

	System.out.println("Hello " + name1 + ", " + name2 + ", " + name3 + ", " + name4 + ".");

		//
		// Say hello to the names in s0 through s3.
		//

	}
}
