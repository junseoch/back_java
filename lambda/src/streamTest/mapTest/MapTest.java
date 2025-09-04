package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(1L, "장보고", 20, "기획자");
      User user3 = new User(1L, "이순신", 35, "디자이너");
      User user4 = new User(1L, "이성계", 42, "개발자");
      User user5 = new User(1L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);
      
//      System.out.println(users);
//      
//      // users.stream().map((user) -> user.getName()) 통채로가 리턴값
//      
//      users.stream().map((user) -> user.getName()).forEach((name) -> System.out.println(name));; // 통채로 리턴
//      
////    1. ArrayList 생성 . datas1
////    2. 1 ~ 10까지 datas1에 추가한다
////    3. datas1의 모든 값을 10배로 변경한다
////    4. datas1의 모든 값을 출력한다
//      
      ArrayList<Integer> datas1 = new ArrayList<Integer>();
      
      IntStream.rangeClosed(1, 10).forEach((n) -> {datas1.add(n);} );
//      System.out.println(datas1);
      
//    3. datas1의 모든 값을 10배로 변경한다
      datas1.stream().map((n) -> n * 10).forEach((n) -> {System.out.println(n);});
      // map은 원본 데이터를 수정하지 않음
      
      
//    2. .map() 
//    ArrayList의 값을 알파벳으로 바꿔서 출력하기
//    ex)원본 [1, 2, 3, 4, 5, ..., 10]
//    ex)변경 ['A', 'B', 'C', ... 'J']
//     1 -> 97 -> '97'   65 -> A
      System.out.println((char)65);
      
      // 정수 -> char
      
//      System.out.println(datas1);
      datas1.stream().map((n) -> n + 64).forEach((n) -> { System.out.println((char)(int)(n));});
      
      
      
      
   }
}
