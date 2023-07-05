package by.itstep.oop.casting;

public class Circle extends Shape {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void print() {
        System.out.println("    .  ");
        System.out.println(".        .");
        System.out.println(".        .");
        System.out.println("    .   ");
    }

    @Override
    public void calculateP() {
        double p = 2 * Math.PI * r;
        setP(p);

    }

    @Override
    public void calculateS() {
        double s = Math.PI * (r * r);
        setS(s);

    }
}
