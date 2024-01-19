//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        task1(1);
        task1(0);
        task1(-3);

        task2(1);
        task2(0);
        task2(-3);

        task3(1);
        task3(0);
        task3(-3);

        task4(1);
        task4(0);
        task4(-3);

        task5(1);
        task5(0);
        task5(-3);

        task6(1);
        task6(0);
        task6(-3);

        task7("test");
        task7("тест");
        task7("3");

        task8("1");
        task8("1");
        task8("3");

        task9(true);
        task9(false);

        task10(true);
        task10(false);

        task11(5);
        task11(0);
        task11(-3);
        task11(2);

        task12(5);
        task12(0);
        task12(-3);
        task12(2);

        task13(1, 3);
        task13(0, 6);
        task13(3, 5);

        task14(1, 3);
        task14(0, 6);
        task14(3, 5);

        task15(1);
        task15(0);
        task15(3);
        task15(2);

        task16(3);
        task16(-5);
        task16(13);
        task16(21);

        task17(3);
        task17(-5);
        task17(12);
        task17(9);













    }

    public static void task1(int a){
        if (a==0)
            System.out.println("Right");
        else
            System.out.println("Wrong");
        }

    public static void task2(int a){
        if (a>0)
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task3(int a){
        if (a<0)
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task4(int a){
        if (a>=0)
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task5(int a){
        if (a<=0)
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task6(int a){
        if (a!=0)
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }
    public static void task7(String a){
        if (a=="test")
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task8(String a){
       if (a=="1")
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task9(boolean test){
        if (test==true)
            System.out.println("Right");
        else
            System.out.println("Wrong");
        //if (test == true? "right":"wrong");
    }

    public static void task10(boolean test){
        if (test!=true)
            System.out.println("Right");
        else
            System.out.println("Wrong");

    }

    public static void task11(int a) {
        if (a > 0 && a < 5)
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }

    public static void task12(double a) {
        if (a == 0 || a == 2) {
            a = a + 7;
            System.out.println(a);
        }
        else{
            a = a / 10;
            System.out.println(a);
        }

    }

    public static void task13(int a, int b) {
        if (a <=1 && b >= 3) {
            int sum = a + b;
            System.out.println(sum);
        }
        else{
            double minus = a - b;
            System.out.println(minus);
        }

    }
    //sout

    public static void task14(int a, int b) {
        if ( a>=2 && a <=11 || b >= 6 && b<=14)
            System.out.println("Right");
        else
            System.out.println("Wrong");


    }

    public static void task15(int num) {
        switch (num){
            case 1:
                String result1 = "Winter";
                System.out.println(result1);
                break;
            case 2:
                String result2 = "Spring";
                System.out.println(result2);
                break;
            case 3:
                String result3 = "Summer";
                System.out.println(result3);
                break;
            case 4:
                String result4 = "Fall";
                System.out.println(result4);
                break;
            default:
                System.out.println("Oooops, something wrong !");

        }


    }

    public static void task16(int day) {
        if (day > 0 && day <=10)
            System.out.println("1st decade");
        else if (day > 10 && day <=20)
            System.out.println("2nd decade");
        else if (day > 20 && day <=31)
            System.out.println("3rd decade");
        else
            System.out.println("Smth wrong...");
    }

    public static void task17(int month) {
        if (month > 0 && month <=2 || month == 12)
            System.out.println("Winter");
        else if (month > 2 && month <=5 )
            System.out.println("Spring");
        else if (month > 5 && month <=8)
            System.out.println("Summer");
        else if (month > 8 && month <=11)
            System.out.println("Fall");
        else
            System.out.println("Smth wrong...");
    }

    //public static void task18(String[] args) {
        //String inputString = "abcde";
        //System.out.println(inputString.startsWith("a") ? "yes" : "no");
    //} Умова передбачає те, що ми ще не знаємо








}