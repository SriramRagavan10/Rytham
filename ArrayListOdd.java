package collections1;

import java.util.ArrayList;

public class ArrayListOdd {
	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<>();
		num.add(88);
		num.add(91);
		num.add(72);
		num.add(67);
		num.add(2,85);
		for(int i=0; i<num.size(); i++) {
			if(num.get(i)%2!=0) {
				System.out.println(num.get(i));
			}
		}
	}

}
