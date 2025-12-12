package ArrayListConcept;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListGIteration {

	public static void main(String[] args) {

		
		ArrayList<Integer> marksList = new ArrayList<Integer>(); // VC=10; PC=0
		marksList.add(100);// 0
		marksList.add(200);// 1
		marksList.add(300);// 2
		marksList.add(400);// 3
		marksList.add(500);// 4

		System.out.println(marksList);

		// Index based for loop
		for (int i = 0; i < marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}

		

		//

		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		browserList.add("safari");
		browserList.add("ie");

		System.out.println(browserList); // [chrome, firefox, edge, safari, ie]

		for (String e : browserList) {
			System.out.println(e);
			if (e.equals("edge")) {
				System.out.println("launch edge");
				break;
			}
		}
		
		
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Jaya");
		empData.add(30);
		empData.add(34.55);
		empData.add('f');
		empData.add(true);
		empData.add("SDET");
		empData.add("pune");
		
		System.out.println(empData.size()); //vc=3;pc=7
		
		for (Object e : empData) {
			System.out.println(e);
			if(e.equals("SDET")) {
				System.out.println("Increase salary by 10%");
				//break;
			}
			
		}
		
			
		//TopCasting with interface
		List<String> dataList =  new ArrayList<String>();
		dataList = new LinkedList<String>();
	
			
		
	}
}