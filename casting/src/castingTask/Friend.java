package castingTask;

// 단순히 타입을 주기 위한 클래스
public class Friend {
	String name;
	int age;
	
	public Friend() {;}

	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void withPlay() {
		System.out.println("친구와 놀기");
	}
}
