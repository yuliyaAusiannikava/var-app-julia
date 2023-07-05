package by.itstep.oop.casting;

public abstract class JavaProgrammer {

    abstract void makeCode();

    public void playTennis(){
        System.out.println("Playing tennis...");
    }
}

class JuniorJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write so-so code here.");
    }

    void makeCoffee(){
        System.out.println("Making coffee for all staff.");
    }
}

class MiddleJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some good code here.");
        playTennis();
    }
}

class SeniorJavaDeveloper extends JavaProgrammer{

    @Override
    void makeCode() {
        System.out.println("Write some perfect code here.");
        playTennis();
    }

    void leaveOffice(){
        System.out.println("Can leave office");
    }
}

class Company {
    public static void main(String[] args) {
        JuniorJavaDeveloper junior = new JuniorJavaDeveloper();
        JavaProgrammer programmer = junior; //неявное приведение типов (апкастинг)

        Object o = (Object) new SeniorJavaDeveloper(); //явное приведение типов (апкастинг)
        Object o2 = (JavaProgrammer) new MiddleJavaDeveloper(); //неявный апкастинг к классу object

        JavaProgrammer jp = new SeniorJavaDeveloper();

        SeniorJavaDeveloper sjd1 = (SeniorJavaDeveloper) jp; //downcasting
        sjd1.leaveOffice();

        JavaProgrammer jp1 = new JuniorJavaDeveloper(); // new SeniorJavaDeveloper();

        if(jp1 instanceof SeniorJavaDeveloper){
            SeniorJavaDeveloper sjd = (SeniorJavaDeveloper)jp;
            sjd.leaveOffice();
        } else if(jp.getClass() == JuniorJavaDeveloper.class){
            JuniorJavaDeveloper jun = (JuniorJavaDeveloper)jp;
            jun.makeCoffee();
        }

        //
        JavaProgrammer [] programmers = {junior, (JavaProgrammer) o, (JavaProgrammer) o2, jp};
        System.out.println("Programmers: " + programmers.length);
        for (JavaProgrammer prog: programmers) {
            prog.makeCode();

        }

    }
}
