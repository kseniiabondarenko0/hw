public class Main {

    public static void main(String[] args) {
        System.out.println(task1(1));
        System.out.println(task1(0));
        System.out.println(task1(-3));

        System.out.println(task2(1));
        System.out.println(task2(0));
        System.out.println(task2(-3));

        System.out.println(task3(1));
        System.out.println(task3(0));
        System.out.println(task3(-3));

        System.out.println(task4(1));
        System.out.println(task4(0));
        System.out.println(task4(-3));

        System.out.println(task5(1));
        System.out.println(task5(0));
        System.out.println(task5(-3));

        System.out.println(task6(1));
        System.out.println(task6(0));
        System.out.println(task6(-3));

        System.out.println(task7("test"));
        System.out.println(task7("тест"));
        System.out.println(task7("3"));

        System.out.println(task8("1"));
        System.out.println(task8("1"));
        System.out.println(task8("3"));

        System.out.println(task9(true));
        System.out.println(task9(false));

        System.out.println(task10(true));
        System.out.println(task10(false));

        System.out.println(task11(5));
        System.out.println(task11(0));
        System.out.println(task11(-3));
        System.out.println(task11(2));

        System.out.println(task12(5));
        System.out.println(task12(0));
        System.out.println(task12(-3));
        System.out.println(task12(2));

        System.out.println(task13(1, 3));
        System.out.println(task13(0, 6));
        System.out.println(task13(3, 5));

        System.out.println(task14(1, 3));
        System.out.println(task14(0, 6));
        System.out.println(task14(3, 5));

        System.out.println(task15(1));
        System.out.println(task15(0));
        System.out.println(task15(3));
        System.out.println(task15(2));

        System.out.println(task16(3));
        System.out.println(task16(-5));
        System.out.println(task16(13));
        System.out.println(task16(21));

        System.out.println(task17(3));
        System.out.println(task17(-5));
        System.out.println(task17(12));
        System.out.println(task17(9));

        //завдання фібоначчі
        int n = 6;
        System.out.println("Число Фібоначчі для n = " + n + " дорівнює " + fibonacci(n));
    }

    public static String task1(int a){
        if (a==0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task2(int a){
        if (a>0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task3(int a){
        if (a<0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task4(int a){
        if (a>=0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task5(int a){
        if (a<=0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task6(int a){
        if (a!=0)
            return "Right";
        else
            return "Wrong";
    }

    public static String task7(String a){
        if (a.equals("test"))
            return "Right";
        else
            return "Wrong";
    }

    public static String task8(String a){
        if (a.equals("1"))
            return "Right";
        else
            return "Wrong";
    }

    public static String task9(boolean test){
        if (test==true)
            return "Right";
        else
            return "Wrong";
    }

    public static String task10(boolean test){
        if (test!=true)
            return "Right";
        else
            return "Wrong";
    }

    public static String task11(int a) {
        if (a > 0 && a < 5)
            return "Right";
        else
            return "Wrong";
    }

    public static double task12(double a) {
        if (a == 0 || a == 2) {
            a = a + 7;
            return a;
        }
        else{
            a = a / 10;
            return a;
        }
    }

    public static int task13(int a, int b) {
        if (a <=1 && b >= 3) {
            return a + b;
        }
        else{
            return a - b;
        }
    }

    public static String task14(int a, int b) {
        if ( a>=2 && a <=11 || b >= 6 && b<=14)
            return "Right";
        else
            return "Wrong";
    }

    public static String task15(int num) {
        switch (num){
            case 1:
                return "Winter";
            case 2:
                return "Spring";
            case 3:
                return "Summer";
            case 4:
                return "Fall";
            default:
                return "Oooops, something wrong !";
        }
    }

    public static String task16(int day) {
        if (day > 0 && day <=10)
            return "1st decade";
        else if (day > 10 && day <=20)
            return "2nd decade";
        else if (day > 20 && day <=31)
            return "3rd decade";
        else
            return "Smth wrong...";
    }

    public static String task17(int month) {
        if (month > 0 && month <=2 || month == 12)
            return "Winter";
        else if (month > 2 && month <=5 )
            return "Spring";
        else if (month > 5 && month <=8)
            return "Summer";
        else if (month > 8 && month <=11)
            return "Fall";
        else
            return "Smth wrong...";
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
