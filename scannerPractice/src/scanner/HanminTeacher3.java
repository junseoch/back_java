package scanner;

public class HanminTeacher3 {
	
//  "9876"  
//  "543.789"
//  "21.123";
//  3개 값을 더해서 987654321를 출력하기
	// 정수로 출력
	public static void main(String[] args) {
		
		String str1 = "", str2 = "", str3 = "";
		
		// 9876
		// 543.789 -> 543
		// 21.123 -> 21
		
		int num1 = 0;
		int num2 = 0, num3 = 0;
		
		str1 = "9876";
		str2 = "543.789";
		str3 = "21.123";
		
		num1 = Integer.parseInt(str1);
		num2 = (int)Double.parseDouble(str2);
		num3 = (int)Double.parseDouble(str3);
		
		
		String result1 = String.valueOf(num1);
		String result2 = String.valueOf(num2);
		String result3 = String.valueOf(num3);
	
//		System.out.println(num2);
		
		String result = result1 + result2 + result3;
		
		System.out.println(result);
		
	}
	
}
