package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	
	public static void main(String[] args) {
		
		HashMap<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("street", "Victor Plains");
		mapData.put("suite", "Suite 879");
		mapData.put("city", "Victor Plains");
		mapData.put("zipcode", "90566-7771");
		mapData.put("lat", "-43.9509");
		mapData.put("lng", "-34.461");
		
		// 객체화
		
		JSONObject json = new JSONObject(mapData);
		System.out.println(json);
		
	}
	
}
