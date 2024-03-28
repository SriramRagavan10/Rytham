package collections1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maximum {
	public static void main(String[] args) {
		List<Integer> maximum=Arrays.asList(23, 16, 29, 89, 99);
		List<Integer> in=maximum.stream().toList();
		System.out.println(Collections.max(maximum));
		int m=maximum.stream().max(Integer::compare).get();
		System.out.println(m);
		int n=maximum.stream().min(Integer::compare).get();
		System.out.println(n);
		List<Integer> secMax=maximum.stream().sorted().collect(Collectors.toList());
		System.out.println(secMax);
		
	}

}
