package anonymousTest;

public class AnonymousTest {

	public static void main(String[] args) {
		// 인터페이스(Study)가 타입
		Study study = new Study() {
			
			// 메서드 선언 -> 클래스 안!
			// 메모리에 못 올라가니까 +@를 채우기 위해 이 부분이 열림
			@Override
			public String setTopic(String topic) {
				return topic;
			}
		};
		
		
		study.setTopic("테스트");
		 
		
	}	
	
}
