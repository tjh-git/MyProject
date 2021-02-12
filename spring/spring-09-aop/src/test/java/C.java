import java.util.Date;
public class C extends Date{
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        new C().test();
    }
}