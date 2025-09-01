package lambdaPractice;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
	
//	사칙 연산 결과를 출력하는 메서드
							// 주소값을 넘긴 것
	public void showClacResult(CalcResult calcResult) {
		System.out.println(calcResult.getSumResult());
		System.out.println(calcResult.getSubResult());
		System.out.println(calcResult.getMulResult());
		System.out.println(calcResult.getDivResult());
	}
	
	public static void main(String[] args) {
		
		// lambdaTask2 구현하기
		// 두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드
		LambdaInter2 labdaInter2 = (num1, num2) -> {
			// 객체를 만들어서 calcResult를 리턴해야 함
			CalcResult calcResult = new CalcResult();
			// calcResult 객체를 변수처럼 쓸 수 있음
			
			// 연산한 결과를 각각 calcResult에 전달해야 함
			calcResult.setSumResult(num1 + num2);
			calcResult.setSubResult(num1 - num2); 
			calcResult.setMulResult(num1 * num2);
			calcResult.setDivResult(num1 / num2);
			return calcResult;
		};
		
		CalcResult cr = labdaInter2.calc(10, 5);
		
		// LambdaTask 클래스 먼저 가져옴
		LambdaTask lambdaTask = new LambdaTask();
		lambdaTask.showClacResult(cr);
		
	}
}
