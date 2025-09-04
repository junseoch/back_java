package collectionTest.hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) { 
		// <String, Object>
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "abc123");
		userMap.put("password", "1234");
		userMap.put("name", "최준서");
		userMap.put("age", 20);
		userMap.put("isRich", true);
		
		
		
		// k , v는 한 쌍의 하나의 데이터로 봐야 함
		// k,  v를 한 쌍으로 묶은 것 : Entry
		
		// Map을 순서가 있는 Iterator로 바꾸는 방법
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		
		System.out.println(userMap);
		userMap.get("age");
		
		while(userMapIter.hasNext()) {
			userMapIter.next();
		}
		
		// map을 반복문 못돌림
		// entrySet -> Set을 Iterator로 변경
		
		
	}
}

