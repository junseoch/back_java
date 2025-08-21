package arrayTest;

public class ArrayTest {
	public static void main(String[] args) {
		// 값을 알고 있을 때
		int[] arData1 = {1 ,2 ,3 ,4};
		
		// 칸 수를 알고 있을 때, 값이 뭐가 들어갈지 모름
		int[] arData2 = new int[5]; // new : int 5칸 배열을 할당하고 할당된 주소값을 초기화 시켜주는 연산자
		
		
		// 칸 수도 모르고 값도 모름 -> 일단 주소가 들어오겠지라고 생각하고 초기값을 넣음
		// array는 주소로 관리함
		int[] arData3 = null; // 주소의 초기값
		
		for (int i = 0; i < arData1.length; i++) {
			System.out.println(arData1[i]);
		}
		
		System.out.println(arData1[0]);
	}
}
