package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3Practice {
   public static void main(String[] args) {
      ArrayList<Product> products = new ArrayList<Product>();
      
      products.add(new Product(1L, "컴퓨터", 800000, 20));
      products.add(new Product(2L, "책상", 150000, 100));
      products.add(new Product(3L, "마우스", 50000, 15));
      products.add(new Product(4L, "모니터", 300000, 150));
      products.add(new Product(5L, "키보드", 30000, 80));
      
//      System.out.println(products);
      
//      5분
//      1. 재고가 100개 이상인 상품만 출력
//      for(Product product: products) {
//         if(product.getStock() >= 100) {
//            System.out.println(product);
//         }
//      }
      
//      2. 마우스 가격을 100000원으로 변경 
//      Product foundProduct = null;
//      for(Product product: products) {
//         if(product.getId() == 3L) {
//            foundProduct = product;
//         }
//      }
//      foundProduct.setPrice(100000);
//      
//      try {
//         if(products.contains(foundProduct)) {
//            products.set(products.indexOf(foundProduct), foundProduct);
//         }
//      } catch (IndexOutOfBoundsException e) {
//         System.out.println("ArrayListTask3 예외 발생");
//         System.out.println("인덱스 똑바로 입력하세요.");
//      } catch (Exception e) {
//         System.out.println("ArrayListTask3 예외 발생");
//         System.out.println("알 수 없는 예외 발생");
//         e.printStackTrace();
//      }
//      
//      System.out.println(products);
      
//      3. 상품 재고가 100개 이하인 상품을 삭제
      ArrayList<Product> newProducts = new ArrayList<Product>();
      for(Product product : products) {
         if(product.getStock() > 100) {
            newProducts.add(product);
         }
      }
      products = newProducts;
      System.out.println(products);
      
      
//      4. 상품 이름이 마우스인 상품 삭제
//      .remove()
      for(int i = 0; i < products.size(); i++) {
         Product product = products.get(i);
         if(product.getName().equals(new String("마우스"))) {
            products.remove(products.indexOf(product));
         }
      }
      System.out.println(products);
      
   }
}














