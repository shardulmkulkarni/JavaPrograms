package tayari;

import java.util.HashMap;

public class CountingWordsInSentence {

	public static void main(String[] args) {

		String sentence = "Is Is this a string which is a test for string";
		
		String[] worlds = sentence.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < worlds.length; i++) {

			if (map.containsKey(worlds[i])) {
				
				int count = map.get(worlds[i]);
				
				map.put(worlds[i], count + 1);
				
			} else {
				
				map.put(worlds[i], 1);
				
			}

		}

		System.out.println(map);
		
	}

}
