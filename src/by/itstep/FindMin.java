package by.itstep;

public class FindMin {
    public static void main(String[] args) {
        int a = 10, b = 7, c = 12;
        int min = a;

        if (a < b) {
            min = a;
        }
        if (min > c) {
            min = c;
        }
        System.out.println(min);
    }
}
