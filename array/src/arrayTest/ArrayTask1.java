package arrayTest;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력   // 10 - i * 2 도 해볼것!
	System.out.println("문제1");
	int[] arr1 = {10, 9, 8, 7 ,6, 5 ,4, 2, 1};
	for(int i = 0; i < arr1.length; i++) {
		if(arr1[i] % 2 == 0) {
			System.out.printf("%d ",arr1[i]);
		}
	}
	
	System.out.println("\n문제2");
//      1~10까지 배열에 담고 출력
//		int[] arr2 = new int[10];
	int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
	
	for(int i = 0; i < 10; i++) {
		System.out.printf("%d ",arr2[i]);
	}
	
	System.out.println("\n문제3");
	
//      1~100까지 배열에 담은 후 홀수만 출력
		int[] arr3 = new int[100];
		for(int i = 0; i < 100; i++) {
			arr3[i] = i + 1;
			if(arr3[i] % 2 == 1) {
				System.out.printf("%d ",arr3[i]);
			}
		}
		
		System.out.println("\n실버1");
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
		int result = 0;
		int[] arr4 = new int[100];
		for(int i = 0; i < 100; i++) {
			arr4[i] = i + 1;
			if(arr4[i] % 2 == 1) {
				result =+ arr4[i];
			}
		}
		System.out.println(result);
		
		System.out.println("\n실버2");
//      A~F까지 배열에 담고 출력
		String[]arr5 = {"A", "B", "C", "D", "E", "F"};
		for(int i = 0; i < 6; i++) {
			System.out.print(arr5[i]);
		}
		
		System.out.println("\n실버3");
//      A~F까지 중 C제외하고 배열에 담은 후 출력
//		String[]arr6 = new String[6];
//		String[]arr6 = {"A", "B", "C", "D", "E", "F"};
//		for(int i = 0; i < 6; i++) {
//			if(arr6[i] != "C") {
//				System.out.printf(arr6[i]);
//			}
//		}
		char[] arr6 = new char[5];

//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		int[] arr7 = new int[5];
		
		int max = 0;
		int min = 0;
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			
			arr7[i] = num;
			// min과 max가 같을 수도 있기 때문에 if if
			if(arr7[i] > max) {
				max = arr7[i];
			}
			if(arr7[i] < min ) {
				min = arr7[i];
				System.out.println(min);
			}
		}
//		System.out.print(min);
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		
		
		
		
	
    }
		
}
	


