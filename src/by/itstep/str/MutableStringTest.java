package by.itstep.str;

public class MutableStringTest {
    public static void main(String[] args) {
        StringBuffer sBuff;

        StringBuilder sBuild = new StringBuilder();
        sBuild.append("Hello");
        String str = null;
        sBuild.append(str);
        sBuild.append(123);
        System.out.println(sBuild.toString());

        StringBuilder sBuild2 = new StringBuilder(128);
        sBuild2.append("Hello World!");
        sBuild2.append("Hello World!");
        sBuild2.append("Hello World!");
        System.out.println(sBuild2);

        StringBuilder sBuild3 = new StringBuilder("1024");
        StringBuilder sBuild4 = new StringBuilder(sBuild);
        StringBuilder sBuild5 = new StringBuilder(sBuild.append(sBuild2));

        System.out.println(sBuild5.reverse());
        System.out.println("capacity: " + sBuild5.capacity());
        System.out.println("length: " + sBuild5.length());
        System.out.println("free: " + (sBuild5.capacity() - sBuild5.length()));

        String words [] = sBuild5.reverse().toString().split(" ");
        for (String word: words) {
            System.out.println(word);

        }


        HTMLTableBuilder htmlTable = new HTMLTableBuilder();


        htmlTable.addHeaders("ID", "NAME", "AVG");
        System.out.println(htmlTable.build());




    }
}
