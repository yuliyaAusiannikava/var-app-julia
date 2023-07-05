package by.itstep.oop.init;

public class Test {
    int val;

    static {
        System.out.println("Test static block");
    }

    Test() {
        System.out.println("Test constructor");
        System.out.println(val);
    }

    public static void main(String[] args) {
        new Test();
        new Third();

        double pi = Math.PI;


    }
}
