public class Main {
    public static void main(String[] args) {
        int[][] ar  = {
                {1,2,3},
                {1,2,3},
                {4,2,3}};
        task1(ar);
        task2(ar);
        task3(ar);
        task4(ar);
        task5(ar);
        task6(ar);
        task7(ar);
        task8(ar);
        task9(ar);
        task10(ar);
        task11(ar);
        task12(ar);
        task13(ar);
        task14(ar, 3);
        task15(ar);
    }
    public static void task1(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                    sum+=ar[i][j];

            }

        }
        System.out.println(sum);

    }
    public static void task2(int[][] ar) {
        int sum = 0;
        int flag = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
                flag++;
            }
            int avarage = sum / flag;
            System.out.println(avarage);

        }
    }
        public static void task3(int[][] ar) {
            for (int i = 0; i < ar.length; i++) {
                int max = ar[i][0];
                for (int j = 1; j < ar[i].length; j++) {
                    if (ar[i][j] > max) {
                        max = ar[i][j];
                    }
                }
                System.out.println(max);
            }
        }

            public static void task4(int[][] ar) {
                for (int j = 0; j < ar[0].length; j++) {
                    int min = ar[0][j];
                    for (int i = 1; i < ar.length; i++) {
                        if (ar[i][j] < min) {
                            min = ar[i][j];
                        }
                    }
                    System.out.println(min);
                }
            }
            public static void task5(int[][] ar){
            for (int i = 0; i < ar.length; i++) {
                int sum = 0;
                for (int j = 0; j < ar[i].length; j++) {
                    sum += ar[i][j];
                }
                System.out.println(sum);
            }
        }

    public static void task6(int[][] ar){
        for (int i = 0; i < ar.length; i++) {
            if (ar[i][i] < 0) {
                System.out.println("False");
            }
        }
        System.out.println("True");
    }

    public static void task7(int[][] ar){
            int[] tmp = ar[1];
            ar[1] = ar[2];
            ar[2] = tmp;

            for (int i = 0; i< ar.length; i++){
                for (int j = 0; j< ar.length; j++)
                    System.out.print(ar[i][j]+" ");
            }
        }


    public static void task8(int[][] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            boolean neg = false;

            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] < 0) {
                    neg = true;
                    break;
                }
            }

            if (neg) {
                for (int j = 0; j < ar[i].length; j++) {
                    sum += ar[i][j];
                }
            }
        }

        System.out.println(sum);;
    }

    public static void task9(int[][] ar) {
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j]%2==0)
                count++;
            }
        }
        System.out.println(count);
    }

    public static void task10(int[][] ar) {
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] < 0)
                    count++;
            }
        }
        System.out.println(count);
    }

    public static void task11(int[][] ar) {
        int count = 1;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 0) {
                    ar[i][j] = count++;
                    System.out.println(ar[i][j]);
                }
            }

        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }


    }

    public static void task12(int[][] ar) {
        int lsum = 0;
        int rsum = 0;
        int n = ar.length;

        for (int i = 0; i < ar.length; i++) {
            lsum += ar[i][i];
            rsum += ar[i][n - 1 - i];
        }
        if (lsum == rsum)
            System.out.println("Yes");
        else {
            System.out.println("No");
        }
    }

    public static void task13(int[][] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
                    sum+=ar[i][i];
        }
        System.out.println(sum);
    }

    public static void task14(int[][] ar, int target) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar.length; j++) {
                if (ar[i][j] < target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void task15(int[][] ar) {
        int rows = ar.length;
        int cols = ar[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < cols; l++) {
                        if ((i != k || j != l) && ar[i][j] == ar[k][l]) {
                            System.out.println("Not unic");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Unic");
    }

    public static void insertionSort(int ar[]) {
        int n = ar.length;
        for (int j = 1; j < n; j++) {
            int key = ar[j];
            int i = j-1;
            while ( (i > -1) && ( ar [i] > key ) ) {
                ar [i+1] = ar [i];
                i--;
            }
            ar[i+1] = key;
        }
    }


}






