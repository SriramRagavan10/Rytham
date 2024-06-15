package collections1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TwoInt {
	public static void main(String[] args) {
		List<Integer> li1=Arrays.asList(1, 2, 3, 4);
		List<Integer> li2=Arrays.asList(1, 5, 6, 2);
		li1.stream().filter(x->(!li2.contains(x)) || (!li1.contains(x))).forEach(x->System.out.println(x));
		System.out.println("Two Integer");
		Stream.concat(li1.stream(), li2.stream()).filter(x->(!li2.contains(x)) || (!li1.contains(x))).forEach(x->System.out.println(x));
		
		
		int[] arr = {1, 2, 3, 3, 4, 5, 1};
		
		System.out.println("\n"+"Duplicate");
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=100;
				}
			}
			if(count>1 && arr[i]!=100) {
				System.out.println(arr[i]);
			}
		}
		
//		Scanner scan= new Scanner(System.in);
//		String a= "10-4+34-2";
//		String[] b=a.split("-" "+" "*" "/" "%");
//		int[] in=new int[b.length];
//		for(int i=0; i<b.length; i++) {
//			in=Integer.parseInt(b[i]);
//		}
//		System.out.println();
//		Integer i=1;
//		if(i<10) {
//			System.out.println(i++);	
//		}
		System.out.println();
		TwoInt tw=new TwoInt();
		tw.count(1);
		
		
	}
	
	public void count(int a) {
		
		if(a<=10) {
			System.out.println(a++);
			count(a);
		}
	}
	
	

}
