package collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListEven {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(8);
		nums.add(12);
		nums.add(13);
		nums.add(17);
		nums.add(10);
		nums.set(2, 16);
//		nums.forEach(a->{
//			if(a%2==0) {
//				System.out.println(a);
//			}
//		});
		Integer secondMax1 = nums.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).skip(1)
				.findFirst().get();

		Integer secondMax2 = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println(secondMax1);
		
		int [] a= {1,2,3,4,5};
		
		ArrayList l= new ArrayList();
		l.add("Sriram");
		l.add(25);
		l.add(true);
		System.out.println(l);
		l.forEach(x->System.out.println(l));
	}

}
