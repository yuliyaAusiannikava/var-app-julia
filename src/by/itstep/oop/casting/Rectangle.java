package by.itstep.oop.casting;

public class Rectangle extends Shape {
    private double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Square case
     * @param a side
     */
    //  в случае, если клиент вводит только один параметр (для квадрата) - идет в конструктор с двумя
    // параметрами и второе а преобразуется в б
    public Rectangle(double a) {
        this(a, a);
    }

    @Override
    public void print() {
        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }

    @Override
    public void calculateP() {
        setP(2 * (a + b));
    }

    @Override
    public void calculateS() {
        setS(a * b);
    }
}
