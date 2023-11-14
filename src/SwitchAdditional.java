import java.util.Scanner;

// additional tasks
public class SwitchAdditional {

    public static void main(String[] args) {

    }

    public static Scanner scanner = new Scanner((System.in));

    public static void task1(){
        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3: // day == 1, day == 2, day == 3  alternative ---> if (day == 1 || day == 2 || day == 3)
                System.out.println("Понедельник или Вторник или Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня нет!");
        }
    }

    public static void task2(){
        int k = scanner.nextInt();
        switch (k){
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("нецдовлитвориетльно");
                break;
            case 3:
                System.out.println("удовлитворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("ошибка");
        }
    }
    public static void task3(){
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
                }
                else System.out.println("На ноль делить нельзя");
                break;
            default:
                System.out.println("Некорректно");
                return;
        }
        System.out.println(result);
    }
}
