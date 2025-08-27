package castingTask2;

public class Orc extends Monster{
   
//   {
//      this.name = "오크";
//      this.item = "도끼";
//      this.hp = 10;
//   }
   
   public Orc(String name, String item, int hp) {
      super(name, item, hp); // 각각의 값들을 부모의 초기화 생성자로 초기화 해줌
   }
   	
   
   void speak() {
      System.err.println("콜록!");
   }
   
}