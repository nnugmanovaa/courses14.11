import java.util.Scanner;

// additional tasks
public class BooleanAndCondition {
    public static void main(String[] args) {
            task5();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static boolean chessElephant(int x1, int y1, int x2, int y2){
        if (Math.abs(x2-x1) == Math.abs(y2-y1)){
            return true;
        }  else return false;
    }

    public static void task1(){
        int a = scanner.nextInt();
        boolean status;
        if ( a >0 ){
            status = true;
        } else status = false;

        System.out.println(status);
    }

    public static void task2(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean statemenet = a > 2 && b <=3;
        if (statemenet){
            System.out.println("is valid ");
        } else System.out.println("is not valid ");
    }

    public static void task3(){
        boolean  a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();

        if ( a || b ){
            System.out.println("At least one condition is true");
        } else System.out.println("Both conditions are false");
    }

    public static void task4(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean statemenet = a >= 0 || b <-2;
        if (statemenet){
            System.out.println("is valid ");
        } else System.out.println("is not valid ");
    }

    public static void task5(){
        boolean a = scanner.nextBoolean();
        if (a){
            a = false;
        } else a = true;

        System.out.println(a);
    }

    public static void task6 (){
        int a = scanner.nextInt();
        if (a > 0){
            System.out.println("positive");
        }
        else if (a<0){
            System.out.println("negative");
        } else System.out.println("zero");
    }

    public static void task7 (){
        int a = scanner.nextInt();
        if (a % 2 ==0){
            System.out.println("the number is even");
        } if ( a %10 == 7){
            System.out.println("it end with the number 7.");
        }
    }

    public static void task8(){
        int a = scanner.nextInt();
        int firstDigit = a / 10;
        int secondDigit = a % 10;
        if ( firstDigit > secondDigit){
            System.out.println("firstDigit is bigger");
        } else if (secondDigit > firstDigit){
            System.out.println("second digit is begger");
        } else System.out.println("digits are the same");
    }

    public static void task9(){
        int a = scanner.nextInt();
        if ( a %4 ==0 ){
            if ( (a % 100 ==0) && (a% 400 != 0)){
                System.out.println("Year is not elap bevause of exception");
            } else System.out.println("Year is leap");
        } else System.out.println("Year is not leap");
    }

    public static void task10(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }

    public static void task11(){
        int a = scanner.nextInt();
        if ( a >= 0 && a <= 100){
            if ( a >= 90 && a <= 100){
                System.out.println("A");
            } else if ( a >= 80 && a <= 89) {
                System.out.println("B");
            } else if ( a >= 70 && a <= 79) {
                System.out.println("C");
            } else if ( a >= 60 && a <= 69) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        } else System.out.println("Your number out of baundaries");
    }






}
