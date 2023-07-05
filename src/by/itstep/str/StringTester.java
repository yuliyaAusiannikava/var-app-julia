package by.itstep.str;



public class StringTester {
    public static void main(String[] args) {
        //String creation
        String str1 = "ABC";

        String str2 = new String("ABC");
        String str3 = new String();

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(chars);

        String str5 = new String(chars, 3, 2);

        //   0123456.....
        String str6 = new String("This is String!");
        int code = (int) 'i';

        System.out.println(code);
        int first = str6.indexOf(code); //индекс в массиве чаров,когда указанный символ появляется первый раз
        System.out.println("'i': " + first);

        int size = str6.length();
        System.out.println("String size is " + size);

        String str7 = str6.toLowerCase();
        System.out.println(str7);

        String str10 = "    Java 20 Java 19 Java 18     ";
        str10 = str10.trim();
        System.out.println(str10);

        int index = str10.indexOf('9');
        System.out.println(index);

        int index2 = str10.indexOf("Java");
        System.out.println(index2);

        int index3 = str10.lastIndexOf("Java");
        System.out.println(index3);

        int index4 = str10.indexOf("1", 18);
        System.out.println(index4);

        String text = "Search the world's information, including webpages, images, videos and more. " +
                "Google has many special features to help you find exactly what you're looking for.";

        boolean isContains = text.contains("images");
        System.out.println(isContains);

        boolean isContains2 = text.indexOf("images") != -1;

        boolean isContains3 = text.contains("Images");
        System.out.println(isContains3);

        char ch = (char) text.codePointAt(12);
        System.out.println(ch);

        int result = "test".compareTo(text);
        System.out.println(result);

        String s1 = "AAA";
        String s2 = "AAa";
        int result2 = s1.compareToIgnoreCase(s2);
        System.out.println(result2);

        boolean isEqual = result2 == 0;
        System.out.println("Is equal - " + isEqual);

        text = text.concat(" See http://www.google.ru/");
        System.out.println(text);

        boolean isEq = text.equals(new String(text));
        System.out.println(isEq);

        System.out.println(text.endsWith("!"));
        System.out.println(text.startsWith("S"));



        System.out.println( text = text.replace("Google", "Yandex"));
        System.out.println( text = text.replace("google", "yandex"));

        ;
        System.out.println(text.trim().isEmpty());

        char [] array = text.toCharArray();
        for (int i = 0; i < array.length; i += 2){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < text.length(); i += 3){
            System.out.print(text.charAt(i) + " ");
        }



    }

}
