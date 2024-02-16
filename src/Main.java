import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println(task2("Hello"));
        System.out.println(Arrays.toString(task5("Hello world")));
        System.out.println(task4("Hello"));
        System.out.println(task3("mkam"));


    }

    public static String reverse(String str) {
        String reversetext="";
        for (int i = str.length() - 1; i>-1; i--) {
            reversetext+=str.charAt(i);
        }
        return reversetext;
    }

    public static String task2(String str){
        int count = 0;
        String upperCaseStr = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = upperCaseStr.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                count++;
        }
        String result = "Кількість голосних літер у рядку: " + count;
        return result;
    }

    public static boolean task3(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static String task4(String str){
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }


    public static String[] task5(String str) {

        return str.split(" ");
    }

}
