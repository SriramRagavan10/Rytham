package collections1;

import java.util.LinkedList;

public class ArrayListFloat {
	public static void main(String[] args) {
		LinkedList<Float>rating=new LinkedList<>();
		rating.add(7.9f);
		rating.add(3.4f);
		rating.add(2.8f);
		rating.add(8.6f);
		rating.add(9.2f);
		
		rating.forEach(num->System.out.print(num+", "));
		System.out.println();
		rating.set(2, 5.5f);
		rating.forEach(num->System.out.print(num+", "));
		System.out.println();
		//rating.addAll(Arrays.asList(new Float[]{8.8f, 7.4f, 4.9f, 6.1f, 9.6f}));
		//rating.forEach(num->System.out.print(num+","));
		
	}

}
