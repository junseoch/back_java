package castingTask4;

//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketMember extends Member{
	
	String name;
	String number;
	int money;
	int point;
	String coupon;
	
	public MarketMember() {;}
	public MarketMember(String name, String number, int money, int point, String coupon) {
		super();
		this.name = name;
		this.number = number;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
	
	public MarketMember(int money) {
	
		this.money = money;
		
	}
	
	

}
