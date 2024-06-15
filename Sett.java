package collections1;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;

public class Sett {
	public static void main(String[] args) {
		HashSet<Integer> l = new HashSet<Integer>();
		l.add(144);
		l.add(13);
		l.add(12);
		l.add(14);
		l.add(11);
		System.out.println(l);

		HashSet<Integer> l1 = new HashSet<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);

//		Hashtable<Integer, String> ht=

//		l.addAll(l1);
//		System.out.println(l);
//		System.out.println(l.addAll(l1));
//		l.retainAll(l1);
//		System.out.println(l);
//		l.removeAll(l1);
//		System.out.println(l);
//		l.containsAll(l1);
//		System.out.println(l.containsAll(l1));
		
		LinkedHashSet<Integer> ss= new LinkedHashSet<Integer>();
		
		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);
		
		System.out.println(ss);
		

	}

}
