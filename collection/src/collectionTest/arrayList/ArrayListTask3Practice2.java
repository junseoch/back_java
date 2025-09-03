package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3Practice2 {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
				     // new Product로 상품들을 만듦 
		products.add(new Product(1L, "컴퓨터", 800000, 20));
		products.add(new Product(2L, "책상", 150000, 100));
		products.add(new Product(3L, "마우스", 50000, 15));
		products.add(new Product(4L, "모니터", 300000, 150));
		products.add(new Product(5L, "키보드", 30000, 80));
		
////		System.out.println(products);
//		
//		for(int i = 0; i < products.size(); i++) {
//			if(products.get(i).getStock() > 100) {
//				
//			}
//		}
//		
////		1. 재고가 100개 이상인 상품만 출력
//		for(Product product : products) {
//			if(product.getStock() >= 100) {
//				System.out.println(product); // 클래스
//			}
//			else {
//				continue;
//			}
//		}
		
//		2. 마우스 가격을 100000로 변경
		
		// 상품을 getId로 가져옴
		// 상품을 찾아야 함
//		Product foundProduct = null;
//		for(Product product : products) {
//			if(product.getId() == 3L) {
//				foundProduct = product;
//			}
//		}
//		// 마우스를 정확히 찾음
//		System.out.println(foundProduct);
//		// 찾았으니 가격을 변경
//		foundProduct.setPrice(100000);
//		
//		// 해당 상품의 인덱스를 넘겨줘서 그 상품을 변경함
//		try {
//			if(products.contains(foundProduct)) {
//				products.set(products.indexOf(foundProduct), foundProduct);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		System.out.println(products);
		
////		3. 상품 재고가 100개 이하인 상품 삭제
//		for(Product product : products) {
//			if(product.getStock() <= 100) {
//				products.remove(products.indexOf(product));
//			}
//		}
		
	      ArrayList<Product> newProducts = new ArrayList<Product>();
	      
	      for(Product product : products) {
	    	  if(product.getStock() > 100) {
	    		  newProducts.add(product);
	    	  }
	      }
	      
	      System.out.println(products);
		
//		4. 상품 이름이 마우스인 상품 삭제
//	      .remove()
	      
	      for(Product product : products) {
	    	  // 이름과 어떤 상품이 가지고 있는지를 비교
	    	  // 같으면 그 상품이 있는 것 -> 삭제해야 함
	    	  if(product.getName().equals(new String("마우스"))) {
//	    		  products.remove(products.indexOf(product));
	    	  }
	    	  
	      }
		
	}
	
}
