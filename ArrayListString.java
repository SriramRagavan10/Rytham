package collections1;

import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("Rythan");
		names.add("Suban");
		names.add("Xhfwfs");
		names.add("Arunmozhivarmar");
		names.add("Mozhiyaal");
		names.add("Magizhaal");
		names.forEach(name->{
			if(name.startsWith("S")) {
				System.out.println(name);
			}
		});
		String max=names.get(0);
		for(String a:names) {
			if(a.length()>max.length()) {
				max=a;
			}
		}
		System.out.println(max);
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).contains("a") || names.get(i).contains("e") || names.get(i).contains("i") || names.get(i).contains("o") || names.get(i).contains("u")) {
				System.out.println(names.get(i));
			}
		}
	}

}
