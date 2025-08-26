package inheritanceTask;

//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
public class EmployeeTask extends PersonTask{
	int money;
	

	public EmployeeTask() {;}
	public EmployeeTask(String name, int age, String address, int phone, int money) {
		super(name, age, address, phone);
		this.money = money;
	}


	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
	
}
