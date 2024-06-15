package collections1;

import java.util.HashMap;
import java.util.Hashtable;

public class Ht {
	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();

		h.put(101, "Suban");
		h.put(102, "Maghizaal");
		h.put(103, "Vaan");
		h.put(104, "Rythan");
		h.put(105, "Vizhi");
		
		System.out.println(h);
		
		h.remove(103);
		
		System.out.println(h);
		
		System.out.println(h.containsKey(102));
		
		System.out.println(h.containsValue("Suvarneya"));
		
//		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
//
//		h1.put(101, "Suban");
//		h1.put(102, "Maghizaal");
//		h1.put(103, "Vaan");
//		h1.put(104, "Rythan");
//		h1.put(105, "Vizhi");
//		
//		h1.remove(103);
//		
//		System.out.println(h);
	}
}
