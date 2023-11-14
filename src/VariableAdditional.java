import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class VariableAdditional{

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task15();
    }


    public static void task1(){
        int age;
        age = 25;
        System.out.println(age);
    }

    public static void task2(){
        int x= 3;
        int y= 4;
        x = x + y;
        y = x -y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }

    public static void task3(){
        int a=8;
        int b=2;
        int square = a*b;
        System.out.println(square);
    }
    public static void task4(){
        Scanner scanner= new Scanner(System.in);
        int fareng = scanner.nextInt();
        int celsium = (fareng - 32)*5/9;
        System.out.println(celsium);
    }

    public static void task5() {
        Scanner scanner = new   Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int average = (a+b+c)/3;
        System.out.println(average);
    }
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int v = a * b * c;
        int s = 2 * (a * b + b * c + a * c);
        System.out.println(v);
        System.out.println(s);
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double geomet = Math.sqrt(a)*b;
        System.out.println(geomet);

    }
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int countres = count+1-2;
        System.out.println(countres);
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double square= 3.14159 * r*r;
        System.out.println(square);
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        System.out.println(name + " " + surname);
    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inc = n + 10;
        System.out.println(inc);
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int square = (a*b)/2;
        System.out.println(square);
    }

    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>b){
            System.out.println(a-b);
        } else System.out.println(b-a);
    }

    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("Hourse: " + min / 60 + " Minutes: " + min % 60 );
    }

    public static void task15(){
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void task16() {
        int num = scanner.nextInt();
        int square = (int) Math.pow (num, 2);
        int cube = (int) Math.pow(num, 3);

        System.out.println(square);
        System.out.println(cube);

    }

    public static void task17(){
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        System.out.println(st1.length());
    }

    public static void task18(){
        double costprice = scanner.nextDouble();
        double sellprice = scanner.nextDouble();
        double profit = sellprice - costprice;
        System.out.println(profit);
    }
    public static void task19(){
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double bmi = weight / height;
        System.out.println(bmi);
    }
    public static void task20() {
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int converted1 = Integer.parseInt(str1);
        int converted2 = Integer.parseInt(str2);

        int sum= converted2 + converted1;

        System.out.println(sum);
    }
    public static void task21() {
        int years = scanner.nextInt();
        int covert_to_days = years * 365;
        System.out.println(covert_to_days);
    }
    public static void task22() {
        double price = scanner.nextDouble();
        int discount = 20;
        double final_price = price * (100 - discount)/100;
        System.out.println(final_price);
    }

    public static void task23(){
        // при вызове локально переменной вне метода, данный код выведет ошибку компилятора. Компилятор не позволяет вызывать  пременные за пределом ее области видимости
    }

    public static void task24(){
        float a = 0.1f;
        for ( int i = 0; i < 10; i++){
            a += 0.1;
        }
        System.out.println(a);
    }

    public static void task25(){
        VariableAdditional.VirebaleShadowing num = new VariableAdditional.VirebaleShadowing();
        num.setValue(3);
        num.displayValue();
    }

    public static class VirebaleShadowing {
        private int a = 15;

        public void setValue(int a){
            this.a = a;
        }

        public void displayValue (){
            System.out.println(a);
        }

    }
    public static final int daysInWeek = 7;
    public static void task29(){
        int year = scanner.nextInt();
        System.out.println("В вашем году: " + year * 52 * daysInWeek + " дней");
    }

    public static void task27(){
        int num1 = 23;
        double num2;
        num2 = (double) num1;
        System.out.println(num2);
    }

    public static void task28(){
//        int n;
//        System.out.println(n);
        // данный код выведет ошибку, так как переменная не инициализированна, как
        // обяснялось на уроке, чтобы не засорять код, и в пустую несоздавтаь переменные,
        // вдали от их инициализации, что в дальнейшем повлияет на читабельность кода
    }

    public static final double pi = 3.14159;
    public static void task26(){
        int radius = scanner.nextInt();
        double cirscimstan = 2 * pi * radius;
        System.out.println(cirscimstan);
    }

    public static void task30(){
        int a = scanner.nextInt();
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
    }

    public static void task31(){
        int a = scanner.nextInt();
        a+=2;
        System.out.println(a);
        a-=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
    }

    public static void task32(){
        byte num1 = 3;
        short num2;
        num2 = (short) num1;
        System.out.println(num2);
    }


}