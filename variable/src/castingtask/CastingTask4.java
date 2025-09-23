package castingtask;

public class CastingTask4 {
//	String.valueOf(값);
//	어떤 값을 문자열로 형변환 시켜주는 메서드
	// 값을 -> 문자열
	public static void main(String[] args) {

	      // 아스키 코드 a : 97, A : 65
	      // J : 74   j : 106 
	      // K : 75  k : 107
	    
//	      모두 대문자로 바꿔서 출력
//	      아스키코드
//	      'A', 'J', 'K'
		
		char a = ' ', j= ' ' , k = ' '; 
		
		
		a = 'a';
		j = 'j';
		k = 'k';   
	      
	      // 97 - 32 = 65
	      int charA = a - 32;
	      int charJ = j - 32;
	      int charK = k - 32;
	      
	      // 65 -> 'A'
	      char result = (char)charA;
	      
	      char num = (char)charA;
	      
	      char result2 = (char)charJ;
	      char result3 = (char)charK;
	      
	      
	      System.out.println(num);
	      System.out.println(result2);
	      System.out.println(result3);
	      
	      
		
	}
}
