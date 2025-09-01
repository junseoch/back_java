package objectTask;


// 상품 2개 객체화해서 비교
public class ObjectTask1 {
	public static void main(String[] args) {
		
		Product product1 = new Product(1, "파인애플", 20000, 12, "필리핀");
		Product product2 = new Product(2, "수박", 20000, 4, "제주도");
		
		if(product1.equals(product2)) {
			System.out.println("같은 상품입니다");
		} else {
			System.out.println("다른 상품입니다");
		}
		
	}
}
