package castingTask4;

public class Market {

	String name;
	public Market() {;}
	
//  - 등록된 상품만 판매할 수 있다.
//  - 유저가 가진 돈보다 적으면 판매할 수 없다.
//  - 유저가 마다의 할인율이 적용된다.
//     1. 비회원 할인율 5% 적용
//     2. 멤버 할인율 30% 적용
//  - 등록된 상품의 재고보다 작으면 판매할 수 없다.
	
	// 누구한테 받을 거냐
	void sell(Product product, Member member) {
		if(product.getPrice() < member.getMoney()) {
			System.out.println("판매 가능");
		}
		else {
			System.out.println("판매 불가");
		}
	}
	
//  - 상품 등록은 최대 5개까지만 할 수 있다.
//  (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//  - 마트에 같은 이름의 상품은 등록할 수 없다.
	void register(Product product) { // 상품 모르니까 상품 받겠지
		// 반복문 continue
		// 5개를 하나에 담아야 함
		// 배열, 클래스 : 필드에 등록
		// 순서가 없음 => 
	}
	
//  3. 포인트 적립 메서드
//  - 비회원은 5%
//  - 회원은 10%
	void earn(Member member, Product product) {
			// 비회원 : MarketNonMember.point = (product.price * 0.05)
			// 회원 : MarketMember.point = (product.price * 0.10)
	}
	
//  4. 만약 비회원이라면 
//  쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!
	void provice(Member member) {
		
	}
	
}
