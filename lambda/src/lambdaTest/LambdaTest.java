package lambdaTest;

public class LambdaTest {
   public static void main(String[] args) {
	   
	   // 람다 인터페이스를 구현한 익명클래스
	   // 익명 클래스가 lambdaInter 객체에 담김
	   // 									    리턴이 없음
	   LambdaInter lambdaInter = (num1, num2) -> {System.out.println(num1 + num2);};
	
	   // 그 인터페이스에 함수형 인터페이스로 구현된 하나의 메서드만 쓰면 됨
	   lambdaInter.printAddResult(10, 20);
	   
	   // 중괄호를 생략하면 통채로가 리턴값!
	   LambdaInter2 lambdaInter2 = (num1, num2) -> new CalcResult();
	   LambdaInter2 lambdaInter22 = (num1, num2) -> { return new CalcResult();};
	   
	   LambdaInter3 lambdaInter3 = (num) -> num % 2 == 0;  

	   
	   
   }

}