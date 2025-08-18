package castingcast;

public class CastingTest {
	public static void main(String[] args) {
//		정수 + 실수 = 실수
//		자동 형변환
		System.out.println(1 + 2.5);
		
		System.out.println(5 + 3);
		
//		정수 / 정수 = 정수 (2)
		System.out.println(5 / 2);
		
//		강제 형변환
		System.out.println(5 / (double)2); 
		
		// 최우선 연산자로 강제 형변환
		System.out.println((int)(5 / (double)2));
		
		
//		8.43 + 2.59를 더한 값이 10이 되도록 출력(형변환)
		
		System.out.println((int)(8.43 + 2.59));
		
	}
}
