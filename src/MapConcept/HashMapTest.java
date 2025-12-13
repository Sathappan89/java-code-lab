package MapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// <K,V>
		// Map(I) --> HashMap(c)
		// It doesn't maintain order

		HashMap<String, Integer> marksMap = new HashMap<String, Integer>();

		marksMap.put("Jyothi", 100);
		marksMap.put("aparna", 60);
		System.out.println(marksMap.size()); // 2 pairs

		marksMap.put("dev", 75);
		System.out.println(marksMap.size()); // 3 pairs

		marksMap.put("dev", 85);
		System.out.println(marksMap.size()); // 3 pairs //It will update the same entire. It will not create the new
												// entire.
		System.out.println(marksMap.get("dev")); // 85
		System.out.println(marksMap.size()); // 3 pairs

		System.out.println(marksMap.get("tom")); // null //If the specify key is not available it will give null

		marksMap.put(null, 35);
		System.out.println(marksMap.get(null)); // 35

		marksMap.put(null, 15);
		System.out.println(marksMap.get(null)); // 15
		System.out.println(marksMap.size()); // 4

		marksMap.put("robin", null);
		marksMap.put("divya", null);
		System.out.println(marksMap.get("divya"));

		//
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		numMap.put(100, 1);

		//

		HashMap<String, String> empMap = new HashMap<String, String>();
		System.out.println(empMap);
		System.out.println(empMap.size());

		empMap.put("ravi", "SDET1");
		empMap.put("dev", "SDET2");
		empMap.put("jyothi", "SDET Manager");
		empMap.put("divya", "Dev Manager");
		empMap.put("ravi", "SDET1");
		empMap.put("naveen", "CT0");
		empMap.put(null, "CEO");

		System.out.println(empMap);
		System.out.println(empMap.size());
		// {dev=SDET2, ravi=SDET1, naveen=CT0, jyothi=SDET Manager, divya=Dev Manager}

		HashMap<String, Object> UserData = new HashMap<String, Object>();

		UserData.put("tom", "IBM");
		UserData.put("designation", "SDET");
		UserData.put("designation", 14.55);
		UserData.put("designation", true);

		Map<String, String> sgMap = new HashMap<String, String>();
		System.out.println(sgMap);
		System.out.println(sgMap.size());

		sgMap.put("ravi", "SDET1");
		sgMap.put("dev", "SDET2");
		sgMap.put("jyothi", "SDET Manager");
		sgMap.put("divya", "Dev Manager");
		sgMap.put("ravi", "SDET1");
		sgMap.put("naveen", "CT0");
		sgMap.put(null, "CEO");

		System.out.println(sgMap);
		System.out.println(sgMap.size());

		// Top Casting
		Map<String, String> stMap = new HashMap<String, String>();
		// Hashcode calucation
		stMap = new LinkedHashMap<String, String>();
		// Sequence code
		stMap = new TreeMap<String, String>();
		// Sorted code

	}

}
