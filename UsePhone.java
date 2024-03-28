package collections1;

import java.util.ArrayList;

public class UsePhone {
	public static void main(String[] args) {
		Phone phone1 = new Phone("Oneplus", 40000, "Blue", 2020, 9.5f);
		Phone phone2 = new Phone("Nokia", 30000, "Black", 2017, 8.0f);
		Phone phone3 = new Phone("Oppo", 25000, "Gray", 2019, 7.2f);
		Phone phone4 = new Phone("Samsung", 38000, "Blue", 2023, 6.5f);
		Phone phone5 = new Phone("Redmi", 20000, "Navyblue", 2018, 7.5f);
		Phone phone6 = new Phone("Realme", 18000, "Blue", 2021, 5.5f);
		Phone phone7 = new Phone("iPhone", 80000, "White", 2016, 8.5f);
		ArrayList<Phone> phones = new ArrayList<>();
		phones.add(phone1);
		phones.add(phone2);
		phones.add(phone3);
		phones.add(phone4);
		phones.add(phone5);
		phones.add(phone6);
		phones.add(phone7);
		phones.forEach(p->System.out.println(p));
		System.out.println("-");
		for(int i=0; i<phones.size(); i++) {
			if(phones.get(i).getPrice()>=30000 && phones.get(i).getPrice()<=70000) {
				System.out.println(phones.get(i).getBrand());
			}
		}
		System.out.println("--");
		for(Phone p:phones) {
			if(p.getColor().equals("Blue")) {
				p.setPrice(p.getPrice()+(p.getPrice()*10/100));
			}
		}
		phones.forEach(p1->System.out.println(p1));
		System.out.println("---");
		phones.forEach(p2-> {
			if(p2.getBrand().startsWith("S")) {
				p2.setColor(p2.getColor().toUpperCase());
				System.out.println(p2);
			}
			});
		System.out.println("----");
		ArrayList<Phone>newPhones=new ArrayList<>();
		phones.forEach(a-> {
			if(a.getEditionYear()>2020) {
				newPhones.add(a);
			}
		});
		newPhones.forEach(b->System.out.println(b));

		for (int i = 0; i < 3; i++) {
			phones.add(new Phone("Oneplus", 40000, "Blue", 2020, 9.5f));
		}
		phones.forEach(x -> System.out.println(x));
	}
}
