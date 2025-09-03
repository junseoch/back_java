package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//HashMap 자료구조
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"

// value들만 ArrayList로 변경 후 출력
// map에 넣기부터

public class HashMapTask1 {

	public static void main(String[] args) {
		
		HashMap<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("street", "Victor Plains");
		mapData.put("suite", "Suite 879");
		mapData.put("city", "Victor Plains");
		mapData.put("zipcode", "90566-7771");
		mapData.put("lat", "-43.9509");
		mapData.put("lng", "-34.461");
		
		// value들만 ArrayList로 변경
		
		System.out.println(mapData);
		System.out.println(mapData.values());
		System.out.println(new ArrayList(mapData.values())); 
		
		
//		// entry로 묶음
		Iterator<Entry<String, Object>> iterData = mapData.entrySet().iterator();
		
		
//		ArrayList<String> ArrayListData = new ArrayList<String>();
		
			while(iterData.hasNext()) {
				Entry<String, Object> entry = iterData.next();
				ArrayListData.add(entry.getValue());  // add해서 ArrayListData
			}
		
		}

}
