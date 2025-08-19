package controlStatement;

public class ForTask2 {
	public static void main(String[] args) {
		
//		10부터 1까지 출력
//		12345 -> 10 9 8 7 6 
//		10 - 1
//		10 - 2
		
//		10 - i
//		for(int i = 0; i < 10; i++) {
//			System.out.println(10 - i);
//		}
//		
//		abcd를 이용해서  97 98 99 100
		
//		a -> 97
//		b    98
//		c    99
//		d    100
		
//		int c = "abcd".charAt(0);
//		for(int i = 0; i < 4; i++) {
//			System.out.println(c + i);
//		}
//		
//		
//		"abcd"에서 c빼고 출력 a b d
		// 
		
//		a  	
//		b	
//		c	
//		d	
//		
		
//		int a = "abcd".charAt(2);
//		
//		for(int i = 0; i < 4; i++) {
//			
//		}
//		
//		System.out.println(a);
////		
		
		// 1~30까지 짝수의 개수 출력
		// count++
//		int count = 0;
//		for(int i = 0; i < 30; i++) {
//			if((i + 2) % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.printf("정답:%d",count);
//		
		
		// 1~30까지 짝수의 개수 총합 구하기
//		int result = 0;
//		for (int i = 0; i < 30; i++) {
//			if((i + 2) % 2 == 0) {
//				result += i;
//			}
//		}
//		System.out.println();
//		
		
		// 짝수중에서 7번째 숫자 출력
		// 인덱스
		for (int i = 0; i < 30; i++) {
			if((i + 2) % 2 == 0) {
				System.out.println(i + 2);
			}
		}
		
		
	}
}
