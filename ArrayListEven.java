package collections1;

import java.util.ArrayList;

public class ArrayListEven {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(8);
		nums.add(12);
		nums.add(13);
		nums.add(17);
		nums.add(10);
		nums.set(2, 15);
		nums.forEach(a->{
			if(a%2==0) {
				System.out.println(a);
			}
		});
	}

}
