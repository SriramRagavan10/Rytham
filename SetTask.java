package collections1;

import java.util.HashSet;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		Set<Integer>num=new HashSet<>();
		num.add(33);
		num.add(44);
		num.add(21);
		num.add(16);
		num.remove(33);
		System.out.println(num+"\n");
		num.forEach(x->System.out.println(x));
	}

}
