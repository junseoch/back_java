package classTest;

// 이름, 나이, 먹이
// 토끼, 강이지, 고양이 객체(객체화)

public class ClassTestPractice {
	
	String name;
	int age;
	String feed;
	
	// 생성자의 오버로딩
	
	// 기본 생성자
	public ClassTestPractice() {;}
	// 초기화 생성자
	// 객체에 구체적인 값들을 넣어줘야 하기 때문에 초기화를 해야함
	public ClassTestPractice(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	
	
	public static void main(String[] args) {
		ClassTestPractice ctp1 =  new ClassTestPractice("토끼", 5, "당근");
		ClassTestPractice ctp2 =  new ClassTestPractice("강아지", 8, "잡식");
		ClassTestPractice ctp3 =  new ClassTestPractice("고양이", 2, "잡식");
	}
	
	
}
