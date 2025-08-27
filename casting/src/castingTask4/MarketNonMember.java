package castingTask4;

//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
public class MarketNonMember extends Customer{
	
	public MarketNonMember() {;}

	public MarketNonMember(String name, String number, int money) {
		super(name, number, money);
	}
	
}
