package collectionTest.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapTask1Practice {

	//HashMap 자료구조
	//"street": "Victor Plains",
	//"suite": "Suite 879",
	//"city": "Wisokyburgh",
	//"zipcode": "90566-7771",
	//"lat": "-43.9509",
	//"lng": "-34.4618"
	
	// value들만 ArrayList로 변경 후 출력
	// map에 넣기부터
	
	public static void main(String[] args) {
		
		HashMap<String, Object> mapData = new HashMap<String, Object>();
		
		mapData.put("street", "Victor Plains");
		mapData.put("suite", "Suite 879");
		mapData.put("city", "Victor Plains");
		mapData.put("zipcode", "90566-7771");
		mapData.put("lat", "-43.9509");
		mapData.put("lng", "-34.461");
		
		// Map -> ArrayList
		// getValue : entrySet 메서드
		
		new ArrayList(mapData.values());
		
		Iterator<Entry<String, Object>> entry = mapData.entrySet().iterator();
		
		
	}
	
}
