package castingTask4;

//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketNonMember extends Member{
	
	String name;
	String number;
	int money;
	int point;
	String coupon;
	
	public MarketNonMember() {;}

	public MarketNonMember(String name, String number, int money, int point, String coupon) {
		this.name = name;
		this.number = number;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}

	
	
	
	
	
}
