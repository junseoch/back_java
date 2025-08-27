package anonyMousTask;

public class StarBucks {
   
   public static void main(String[] args) {
      Form form = new Form() {
         
         private String[] menus;
         
         public String[] getMenus() {
            return menus;
         }

         public void setMenus(String[] menus) {
            this.menus = menus;
         }

         @Override
         public void showMenus() {
            for(String menu: this.getMenus()) {
               System.out.println(menu);
            }
         }
         
         @Override
         public void sell(String menu) {
            for(String m: this.getMenus()) {
               if(menu.equals(m)) {
                  System.out.println("판매 완료");
               }else {
                  System.out.println("판매 준비중");
               }
            }
         }
         
         @Override
         public void registerMenus(String[] menus) {
            this.setMenus(menus);
         }
      };
      
      
//      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
      
      
      
   }
}








