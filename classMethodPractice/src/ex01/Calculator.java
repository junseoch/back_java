package ex01;

// ※요구사항
//  필드 없음 -> 기본 생성자만 필요

public class Calculator {
	
	public Calculator() {;}
	
	// 정수 2개 받아서 출력만 함
	public void calcNum(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		System.out.printf("문제 1 정답:%d",result);
	}
	
	public double calcNum(double num1, int num2) {
		System.out.println(num1 + num2);
		
		return num1 + num2;
		// 자동 형변환
		// 정수 + 실수 = 실수
	}
	
	// 실수형 하나 받아서 정수형으로 리턴
	public double calcNum(double num1) {
		double result = (int)num1;
		return result;
	}
	
	
	
}
