package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		
		
		mbtiType.add("ISTP");
		mbtiType.add("ISTJ");
		mbtiType.add("ESFJ");
		mbtiType.add("ISTP");
		mbtiType.add("ESFP");
		
		System.out.println(mbtiType);
		
//		데이터를 가져오고 싶을 때 순서를 부여해야 한다.
//		Iterator: 순서가 없을 때 순서를 부여할 수 있는 인터 페이스
		Iterator<String> iter = mbtiType.iterator();
		
//		while(iter.hasNext()) { // 손에 잡히는 게 있을 때 
//			String mbti = iter.next(); // 잡은 걸 들고올 때
//			if(mbti.equals("ISTP")) {
//				System.out.println(mbti);
//				break;
//			}
//		}
		
		while(iter.hasNext()) { // 손에 잡히는 값이 있는지 없는지 -> 있을 때 while문 실행
			String mbti = iter.next();
			if(mbti.equals("ISTP")) {
				System.out.println(mbti);
				break;
			}
		}
		
		
		// 중복된 데이터를 삭제
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 10));
		
//			new HashSet<Integer>(datas); Set에 ArrayList 객체를 넣음
			
											
			datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		
		
//		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
//		// Hash -> Integer 바꿈
		
		
		
		
	}
}
