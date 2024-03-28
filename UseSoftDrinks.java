package collections1;

import java.util.HashSet;
import java.util.Set;

public class UseSoftDrinks {
	public static void main(String[] args) {
		SoftDrinks sd1=new SoftDrinks("Coka", 1f, "Grape", 45, true);
		SoftDrinks sd2=new SoftDrinks("Pepsi", 1.5f, "Grape", 40, true);
		SoftDrinks sd3=new SoftDrinks("Fanta", 2f, "Orange", 42, true);
		SoftDrinks sd4=new SoftDrinks("Limca", 2.5f, "Lemon", 38, true);
		SoftDrinks sd5=new SoftDrinks("Maaza", .5f, "Mango", 22, false);
		Set<SoftDrinks>sds=new HashSet<SoftDrinks>();
		//sds.add(null);
		sds.add( new SoftDrinks("Miranda", 1.2f, "Orange", 44, true));
		sds.add(sd1);
		sds.add(sd2);
		sds.add(sd3);
		sds.add(sd4);
		sds.add(sd5);
		sds.forEach(x->System.out.println(x));
		System.out.println("-");
		//sds.clear();//It Clear the all values
		sds.remove(sd1);
		sds.forEach(x->System.out.println(x));
		System.out.println("--");
		sds.stream().filter(x->x.getLiter()==1.2f).forEach(c->System.out.println(c));
	}

}
