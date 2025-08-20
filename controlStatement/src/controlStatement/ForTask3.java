package controlStatement;

public class ForTask3 {
   public static void main(String[] args) {
//      1 ~ 100까지 7의 배수의 합 구하기
//      3분
//      int result = 0;
//      for(int i = 0; i < 100 / 7; i++) {
//         result += 7 * (i + 1);
//      }
//      System.out.println(result);
      
//      a ~ z까지 반복해서 아래의 결과를 출력한다
//      "aBcDeFg ... Z"
//      'a': 97
//      'A': 65
      for(int i = 0; i < 26; i++) {
         System.out.print((char)((i % 2 == 0 ? 97 : 65) + i));
      }
      
      
      
   }
}








