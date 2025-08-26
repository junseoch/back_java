package castingTask4;

public class Member {
	
	private String name;
	private String number;
	private int money;
	private int point;
	private String coupon;
	
	public Member() {;}
	public Member(String name, String number, int money, int point, String coupon) {
		this.name = name;
		this.number = number;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	
	
	
	
	
}
