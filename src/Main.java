//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static void main(String[] args) {
            int val = 5;
            int[] arr = {-1,-3,-5,-4};
            int[] arr2 = {5,-3,-2,16,55,0};
            task1();

            task2();

            task3();

            task4();

            task5();

            task6();

            max(arr);

            task7();

            fib();








        }
        public static void max(int[] arr){
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max< arr[i]){
                    max = arr[i];
                }
            }
            System.out.println("max = "+max);
        }

    public static void min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min> arr[i]){
                min = arr[i];
            }
        }
        System.out.println("min = "+min);
    }



    public static void task1(){
        for (int i = 0 ; i<=110 ; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }

    }

    public static void task2(){
        for (int i = 90 ; i>=0 ; i-=5)
            System.out.println(i);

    }

    public static void task3(){
        for (int i = 1 ; i<=40 ; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }

    public static void task4(){
            int el = 2;
        for (int i = 0 ; i<=20 ; i++) {
            el*=2;
            System.out.println(el);
        }


    }

    public static void task5(){
        for (int i = -29 ; i<=10 ; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }

    }

    public static void task6(){
            int sum1 = 0;
            int even = 0;
        for (int i = 50 ; i<=150 ; i++) {
            sum1 += i;
            if (i % 2 == 0)
                even++;
        }
        System.out.println("Sum: "+sum1+"\t"+"Even: "+even);

    }

    public static void task7(){
        int[] arr2 = {5,-3,-2,16,55,0};
        int sum1 = 0;
        int pos = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum1 += arr2[i];
            if (arr2[i] % 2 == 0)
                pos++;
        }
        System.out.println("Sum: "+sum1+"\t"+"Even: "+pos);

    }

    static void fib() {
        int first = 1;
        int second = 1;

        for (int i = 0; i <= 11; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }



}