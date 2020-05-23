package es.martagon.oddoccurrencesinarray;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class OddOccurrences {
	
	public  int solution (int A []) {
		Map<Integer,Integer> map = new TreeMap<>();
		Integer counter = null;
		
		for (int valor:A) {
			counter = map.get(valor);
			if (counter == null) {
				counter =1;
			}else {
				counter ++;
			}
			map.put(valor, counter);
		}
		
		for (Entry<Integer, Integer> entry: map.entrySet()) {
			if (entry.getValue() % 2 !=0)
				return entry.getKey();
		}
		
		return -1;
	}
}
