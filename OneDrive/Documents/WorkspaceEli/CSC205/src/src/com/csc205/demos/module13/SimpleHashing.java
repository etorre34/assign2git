package src.com.csc205.demos.module13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleHashing {

	public static void main(String[] args) {
		
		Map<HashKey, String> map = new HashMap<>();
		final int SIZE = 10;
		
		String value = "Hellow HashMap!";
				
		for (int x = 0; x < SIZE; x++) {
			map.put(new HashKey(), value);
		}
		
		Set<HashKey> keys = map.keySet();
		
		//Iteration using a for each loop
		for (HashKey key : keys) {
			System.out.println(key + ":" + map.get(key));
			
		}
		
		//Iteration using forEach and a Lambda
	map.forEach(k, v) -> {
		System.out.print(k);
		System.out.print(":");
		System.out.println(v);
	}};
		
		//Using toSTring method
		System.out.println(map);
	}
}

