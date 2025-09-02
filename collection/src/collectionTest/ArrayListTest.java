package collectionTest;

import java.util.ArrayList;

public class ArrayListTest<T> { // T : 클래스, 인터페이스가 들어옴
//	<?>: 제네릭 - 포괄적인 즉 이름이 없는이라는 뜻
//	지금 당장 무슨 타입일지 알 수 없을 때 사용하는 타입이다
//	사용자가 어떤 타입의 데이터를 넣을지 모르기에 객체화할 때 타입을 결정해준다.
	
	// T 타입
	T data;
	
	public static void main(String[] args) {
		// 객체화를 할 때 타입이 정해짐
		ArrayList<String> datas = new ArrayList<String>();
		 System.out.println(datas);
		 
		 ArrayList<Integer> datas2 = new ArrayList<Integer>();
		 System.out.println(datas2.add(3));
		 
		 ArrayList datas3 = new ArrayList();
		 datas3.add("S");  // String -> Object : 업케스팅
	}
}
