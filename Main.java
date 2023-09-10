import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //einatsPrintHelloMethod();
        // einatsPrintHelloMethod();
        Scanner s = new Scanner(System.in);

       /* myMethod7And3();
        myMethod5And2();*/
        int x = 7;
        int y = 3;
        myMethod(x,y);

        System.out.println("--------------");
        int a1 = 5;
        int b1 = 2;
        myMethod(a1,b1);

        System.out.println("---------------");
        myMethod(7,9);

        System.out.println("--------------");
        System.out.println("enter 2 numbers:");
        myMethod(s.nextInt(), s.nextInt());

    }

    public static void myMethod(int a, int b) {
        System.out.println(String.format("%d + %d = %d", a, b, a+b));
        System.out.println(String.format("%d - %d = %d", a, b, a-b));
    }

  /*  public static void myMethod5And2() {

        System.out.println(String.format("%d + %d = %d", a, b, a+b));
        System.out.println(String.format("%d - %d = %d", a, b, a-b));
    }*/

   /* public static void einatsPrintHelloMethod(){
        System.out.println("Hello from Function");
    }*/


}


