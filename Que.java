package collections1;

import java.util.PriorityQueue;

public class Que {
	public static void main(String[] args) {
		PriorityQueue<String> s=new PriorityQueue<>();
		
		s.add("Sriram");
		s.add("25");
		s.add("true");
		System.out.println(s.add("Sriram"));
		System.out.println(s.offer("Ragavan"));
		
		System.out.println(s.element());
	}

}
