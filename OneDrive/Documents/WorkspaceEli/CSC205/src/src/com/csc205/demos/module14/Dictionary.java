package src.com.csc205.demos.module14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	private static Map<String, String> dictionary;
	
	static {
		try {
			dictionary = getDictionary();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
	private static Map<String, String> getDictionary() throws IOException {
		
		Map<String, String> wordList = new HashMap<>();
		String fileName = "src/com/csc205/demos/module14/dictionary.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));
			Scanner reader = new Scanner(br);) {
			
			long totalInsertionTime = 0;
			long start = System.currentTimeMillis();
			while(reader.hasNext()) {
				
				
				String word = reader.next();
				
				long insertStart = System.currentTimeMillis();
				wordList.put(word, word);
				long insertStop = System.currentTimeMillis();
				totalInsertionTime += (insertStop - insertStart);
			}
			long stop = System.currentTimeMillis();
			
			StringBuilder builder = new StringBuilder();
			builder.append("It took ");
			builder.append(totalInsertionTime);
			builder.append("as to populate the Hashmap with ");
			builder.append(wordList.size());
			builder.append(" values out of a total process tiem of ");
			builder.append((stop - start));
			builder.append("me. ");
			System.out.println(builder);
		}
		
		return wordList;
	}
	
	public static boolean contatins (String key) {
		return dictionary.containsKey(key.toLowerCase());
	}
}
