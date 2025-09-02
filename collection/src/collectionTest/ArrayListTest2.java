package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest2 {
	public static void main(String[] args) {
		// 10 20 30 같은 값을 넣을 때
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		datas.size();
		
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(40);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
//		System.out.println(datas.size());
//		System.out.println(datas);
		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
		Collections.shuffle(datas);
		// 값이 있는지 부터 확인
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}
		
//		수정
//		90을 9로 수정
		int prev = 0;
		try { 
			if(datas.contains(90)) {
				prev = datas.set(datas.indexOf(90), 9);
				System.out.println("수정 완료!");
			} 
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 삽입!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(datas);
		
//		삭제
//		80을 삭제
//		1. 인덱스 삭제
//		if(datas.contains(80)) {
//			datas.remove(datas.indexOf(80));
//		}
		
//		2. 값으로 삭제
		if(datas.contains(80)) {
			// 정수 -> 정수
			// Wrapper Class
			datas.remove(Integer.valueOf(80)); 
		}
		
		
	}
}
