import java.util.Scanner;
import java.util.SortedMap;

public class Methods {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         task8(25498);
        System.out.println(task7("The Lord of the Rings"));

    }


    public static void task1 (String s){
        System.out.println("Message: " + s);
    }

    public static void task2(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int smallest = smallestOfThree(a,b,c);
        System.out.println(smallest);
    }

    public static int smallestOfThree(int a, int b, int c){
        if ( a <= b && b <= c){
            return a;
        } if ( b <= a && a<=c ){
            return b;
        } else return c;
    }

    public static void task3(){
        int n = scanner.nextInt();
        positiveOrNegative(n);
    }

    public static void positiveOrNegative(int n){
        if (n > 0){
            System.out.println("positive");
        }
        else System.out.println("negative");
    }


    public static double task4(double n){
        return n*n;
    }


    public static void task5(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char symbol = scanner.next().charAt(0);
        int result = myCalculator(a,b,symbol);
        if(result == 0){
            System.out.println("you entered smth wrong");
        } else System.out.println(result);

    }

    public static int myCalculator (int a , int b, char c){
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }


    public static void task6(){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double average = averageOfThree(a,b,c);
        System.out.println(average);
    }

    public static double averageOfThree( double a, double b, double c){
        return (a+b+c)/3;
    }

    public static String task7(String s){
        int lenghth = s.length();
        int n = lenghth / 2;

        if (lenghth %2 ==0){
            return s.substring(n-1, n+1);
        } else return s.substring(n,n+1);
    }

    public static void task8 (int n){
        int dig;
        int sum =0;
        while(n!=0){
            dig= n%10;
            n/=10;
            sum += dig;
        }
        System.out.println(sum);
    }






}
