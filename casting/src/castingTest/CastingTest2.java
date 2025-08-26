package castingTest;

class Car {
   public Car() {;}
   void engineStart() {
      System.out.println("열쇠로 시동 켬");
   }
}

class SuperCar extends Car {
   public SuperCar() {;}
   @Override
   void engineStart() {
      System.out.println("음성으로 시동 켬");
   }
   
   void openRoof() {
      System.out.println("뚜껑 오픈!");
   }
}

public class CastingTest2 {
   public static void main(String[] args) {
      Car matiz = new Car(); // 객체화
      SuperCar ferrari = new SuperCar(); // 객체화
      Car noOptionFerrari = new SuperCar(); // 업 케스팅
      SuperCar optionFerrari = (SuperCar)noOptionFerrari;  // 다운 케스팅
      
      // 오류
      // SuperCar ferrari = new Car();

//      객체 instanceof 타입: 참 또는 거짓
//      자식은 부모 타입이다.
      System.out.println(matiz instanceof Car);
//      부모는 자식 타입이 아니다.
      System.out.println(matiz instanceof SuperCar);
      
//      자식 : SuperCar  + @
//      부모  : car
      
      System.out.println(ferrari instanceof Car);
      System.out.println(ferrari instanceof SuperCar);
      
      System.out.println(noOptionFerrari instanceof Car);
      System.out.println(noOptionFerrari instanceof SuperCar);
      // 다운케스팅 되어도 부모가 준 상속은 그대로 있음
      System.out.println(optionFerrari instanceof Car);
    
      System.out.println(optionFerrari instanceof SuperCar);
      
      
      
      
   }
}










