package day01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDepo02 {

	public static void main (String[] args) {
		Map <Integer, Character> m = new HashMap<Integer, Character>();
		
		for (int i = 65; i <= 90; i++) {
			m.put(i,(char) i);
		}
		
		Set<Integer> ks = m.keySet();
		
		Iterator <Integer> i = ks.iterator();
		
		while (i.hasNext()) {
			Integer key = i.next();
			System.out.print(key + "  ");
			System.out.println(m.get(key));
		}
		
		
	}
}
