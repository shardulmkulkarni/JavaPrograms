package tayari;

/**
 * 
 * @author shardulkulkarni
 * Find number of occurrence of a sub string from the given string.
 *
 */


public class occurrenceOfSubString {
	
	public static void main (String args[]) {
		
		String str = "helloslkhellodjladfjhellohelo";
		String findStr = "hello";
		
		if(str == findStr) {
			
		}
		
		int lastIndex = 0;
		int count = 0;
		

		while (lastIndex != -1) {

		    lastIndex = str.indexOf(findStr, lastIndex);

		    if (lastIndex != -1) {
		        count++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println(count);
		
		
	}

}
