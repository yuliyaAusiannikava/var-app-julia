package by.itstep.oop.casting;

//Описать базовые поля функции. Создать экземпляр типа Shape невозможно (запрещено).
public abstract class Shape {

    private double s;
    private double p;
    private String color;

    //абстарктные методы декларируются для реализации наследников. Не имеют тела
    //если в классе существует хоть один абстрактный метод, весь класс должен быть помечен abstract
    public abstract void print();
    public abstract void calculateP();
    public abstract void calculateS();

    public void showInfo(){
        System.out.println("Shape: S = " + s + ", P = " + p + ", Color is " + color);
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
