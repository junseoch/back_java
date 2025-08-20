package controlStatement;

public class ForTask2Practice {
   public static void main(String[] args) {
//      10 ~ 1까지 출력
//      for(int i = 0; i < 10; i++) {
//         System.out.println(10 - i);
//      }
//      
//      for(int i = 0; i < 5; i++) {
//         System.out.println(i + 1 + "번 째 홍길동");
//      }
//      
//      "abcd"를 이용해서 97 98 99 100을 출력하기
//      int c = "abcd".charAt(0);
//      for(int i = 0; i < 4; i ++) {
//         System.out.println(c + i);
//      }
      
//      "abcd"에서 c빼고 출력 a b c d -> a b d
//     	for(int i = 0; i < 3; i++) { // 0 1 2
//    	  char c2 = "abcd".charAt(i == 2 ? i + 1 : i);
//    	  System.out.println(c2);
//     }
     	
//     "abcde"에서 b랑 e빼고 출력 acd
	   // 1 , 5 빼고 출력
	   
	   // for문
	   // charAt으로 먼저 출력
	   // if 인덱스 1, 4일 때 제외하고 출력
	   String num2 = "abcde";
	   for (int i = 0; i < num2.length(); i++) {
           char c = num2.charAt(i);

           // b,e 건너뛰기
           if (c == 'b' || c == 'e') {
               continue;
           }

           System.out.print(c); // 조건에 걸리지 않은 문자만 출력
       }
	   
	   
//      1~30까지 짝수를 출력
//      for(int i = 0; i < 30; i++) {
//         if((i + 1) % 2 == 0) {
//            System.out.println(i + 1);
//         }
//      }
      
//      1~30까지 짝수의 개수 출력
//      int count = 0;
//      for(int i = 0; i < 30; i++) {
//         if((i + 1) % 2 == 0) {
//            count++;
//         }
//      }
//      
//      System.out.println(count);
      
//      1~30까지 짝수의 총합 구하기
//      int total = 0;
//      for(int i = 0; i < 30; i++) {
//         int value = i + 1;
//         if(value % 2 == 0) {
//            total += value;
//         }
//      }
//      
//      System.out.println(total);
      
//      1~30까지 짝수중 7번째 숫자를 출력하기
      int count = 0;
      for(int i = 0; i < 30; i++) {
         int value = i + 1;
         if(value % 2 == 0) {
            count++;
            if(count == 7) {
               System.out.println(value);
               break;
            }
         }
      }
            
//      1~30까지 짝수중 첫번째 짝수와 마지막 짝수만 더해서 출력하기
      int min = 0;
      int max = 0;
      for(int i = 0; i < 30; i++) { // 1 ~ 30
       
         if(i + 1 % 2 == 0) {
            if(min == 0) { 
               min = i + 1;
            }
            if(i + 1 < min) {
               min = i + 1;
            }
            if(i + 1 > max) {
               max = i + 1;
            }
         }
      }
      System.out.println(min + max);
   }
}
















