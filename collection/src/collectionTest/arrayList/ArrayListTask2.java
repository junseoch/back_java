package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
	
	
	public static void main(String[] args) {
		
//		a~z까지 문자열로 ArrayList에 추가하기
//		"a" -> 'a'  -> 97
//		"z" -> 'z'  -> 122
//		char로 변환한 숫자가 97~122까지 들어가도록 반복
		
		
		// a : 97  z : 122
//					    97
		
		String str = "a";
		
		ArrayList<String> datas = new ArrayList<String>();
		
		for(int i = 0; i < 26; i++) {
			datas.add(String.valueOf('a' + i));
		}
		
		
		 
	}
}
