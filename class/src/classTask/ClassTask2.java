package classTask;

class Market {
//   1. 상품명, 상품가격, 상품재고
//   판매(sell)메서드
//   판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
	
	String productName;
	int productPrice;
	int stock;
	
	public Market() {;}
	public Market(String productName, int productPrice, int stock) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.stock = stock;
	}

	public void sell(Customer customer) {
	// 고객의 할인율 계산
	// 마켓의 name * 할인율
	// 100 * 0.1 = 10%
	//  상품가격에 할인율 곱하걸 원래 가격의 상품가격에 빼면 할인이 적용된 가격 
	double discountPrice = productPrice - (productPrice * customer.salePercent);
		System.out.println(discountPrice);
	}
}
class Customer {
//   2. 이름, 폰, 돈, 할인율
	String name;
	String phone;
	int money;
	double salePercent;
	
	public Customer() {;}
	public Customer(String name, String phone, int money, double salePercent) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.salePercent = salePercent;
	}
}

public class ClassTask2 {
   public static void main(String[] args) {
//      3. 마켓, 소비자를 객체화 시키고,
//      소비자에게 마켓의 물건을 판매
//      마켓의 상품 재고와, 소비자의 남은 금액을 출력
	   
	   Market market = new Market("포도",10000, 3);
	   
	 
	   Customer customer1 = new Customer("홍길동", "010-1234-5678", 50000, 0.1); // 할인율 10%
       Customer customer2 = new Customer("김철수", "010-1111-3343", 20000, 0.2); // 할인율 20%
   }
   
}
