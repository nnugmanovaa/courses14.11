import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
            task2();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void task1(){
        int a= scanner.nextInt();
        switch (a){
            case 1, 2, 12:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("очень");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }
    public static void task2(){
        char a = scanner.next().charAt(0);
        switch (a){
            case 'm':
                System.out.println("male");
                break;
            case 'f':
                System.out.println("female");
                break;
            default:
                System.out.println("this is not a gender");
        }
    }
    public static void task3(){
        char c = scanner.next().charAt(0);
        int dayInMounth;
        switch (c) {
            case 4, 6, 9, 11:
                dayInMounth = 30;
                break;
            case 2:
                dayInMounth = 28;
                break;
            default:
                dayInMounth = 31;
        }
        System.out.println(dayInMounth);
    }

    public static void task4(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;
        switch (n){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                if (b != 0){
                    result = a/b;
                } else System.out.println("На ноль делить нельзя");
                break;
            default:
                System.out.println("Некорректно");
                return;
        }
        System.out.println(result);
    }


    public static void task5(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result;
        switch (a){
            case 1:
                result = b*0.1;
                break;
            case 2:
                result = b * 1000;
                break;
            case 3:
                result = b;
                break;
            case 4:
                result = b * 0.001;
                break;
            case 5:
                result = b * 0.01;
                break;
            default:
                System.out.println("Некорректно");
                return;
        }
        System.out.println(result);
    }

    public static void task6(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result;
        switch (a){
            case 1:
                result = b;
                break;
            case 2:
                result = b * 0.000001;
                break;
            case 3:
                result = b * 0.001;
                break;
            case 4:
                result = b * 1000;
                break;
            case 5:
                result = b * 100;
                break;
            default:
                System.out.println("Некорректно");
                return;
        }
        System.out.println(result);
    }


    public static void task7(){
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double radius, diameter, length, area;

        switch (a) {
            case 1:
                radius = b;
                diameter = 2 * radius;
                length = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;
                break;
            case 2:
                diameter = b;
                radius = diameter / 2;
                length = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;
                break;
            case 3:
                length = b;
                radius = length / (2 * Math.PI);
                diameter = 2 * radius;
                area = Math.PI * radius * radius;
                break;
            case 4:
                area = b;
                radius = Math.sqrt(area / Math.PI);
                diameter = 2 * radius;
                length = 2 * Math.PI * radius;
                break;
            default:
                System.out.println("Некорректный номер элемента.");
                return;
        }

        System.out.println("Радиус: " + radius);
        System.out.println("Диаметр: " + diameter);
        System.out.println("Длина: " + length);
        System.out.println("Площадь круга: " + area);
    }

    public static void task8(){
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double leg, hypotenuse, height, area;

        switch (a) {
            case 1:
                leg = b;
                hypotenuse = 2 * Math.sqrt(2);
                height = leg/2;
                area = hypotenuse*height/2;
                break;
            case 2:
                hypotenuse = b;
                leg = hypotenuse / Math.sqrt(2);
                height = 2 *hypotenuse;
                area = hypotenuse*height/2;
                break;
            case 3:
                height = b;
                hypotenuse = 2 * height;
                leg = hypotenuse / Math.sqrt(2);
                area = hypotenuse*height/2;
                break;
            case 4:
                area = b;
                height = Math.sqrt((2 * area));
                hypotenuse= height * 2;
                leg = hypotenuse/ Math.sqrt(2);
                break;
            default:
                System.out.println("Некорректный номер элемента.");
                return;
        }

        System.out.println("Радиус: " + leg);
        System.out.println("Диаметр: " + hypotenuse);
        System.out.println("Длина: " + height);
        System.out.println("Площадь круга: " + area);
    }
}
