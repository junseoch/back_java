package lambdaTask;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
public class LambdaTask2 {
	
	
	public static void main(String[] args) {
		// 객체화
		// 객체화를 했으니까 메서드를 쓸 수 있음
		// 함수의 선언
		// 뭘 리턴해야 하나
		
		// 이게 메서드
//		() -> {
//			for(int i = 0; i < 10; i++) {
//				System.out.println(i + 1);
//			}
//		}
		
		PrintNum printNum = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i + 1);
			}
		};
		printNum.printUpTo10();
	
		//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
		PrintString printString = (String str, char c) -> {
				int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == c) {
					count++;
				}
				if(str.charAt(i) != c) {
					continue;
				}
			}
			System.out.println(count);
			return count;
		};
		printString.strCount("aabc", 'a');
		
		
		
	}
	
}
