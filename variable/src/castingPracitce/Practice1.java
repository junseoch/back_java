package castingPracitce;

public class Practice1 {
	public static void main(String[] args) {
		

		int num1 = 1;
		String num2 = "8.24";
		String num3 = "7";
		
		// 문자열 -> 실수형
		double resultNum2 = Double.parseDouble(num2);
		System.out.println(resultNum2);
		
		// 문자열 -> 정수형  "7" -> 7
		int resultNum3 = Integer.parseInt(num3);
		System.out.println(resultNum3);
		
		// Wrapper 클래스
		// 문자열 -> 정수  "233" -> 233
		String str = "233";
		Integer.valueOf(str);
		System.out.println(str);
		
		// 어떤 값을 문자열로 변환
		// 22 -> "22"
		int num4 = 22;
		String.valueOf(num4);
		System.out.println(num4);
		
		// 문자열 -> 문자형
		// "7" -> '7'
		String number = "7";
		char charNumber = number.charAt(0);
		System.out.println(charNumber);
		
		// 문자형 -> 문자열
		char c = '7';
		String str2 = c + "";
		System.out.println(str2);   // "7"
		
		// 문자형 -> 문자열
		// '2' -> "2"
		char c2 = '2';
		
		String result = String.valueOf(c2);
		System.out.println(result);
		
	}
}
