package collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size()); 
//		.add(값)
		
		datas.add(10);
		datas.add(20);
		datas.add(50);
		
		System.out.println(datas);
		
		try {
			System.out.println(datas.get(0));
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayList2 예외 발생");
			System.out.println("인덱스 범위를 똑바로 작성하세요!");
		} catch (Exception e){
			e.printStackTrace();
		}
		
		// 50뒤에 500삽입
//		if(datas.contains(50)) {
//			datas.indexOf(50) + 1, 500);
//		}
//		
		
		datas.add(90);
		
//		90을 9로 수정 : 이전값을 리턴함
		try {
			datas.set(4, 9);
		} catch (IndexOutOfBoundsException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		datas.add(80);
		
//		80을 삭제
//		1. 인덱스로 삭제
		
//		2. 값으로 삭제 
		
		try {
			datas.remove(5);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println(datas);
		
	}
}
