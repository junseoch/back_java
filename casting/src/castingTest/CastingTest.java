package castingTest;

class A {
   void test() {
      System.out.println("A");
   }
}
class B extends A{
	// 부모의 메서드를 가져다가 씀 
	@Override
   void test() {
      System.out.println("B");
   } 
   
   void test2() {
      System.out.println("BB");
   }
}

public class CastingTest {
   public static void main(String[] args) {
      A b = new B(); 
      // 메모리에 A만큼만 올라감
      // B를 쓸 수 없음
      b.test();
//      B a = (B)new A();
      
//      B bb = (B)b;
   }
}