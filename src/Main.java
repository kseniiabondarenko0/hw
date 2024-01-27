public class Main {
    public static void main(String[] args) {
        print1();
        System.out.println();
        print2();
        System.out.println();
        print3();
        System.out.println();
        print4();
    }
    public static void print1(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if ((x==y && x>4 || 9-x==y  && y>4 || y==9) )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

    }

    public static void print2(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if ((x==y && x>4 || 9-y==x  && y<5 || x==9) )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

    }

    public static void print3(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if ((x==y && x<5 || 9-y==x  && y<5 || y==0) )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

    }

    public static void print4(){//

        for (int y = 0; y < 10; y++) {

            for (int x = 0; x < 10; x++) {
                if ((x==y && x<5 || 9-x==y  && y>4 || x==0) )
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }

    }
}