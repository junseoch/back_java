package access;

// 이름 ,주소, 나이

// 1. 필드
// 
public class Member {
	private String name;
	private String address;
	private int age;
	
	// 1. 접근하지 마라
	// 2. getter, setter을 만들어라
	
	public Member() {;}

	public Member(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// getter, setter 단축키
	// 컨트롤 알트 S + R  , 알트 + A , 알트 + R
	
	
	
}
