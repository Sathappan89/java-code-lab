package ArrayListConcept;

import java.util.ArrayList;

public class ArraysListTest {

	public static void main(String[] args) {

		// List(i) ---> ArrayList(C)
		// Maintain the order/index

		ArrayList ar = new ArrayList(); //VC=10;PC (SIZE = 0)

		System.out.println(ar.size()); // 0
		System.out.println(ar);
		//System.out.println(ar.get(0));//500 //java.lang.IndexOutOfBoundsException

		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2

		System.out.println(ar.get(0));//100
		System.out.println(ar.size()); // 3
		System.out.println(ar);

		ar.add(400); // 3
		ar.add(500); // 4

		System.out.println(ar.size()); // 5
		System.out.println(ar);

		ar.remove(3); //400 will be removed
		System.out.println(ar.size()); // 4 //Automatically size will be decreased
		System.out.println(ar);
		System.out.println(ar.get(3));//500
		
		
		//
		ArrayList tr = new ArrayList(5); //VC=5;PC=0
		
		tr.add(10);
		//System.out.println(tr.get(2)); // java.lang.IndexOutOfBoundsException
		
		
		//tr.add(3, 30);
		
		//System.out.println(tr.get(3)); 
		
		ArrayList tg = new ArrayList(5); 
		tg.add(10);
		tg.add(20);
		tg.add(30);
		tg.add(40);
		tg.add(50);
		System.out.println(tg); //[10, 20, 30, 40, 50]
		tg.add(1,25);
		System.out.println(tg); //[10, 25, 20, 30, 40, 50]
		tg.set(1,15);
		System.out.println(tg);//[10, 15, 20, 30, 40, 50]
		
	}

}