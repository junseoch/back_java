package castingtask;

public class CastingTask5 {
	public static void main(String[] args) {
		
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기 (정수)
		
	
//		"12.123" -> 12.123 -> 12
//		
//		
//		double numDouble1 = 0.0;
//		double numDouble2 = 0.0;
//		double numString3 = 0.0;
//		
//		String num1 = "12.123", num2 = "345.789", num3 = "6789"; 
//		
//		
//		int numDouble1 =  (int)Double.parseDouble(num1);
//		int numDouble2 =  (int)Double.parseDouble(num2);
//		int numString3 = Integer.parseInt(num3);
//		
//		String str1 = String.valueOf(numDouble1); // 문자열로 변환
//		String str2 = String.valueOf(numDouble2);
//		String str3 = String.valueOf(numString3);
//		
//		String result = str1 + str2 + str3;
//		
//		int finalResult = Integer.parseInt(result);
//		
//		System.out.printf("정수 : %d", finalResult);
		
		
		
//      "6789"
//      "345.789"
//      "12.123";
//      3개 값을 더해서 123456789를 출력하기
      String str1 = "12.123", str2 = "345.789", str3 = "6789", result = "";
      double dou1 = 0.0, dou2 = 0.0;
      int num1 = 0, num2 = 0, num3 = 0;
      
      dou1 = Double.parseDouble(str1);
      dou2 = Double.parseDouble(str2);
      num1 = (int)dou1;
      num2 = (int)dou2;
      num3 = Integer.parseInt(str3);
      str1 = String.valueOf(num1);
      str2 = String.valueOf(num2);
      str3 = String.valueOf(num3);
      result = str1 + str2 + str3;
            
      System.out.println(result);
		

	}
}
