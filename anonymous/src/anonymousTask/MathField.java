package anonymousTask;


public class MathField {
   public static void main(String[] args) {
      
//      메서드 구현 후 4개의 메서드 모두 사용
	   // 인터페이스가 갖고 있는 메서드를 쓰려면 인터페이스 호출
	   // 강제성이 있음
	   
	   // 변수에 넣어야 가져다가 메서드를 쓸 수 있음
	    MathTask mathTask = new MathTask() {
		
		@Override
		public void printName(String name) {
			System.out.println(name);
		}
		
		@Override
		public String concat(String str1, String str2) {
			return str1 + str2;
		}
		
		@Override
		public CalcResult calc(int num1, int num2) {
			
			CalcResult calcResult = new CalcResult(); // 객체화
			calcResult.setSumResult(num1 + num2);
//			num1 - num2
//			num1 * num2
//			num1 / num2
			
			return calcResult;
		}
		
		@Override
		public int add(int num1, int num2) {
			System.out.println(num1 + num2);
			return 0;
		}
	};
      
      mathTask.printName("홍길동");
      mathTask.add(4, 7);
      
      CalcResult cr = mathTask.calc(5, 3);
      
      // 실제 값을 get으로 가져와야함
      System.out.println(cr.getSumResult());
      
      
      
      
   }
}
