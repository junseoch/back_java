package objectTask;

// 상품 2개 객체화해서 비교
public class ObjectTask1 {
	public static void main(String[] args) {
		
		Product product1 = new Product("포도",4, 5, "필리핀", 5);
		Product product2 = new Product("사과",5, 10, "필리핀", 5);
		
		System.out.println(product1.equals(product2)); 
		
	}
}
