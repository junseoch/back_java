package arrayTest;

public class ArrayTask3 {
	public static void main(String[] args) {
		
//      1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기  
		
		// 길이가 20인 정수 배열 선언
		// 반복을 돌면서 짝수일 때 : for문 돌면서 i % 2 == 0
		// if문 안에서 반복되는 i값에 +3을 하면서 출력
		
		// 0 2 4 6 8
		// 0 5 7 9 11  -> +3
		
		int arr1[] = new int[20];
		
		for(int i = 0; i < arr1.length; i++) {
			if(i % 2 == 0) {
				arr1[i] = i + 3; // arr1에 1~20까지의 짝수 담음
			}
		}


//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기

		int arr2[] = {10,20,30,40,50};
		int result = 0;
	
		int length = arr2.length;
		int total = 0;
		for(int i = 0; i < length; i++) {
			total += arr2[i];
		}
			result = total / length;
			System.out.printf("평균: %d",result);
		
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
			// 10칸 짜리 정수 배열 선언
			// arr3[i] = i을 반복돌면서 배열에 1부터 10을 담기
			// if(값 > 5){값 * 2}
			// 변경된 배열안의 값을 출력

			int arr3[] = new int[10];
			for(int i = 0; i < arr3.length; i++) {
				arr3[i] = i + 1; // 배열에 값 담기 먼저
				if(arr3[i] > 5) {					
					System.out.println(arr3[i] * 2);
				}
			}
			// length - 1 : 마지막
			
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
			
			//  
			
			
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
		
			
	}
}
