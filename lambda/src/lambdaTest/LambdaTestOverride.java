package lambdaTest;

public class LambdaTestOverride {
	   public static void main(String[] args) {
		   
		   // 람다 인터페이스를 구현한 익명클래스
		   // 익명 클래스가 lambdaInter 객체에 담김
		   LambdaInter lambdaInter = new LambdaInter() {
			
			@Override
			public void printAddResult(int num1, int num2) {
				System.out.println(num1 + num2);
			}
		};
		
		lambdaInter.printAddResult(10, 20);
		   
		   
	   }
}
	   