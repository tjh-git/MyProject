public class TestOther {
    static int x = 10;


    static {
        x += 5;
    }

    public static void main(String args[]) {
        System.out.println("x =  " + TestOther.x);
    }

    static {
        x /= 3;
    }
}
