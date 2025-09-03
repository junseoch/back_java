package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
//		products.add(new Product(1L, "컴퓨터", 800000, 20));
//		products.add(new Product(2L, "책상", 30000, 110));
//		products.add(new Product(3L, "마우스", 50000, 20));
//		products.add(new Product(4L, "의자", 300000, 120));
//		products.add(new Product(5L, "키보드", 200000, 20));
		
//		System.out.println(products);
		
//		1. 재고가 100개 이상인 상품만 출력
//		for(Product p : products) {
//			if(p.getStock() >= 120) {
//				System.out.println(p);
//			}
//		}
//		
//		2. 마우스 가격을 100000원으로 변경 
		
	      Product foundProduct = null;
	      for(Product product: products) {
	         if(product.getId() == 3L) {
	            foundProduct = product;
	         }
	      }
	      foundProduct.setPrice(100000);
	      
	      try {
	         if(products.contains(foundProduct)) {
	            products.set(products.indexOf(foundProduct), foundProduct);
	         }
	      } catch (IndexOutOfBoundsException e) {
	         System.out.println("ArrayListTask3 예외 발생");
	         System.out.println("인덱스 똑바로 입력하세요.");
	      } catch (Exception e) {
	         System.out.println("ArrayListTask3 예외 발생");
	         System.out.println("알 수 없는 예외 발생");
	         e.printStackTrace();
	      }
	      
//	      System.out.println(products);
		
		
//		3. 상품 재고가 100개 이하인 상품을 삭제
	      
	      // 새로운 배열을 만듦
	      
//	      ArrayList<Product> newProducts = new ArrayList<Product>();
//	      
//	      Product foundProduct2 = null;
//	      System.out.println(products);
//	      
//	      for(Product p : products) {
//	    	  if(p.getStock() <= 100) {
//	    		  products.remove(products.indexOf(products));
//	    	  }
//	      }
//	      System.out.println(products);
	      
//	      ArrayList<Product> newProducts = new ArrayList<Product>();
//	      
//	      for(Product product : products) {
//	    	  if(product.getStock() > 100) {
//	    		  newProducts.add(product);
//	    	  }
//	      }
//	      
//	      System.out.println(products);
	      
//	      4. 상품 이름이 마우스인 상품 삭제
//	      
//	      - 이 방법의 경우 에러 발생함
	      for(Product product : products) {
	    	  if(product.getName() == "마우스") {
	    		  products.remove(products.indexOf(products));
	    	  }
	      }
//	      System.out.println(products);
	      
	      // products  ,  removeProduct
	      
	      ArrayList<Product> removeProduct = new ArrayList<Product>();
	      
	      for(Product product : products) {  
	    	  if(product.getName() != "마우스") { // 반대의 경우
	    		  removeProduct.add(product);
	    	  }
	      }
	      products = removeProduct;
	      System.out.println(products);
//	      
//	      // 일반 for문
//	      for(int i = 0; i < products.size(); i++) {
//	    	  if(products.get(i).getName() == "마우스") {
//	    		  products.remove(products.indexOf(products.get(i);
//	    	  }
//	      }
	      
	      
	}
}
