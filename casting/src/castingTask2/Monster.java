package castingTask2;

public class Monster {
   String name;
   String item;
   int hp;
   
   public Monster() {;}
   public Monster(String item) {
      this.item = item;
   }
   
   // 이 방법으로 초기화 하는 것이 좋음
   public Monster(String name, String item, int hp) {
      this.name = name;
      this.item = item;
      this.hp = hp;
   }
   
   void dropItem() {
      System.out.println(this.item + "을 드랍했습니다.");
   }
   
}