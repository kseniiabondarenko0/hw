public class Main {
    public static void main(String[] args) {
        max(2);
        max(9);
        max(29);
        max(99);
        max(11);
        max(19);
        max(229);
        max(929);
        max(1675);
        max(19875);
        max(567849);

    }

    public static void max(int num) {
        String s = "";
        String[] base1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] base2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] base3 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        if (num > 0 && num < 10)
            s = base1[num];
        else if (num > 10 && num < 20)
            s = base3[num % 10];
        else if (num > 19 && num < 100)
            s = base2[num / 10] + " " + base1[num % 10];
        else if (num > 99 && num < 1000)
            s = base1[num / 100] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        else if (num > 999 && num < 10000)
            s = base1[num / 1000] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        else if (num > 9999 && num < 100000)
            s = base2[num / 10000] + " " + base1[(num / 1000) % 10] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];
        else if (num > 99999 && num < 1000000)
            s = base1[num / 100000] + " hundred " + base2[(num / 10000) % 10] + " " + base1[(num / 1000) % 10] + " thousand " + base1[(num / 100) % 10] + " hundred " + base2[(num / 10) % 10] + " " + base1[num % 10];

        System.out.println(s);
    }
}