import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task7();
    }

    private static void task1(){
        Scanner scaner = new Scanner(System.in);
        String h = "Hello";
        String full_name = scaner.nextLine();
        System.out.println(h);
        System.out.println(full_name);

    }

    private static void task2(){
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        System.out.println(a+b);
    }

    private static void task3(){
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        System.out.println(a/b);
    }
    private static void task4(){
        int resultA = -5 + 8 * 6;
        int resultB = (55+9) % 9;
        int resultC = 20 + -3*5 / 8;
        int resultD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);
    }
    private static void task5(){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scaner.nextInt();
        System.out.println("Input second number: ");
        int b = scaner.nextInt();
        int output = a*b;
        System.out.println(a + " X " + b + " = " + output);
    }
    private static void task6(){
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        int sum = a+b;
        int mult = a*b;
        int subst = a-b;
        int div = a/b;
        int mod = a%b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + subst);
        System.out.println(a + " X " + b + " = " + mult);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " mod " + b + " = " + mod);
    }

    private static void task7(){
        Scanner scaner = new Scanner(System.in);
        int a = scaner.nextInt();
        for (int i=1; i<=10; i++){
            int mult = a * i;
            System.out.println(a + " X " + i + " = " + mult);
        }
    }
    private static void task8(){
        System.out.println("   J    a   v     v  a  ");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");

    }

    private static void task9(){
       double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
       System.out.println(a);
    }
    private static void task10(){
        double a = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(a);
    }

}