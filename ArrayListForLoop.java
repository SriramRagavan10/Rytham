package collections1;

import java.util.ArrayList;

public class ArrayListForLoop {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(8);
		nums.add(12);
		nums.add(13);
		nums.add(16);
		nums.add(10);
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		System.out.println("\n");
		for(Integer a:nums) { //Enhanced For Loop
			System.out.println(a);
		}
		System.out.println("\n");
		nums.forEach(x -> System.out.println(x));
	}

}
