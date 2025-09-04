package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJSON = new JSONArray();
		JSONObject userJSON = new JSONObject();		
		
		User user1 = new User(1L, "홍길동", 17, "개발자");
		User user2 = new User(2L, "장보고", 20, "기획자");
		User user3 = new User(3L, "이순신", 35, "디자이너");
		User user4 = new User(4L, "이성계", 42, "개발자");
		User user5 = new User(5L, "이태희", 22, "사장");
		
		// 반복하면서 jsonObject로 바꿔서 jsonArray
		// JSONObject는 클래스도 받을 수 있음
		
		// user클래스를 Object로
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		System.out.println(users);
		
//		반복문을 돈다
//		생성자를 이용해서 JSONOject 객체화(User 클래스)
//		JSONArray에 하나씩 put
		
		// 반복문 돌면서 JSONObject로 바꿔서 JSONArray에 넣어야 함!	
      
		// 초기화를 시킬 때도 생성자로 초기화 함
		// 필요한 값들을 넘길 때 JSON으로 바꾸고 싶다면 생성자를 이용해서 초기화 시켜야 함
		for(int i = 0; i < users.size(); i++) {
			usersJSON.put(new JSONObject(users.get(i)));
		}
		
		System.out.println(usersJSON);
		
		users.forEach((data) -> {
//			System.out.println(data);
		});
		
		users.stream().map((data) -> data);
		
		users.stream().map((data) -> new JSONObject(data)).forEach((json) -> {
			usersJSON.put(json);
		});
		
	}
}
