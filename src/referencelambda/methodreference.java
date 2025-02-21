package referencelambda;

public class methodreference {
    static  void m1() {
        System.out.println("hello sravani");
    }

    public static void main(String[] args) {
        Runnable ref = methodreference::m1;
        ref.run();
    }
}
