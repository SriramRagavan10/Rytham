package collections1;

import java.util.ArrayList;

public class ArrayListTask {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(16);
		nums.add(4);
		nums.add(20);
		nums.add(99);
		nums.add(66);
		nums.add(3,100);
		System.out.println(nums);
		nums.set(2, 2000);
		System.out.println(nums);
		nums.remove(1); //Memory Shifting
		System.out.println(nums);
		System.out.println(nums.get(3));
		System.out.println(nums.size());
		
	}

}
