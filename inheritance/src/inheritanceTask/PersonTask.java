package inheritanceTask;

// 부모 클래스

//이름, 나이, 주소, 핸드폰
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
public class PersonTask {

	private String name;
	private int age;
	private String address;
	private int phone;
	
	public PersonTask() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonTask(String name, int age, String address, int phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	void work() {
		System.out.println("일을 한다");
	}
	
	void sleep() {
		System.out.println("잠을 잔다");
	}
	
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
	
	
}
