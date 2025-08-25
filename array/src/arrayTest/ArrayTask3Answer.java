package arrayTest;

public class ArrayTask3Answer {
	public static void main(String[] args) {
//		1. 1~20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력하기
//		짝수: 값 % 2 == 0
		int[] arData1 = new int[10];
		for(int i = 0; i < 10; i++) {
			arData1[i] = (i + 1) * 2;
//			arData1[i] = arData1[i] + 3;
			arData1[i] += 3;
			System.out.println(arData1[i]);
		}
		
//		2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
		int[] arData2 = {10, 20, 30, 40, 56};
		double average = 0.0;
		for(int i = 1; i < arData2.length; i++) {
			arData2[0] += arData2[i];
		}
		
		average = arData2[0] / (double)arData2.length;
		System.out.println(average);
		
//		3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기
		int[] arData3 = new int[10];
		for(int i = 0; i < arData3.length; i++) {
			arData3[i] = i + 1;
			int value = arData3[i] > 5 ? arData3[i] * 2 : arData3[i];
			System.out.println(value);
		}
		
//		4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//		단 마지막은 *이 붙지 않는다
		int[] arData4 = new int[10];
		for(int i = 0; i < arData4.length; i++) {
			arData4[i] = i + 1;
			System.out.print(arData4[i]);
			if(i != arData4.length - 1) {
				System.out.print("*");
			}
		}
		
		System.out.println("");
//		5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
		int[] arData5 = new int[10];
		for(int i = 0; i < arData5.length; i++) {
			arData5[i] = i + 1;
			if(arData5[i] % 3 == 0) {
				System.out.println(arData5[i]);
			}
		}
	}
}










