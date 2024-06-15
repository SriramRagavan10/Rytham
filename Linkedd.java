package collections1;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedd {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(16);
		l.add(4);
		l.add(2000);
		l.add(13);
		l.add(10);
		l.add(1999);

		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);

		System.out.println(l.getFirst());

	}

}
