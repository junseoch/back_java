package annonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
		
		// interface의 myinter의 메서드들을 메인에서 만들어서 씀
		MyInter myInter = new MyInter() {
			
			//ABCD를 전달하면 ABDE를 출력해주는 메서드
			@Override
			public void getString(String content) {
				// toCharArray : 문자열 content를 char의 배열로 만듦
				char[] chars = content.toCharArray();
				// char타입인 c에 chars의 값들이 순차적으로 들어옴
				for(char c: chars) {
					// [ 'A', 'B', 'C', 'D']
					System.out.print((char)(c > 66 ? c + 1: c));
				}
			}
			
//			2. 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메서드
			// toUpperCase
			// toLowerCase
			// 'A' : 65  ~ 'Z' : 90
			// 'a' : 97 ~ 'z' : 122
			@Override
			public String changeUpperOrLower(String content) {
				
				String result = "";
				// 문자열을 char배열로 만듦
				char[] ch = content.toCharArray();
				// c : 'a', 'b', 'c', 'd'
				for(char c : ch) {
					if(c >= 65 && c <= 90) {
						System.out.print(String.valueOf(c).toLowerCase());
					}
					else if(c >= 97 && c <= 122) {
						System.out.print(String.valueOf(c).toUpperCase());
					}
				}
				
				return result;
			}
		}; 
		
		// 메서드 사용
		myInter.getString("ABCD");
		System.out.println("");
		myInter.changeUpperOrLower("abcCDE");
		
		
	}
	
}
