package classTest;

// 동물(ClassTask)
// 이름(name), 나이(age), 먹이(feed)
// 추상화
// 기본 생성자, 초기화 생성자
// 실제 값이 있는 객체(객체화)

public class ClassTask {

	// 필드 : 공통 속성
	String name;
	int age;
	String feed;
	
	// 초기화 생성자
	// 리턴값 없음
	
//	생성자의 오버로딩
	public ClassTask() {;}
	public ClassTask(String name, int age, String feed) {
		this.name = name; // 자기 자신의 주소값
		this.age = age;
		this.feed = feed;
	}
	
	public static void main(String[] args) {
		ClassTask ct1 = new ClassTask("강아지", 4,"잡식"); // 객체화 
//		new ClassTask("강아지", 4,"잡식") -> 생성자 
		ClassTask ct2 = new ClassTask("고양이", 7, "잡식");
		System.out.println(ct1.age);
	}

	
	
}
