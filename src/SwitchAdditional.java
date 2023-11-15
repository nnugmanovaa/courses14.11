import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

// additional tasks
public class SwitchAdditional {

    public static void main(String[] args) {
        task10();
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

    public static void task7(){
        char c = scanner.next().charAt(0);
        int n =  scanner.nextInt();
        switch(c){
            case 'C':
                System.out.println("север");
                break;
            case 'З':
                System.out.println("запад");
                break;
            case 'Ю':
                System.out.println("юг");
                break;
            case 'В':
                System.out.println("вотсок");
                break;
            default:
                System.out.println("Некорректно");
        }
        switch (n){
            case 0:
                System.out.println("продолжать движение");
                break;
            case 1:
                System.out.println("поворот налево");
                break;
            case -1:
                System.out.println("поворот направо");
                break;
            default:
                System.out.println("Некорректно");
        }
    }

    public static void task8(){
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        String zodiacSign;
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Водолей";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Рыбы";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Овен";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Телец";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 21)) {
            zodiacSign = "Близнецы";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            zodiacSign = "Рак";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Лев";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Дева";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Весы";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 22)) {
            zodiacSign = "Скорпион";
        } else if ((month == 11 && day >= 23) || (month == 12 && day <= 21)) {
            zodiacSign = "Стрелец";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiacSign = "Козерог";
        } else {
            zodiacSign = "Неверная дата для определения знака зодиака";
        }

        System.out.println(zodiacSign);
    }

    public static void task9(){
        int number = scanner.nextInt();
        int firstNum = number / 10;
        int secondNum = number % 10;
        String transcript = "";
        switch (firstNum){
            case 2:
                transcript += "двадцать ";
                break;
            case 3:
                transcript += "тридцать ";
                break;
            case 4:
                transcript += "сорок ";
                break;
            case 5:
                transcript += "пятьдесят ";
                break;
            case 6:
                transcript += "шестьдесят ";
                break;
        }

        switch (secondNum){
            case 1:
                transcript += "один";
                break;
            case 2:
                transcript += "два";
                break;
            case 3:
                transcript += "три";
                break;
            case 4:
                transcript += "четяре";
                break;
            case 5:
                transcript += "пять";
                break;
            case 6:
                transcript += "шесть";
                break;
            case 7:
                transcript += "семь";
                break;
            case 8:
                transcript += "восемь";
                break;
            case 9:
                transcript += "девять";
                break;
        }

        if ( secondNum == 0){
            System.out.println(transcript + " лет");
        } else System.out.println(transcript + " год");

    }

    public static void task10(){
        int number = scanner.nextInt();
        int hyndres = number / 100;
        int ten = number /10 % 10;
        int digit = number % 10;
        if (number < 100 || number > 999) {
            System.out.println("Некорректное число для описания");
        }

        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] tens = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] ones = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять",
                "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        System.out.println(hundreds[hyndres] + " "+ tens[ten] + " " + ones[digit]);
    }
}
