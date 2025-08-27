package castingTask4;

//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketMember extends Customer{
	
	public MarketMember() {;}

	public MarketMember(String name, String number, int money) {
		super(name, number, money);
	}
	
}
