package castingcast;

public class CastingTask2 {
	public static void main(String[] args) {

		
		
//		1 + "8.24" + "7.8" 두 값을 더해서 115로 만들기
//		"8.24" -> 8.24 -> 8
//		"7.8" -> 7.8 -> 7
		// 8 + 7
		
		int num1 = 1;
		String num2 = "8.24";
		String num3 = "7.8";
		int resultDouble1 = 0;
		int resultDouble2 = 0;
		int resultInt = 0;
		int result = 0;
		int result4 = 0;
				
		
		// "8.24" -> 8.24 -> 8

		resultDouble1 = (int)Double.parseDouble("8.24");
		
		resultDouble2 = (int)Double.parseDouble("7.8");
		
		
		result = resultDouble1 + resultDouble2;
	
		
		String toStringNum = num1 + ""; 
		// 1을 "1"로 바꿈
		
		
		System.out.println(toStringNum + result); // 8
		
		String n = String.valueOf(1);
		
		
		
	
		
	}
}
