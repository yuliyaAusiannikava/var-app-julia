package by.itstep.oop.inh;

import by.itstep.oop.Cat;

//Класс Child расширяет (наследует) класс Parent
// 'IS - A' relationship. Когда наследник есть родитель
public class Child extends Parent {

    //'HAS - A' relationship
    private Cat cat;
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void jump(){
        System.out.println("Jumping " + getName());
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    //способнсть изменить (переопределить) фукционал, который был до этого в базовом классе
    @Override
    public void sayMyName() {
        //super - ссылка на суперкласс
        super.sayMyName();
        System.out.println("Mое имя " + getName());

    }
}
