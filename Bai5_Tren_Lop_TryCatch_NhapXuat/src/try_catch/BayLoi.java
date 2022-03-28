package try_catch;

//minh họa bẫy lỗi lan truyền
public class BayLoi {
    public static void main(String[ ] args){
         System.out.println("Goi phuong thuc A()");
            A();                        
    }
    public static void A(){

        try {
            B();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void B() throws Exception {
        try {
            C();
        } catch (Exception e) {
            System.out.println("Lỗi ở B");
            throw new Exception("throw Lỗi ở B ");
        }
    }
    public static void C() throws Exception{
       //try{
        float a = 2/0;    
      // }
      /* catch (Exception c){
           System.out.println(c.getMessage());
           System.out.print("ctr có lỗi. liên hệ với ncc");
       }*/
    }
}
