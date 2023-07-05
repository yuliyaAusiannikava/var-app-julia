package by.itstep.oop;


public class Chair {
    String name;
    String color;
    String fabric;
    int leg;
    int height;
    boolean back;
    String tree;

    void treeWork() {
        if (tree == "oak") {
            System.out.println(tree + " is a valuable tree and expensive tree!");
            System.out.println("You must be careful with it!");
            System.out.println("The work will take a lot of time!");
        } else {
            System.out.println("The work with " + tree + " will take three days");
        }
    }

    void backDesign() {
        if (back == true) {
            System.out.println("This chair is more comfortable");
        } else {
            System.out.println("It's your choice...");
        }
    }

    void legHandling(){


    }

}

class chairTester{
    public static void main(String[] args) {
        Chair myChair = new Chair();
        myChair.tree = "oak";
        myChair.back = true;

        myChair.backDesign();
        myChair.treeWork();
    }
}
