package tayari;

/**
 * 
 * @author shardulkulkarni
 * Print mirrored characters from a given string starting with specific character.
 *
 */


public class mirrorChars {
	
	
	// Function which take the given string 
    // and the position from which the reversing shall 
    // be done and returns the modified string 
    static String compute(String str, int n) 
    { 
  
        // Creating a string having reversed alphabetical order 
        String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";
//                               "abcdefghijklmnopqrstuvwxyz"
        int l = str.length(); 
          
        // The string up to the point specified in the question, 
        // the string remains unchanged and from the point up to 
        // the length of the string, we reverse the alphabetical order 
        
        String answer = ""; 
        for (int i = 0; i < n; i++) 
            answer = answer + str.charAt(i); 
        for (int i = n; i < l; i++) 
            answer = answer + reverseAlphabet.charAt(str.charAt(i) - 'a'); 
        return answer; 
    } 
  
    // Driver function 
    public static void main(String args[]) 
    { 
        String str = "Shardul";
        int n = 4;
        System.out.println("length is " + str.length());
        System.out.println("char at 0 is " + str.charAt(0));
        System.out.println(compute(str, n - 1));
    } 

    
}
