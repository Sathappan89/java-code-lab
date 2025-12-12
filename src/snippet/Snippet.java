package snippet;

import java.util.ArrayList;

public class Snippet {
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(12.33);
		ar.add(true);
		ar.add('c');
		ar.add("test");
		
		System.out.println(ar);
		
		//generics in AL
		ArrayList<Integer> marksList = new ArrayList<Integer>(); //VC=10;PC=0
		marksList.add(100);
		ArrayList<Double> bmiList = new ArrayList<Double>(); //VC=10;PC=0
		bmiList.add(12.33);
		bmiList.add(23.33);
		
		
		
		
	}
}

