package lambdaTask;

import lambdaTest.CalcResult;
import lambdaTest.LambdaInter2;

public class LambdaTask {
	
	//  사칙연산의 결과를 출력하는 메서드
	  public void showClacResult(CalcResult calcresult) { // 클래스의 주소값을 넘김
		  
		  System.out.println(calcresult.getSum());
		  System.out.println(calcresult.getSub());
		  System.out.println(calcresult.getMul());
		  System.out.println(calcresult.getDiv());
		  
	  }
		
   public static void main(String[] args) {
//      LambdaInter2 구현하기
//      두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드
      LambdaInter2 lambdaInter2 = (num1, num2) ->  { 
    	  // calcresult를 쓰기 위해서 getter, setter 만듦
    	  
    	  CalcResult calcresult = new CalcResult();
    	  // CalcResult 클래스의 calcresult에 접근해서 getter, setter로 값을 가져오거나 수정하기 위해
    	  
    	  calcresult.setSum(num1 + num2);
    	  calcresult.setSub(num1 - num2);
    	  calcresult.setMul(num1 * num2);
    	  calcresult.setDiv(num1 / num2);
    	  
    	    return calcresult;
    	   };
    	   
    	   CalcResult calcresult = lambdaInter2.calc(5, 3);
    	   
    	   LambdaTask lt = new LambdaTask(); // 클래스를 먼저 가져옴
    	   lt.showClacResult(calcresult);
    	   
//    	   System.out.println(calcresult.getSum());
//    	   System.out.println(calcresult.getSub());
//    	   System.out.println(calcresult.getMul());
//    	   System.out.println(calcresult.getDiv());
    	   
//    	     인터페이스 , 메서드
   }
   
   
   		
}
