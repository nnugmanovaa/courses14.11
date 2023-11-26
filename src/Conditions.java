import java.util.Scanner;

public class Conditions {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task77();
    }

    public static void task77(){
        int age = 9;

        switch(age){
            case 1 : case 2: case 3: case 4: case 5:
                System.out.println("12345");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7 : case 8: case 9:
                System.out.println("789");
        }

    }

    public static void task1() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.max(a,b));
    }

    public static void task2() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }

    public static void task3() {
        int a = scanner.nextInt();
        if (a > 0){
            System.out.println("positive");
        } else if ( a < 0){
            System.out.println("negative");
        } else {
            System.out.println("equal to Zero");
        }
    }

    public static void task4() {
        int a = scanner.nextInt();
        if ( a % 5 == 0 && a % 11 == 0){
            System.out.println("number is divided by 5 and 11");
        } else{
            System.out.println("number is not divided by 5 and 11");
        }
    }

    public static void task5() {
        int a = scanner.nextInt();
        if ( a % 2 == 0){
            System.out.println("Your number is even");
        } else{
            System.out.println("Your number is odd");
        }
    }

    public static void task6() {
        int a = scanner.nextInt();
        if ( a % 4 == 0){
            System.out.println("Your year is leap");
        } else{
            System.out.println("Your number is not leap");
        }
    }
    public static void task7() {
        char a = scanner.next().charAt(0);
        if ( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') ){
            System.out.println("Your character is aplhabet");
        } else {
            System.out.println("Your character is not alphabet");
        }

    }
//    public static void task8(){}
    public static void task9() {
        char a = scanner.next().charAt(0);
        if ( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') ){
            System.out.println("Your character is aplhabet");
        } else  if ( a >= '0' && a <= '9'){
            System.out.println("Your character is digit");
        } else{
            System.out.println("Your character is special number");
        }
    }

    public static void task10(){
        char str1 = scanner.nextLine().charAt(0);
        if( str1 >= 'A' && str1 <= 'Z'){
            System.out.println("Your char is Upper case");
        } else {
            System.out.println("Your char is lower case");
        }

    }

    public static void task11(){
        int a = scanner.nextInt();
        if (a >= 1 && a <= 7){
            if( a == 1 ){
                System.out.println("Monday");
            } else if ( a == 2){
                System.out.println("Tuesday");
            } else if ( a == 3){
                System.out.println("Wednesday");
            } else if ( a == 4){
                System.out.println("Thursday");
            } else if( a == 5){
                System.out.println("Friday");
            } else if ( a == 6){
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }
        else System.out.println("You number is not the date of the week");
    }

    public static void task12(){
        int a = scanner.nextInt();
        if (a >= 1 && a <= 12){
            if( a == 1 ){
                System.out.println("January");
            } else if ( a == 2){
                System.out.println("February");
            } else if ( a == 3){
                System.out.println("March");
            } else if ( a == 4){
                System.out.println("April");
            } else if( a == 5){
                System.out.println("May");
            } else if ( a == 6){
                System.out.println("June");
            } else if ( a == 7){
                System.out.println("July");
            } else if ( a == 8){
                System.out.println("August");
            } else if ( a == 9){
                System.out.println("September");
            } else if ( a == 10){
                System.out.println("October");
            }else if ( a == 11){
                System.out.println("November");
            } else if ( a == 12){
                System.out.println("December");
            }
        } else System.out.println("Your number is not the number of the mounth");
    }

    public static void task13(){
        int a = scanner.nextInt();
        int [] banknotes = {2000, 1000, 500, 100, 50, 20, 5};
        for (int i : banknotes) {
            int count = a / i;
            if (count > 0) {
                System.out.println(i + " tg = " + count);
                a %= i;
            }
        }
    }

    public static void task14(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ( (a + b + c) == 180){
            System.out.println("Your triangle is is valid");
        } else System.out.println("You triangle is not valid");
    }

    public static void task15(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean case1 = (a + b) >= c;
        boolean case2 = (a + c) >= b;
        boolean case3 = (b + c) >= a;
        if ( case1 && case2 && case3){
            System.out.println("Your traiangle is valid");
        } else System.out.println("Your triangle is not valid");
    }

    public static void task16(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if( a ==b && b == c ){
            System.out.println("Your triangle is equilateral");
        } else if ( a == b || a == c || b == c){
            System.out.println( "Your triangle is isosceles");
        } else System.out.println("You have scalene triangle");
    }

    public static void task17(){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double disc = Math.pow(b, 2) - 4*a*c;
        double root1, root2;
        if ( disc >0){
            root1 = (-b + Math.sqrt(disc))/ (2*a);
            root2 = (-b - Math.sqrt(disc))/ (2*a);
            System.out.println("root 1: " +  root1 + " root 2: "+ root2);
        } else if ( disc == 0 ){
            root1= -b/ (2*a);
            root2 = root1;
            System.out.println("root 1: " +  root1 + " root 2: "+ root2);
        } else System.out.println("No real roots. Roots are complex numbers.");

    }

    public static void task18(){
        double costPrice = scanner.nextDouble();
        double sellingPrice = scanner.nextDouble();
        double profitOrLoss = sellingPrice - costPrice;

        if ( profitOrLoss > 0 ){
            System.out.println("You profit equals to " + profitOrLoss);
        } else if ( profitOrLoss < 0){
            System.out.println("Your loss equals to " + profitOrLoss);
        }
        else System.out.println("you do not have any profit or loss!!!!");
    }

    public static void task19(){
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int bilogy = scanner.nextInt();
        int math = scanner.nextInt();
        int computer = scanner.nextInt();
        double percntage = (physics + chemistry+bilogy+math+computer) / 5;
        char grade;

        if (percntage >= 90){
            grade = 'A';
        }else if(percntage >=80){
            grade ='B';
        } else if ( percntage  >= 70){
            grade ='C';
        } else if ( percntage >= 60 ){
            grade ='D';
        } else if ( percntage >= 50){
            grade ='E';
        } else grade ='F';

        System.out.println(grade);
    }

    public static void task20(){
        double basicSalary = scanner.nextInt();
        double hra= 0;
        double da = 0;
        double grossSalary;
        if (basicSalary <= 10000){
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if ( basicSalary > 10000 && basicSalary <= 20000){
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        }else if (basicSalary > 20000){
            hra = 03 * basicSalary;
            da = 0.95 * basicSalary;
        }
        grossSalary = basicSalary + hra + da;
        System.out.println(grossSalary);
    }

    public static void task21(){
        int units = scanner.nextInt();
        double finalBill;
        if (units <= 50) {
            finalBill = units * 0.50;
        } else if (units <= 200) {
            finalBill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 450) {
            finalBill = 50 * 0.50 + 150 * 0.75 + (units - 200) * 1.20;
        } else {
            finalBill = 50 * 0.50 + 150 * 0.75 + 250 * 1.20 + (units - 450) * 1.50;
        }

        // Add surcharge of 20%
        double surcharge = 0.20 * finalBill;
        finalBill += surcharge;

        System.out.println(finalBill);
    }

    public static void task22(){
        double price =  scanner.nextDouble();
        int amountToBuy = scanner.nextInt();
        double summary;
        if (amountToBuy >= 100){
            summary = amountToBuy * (price * 0.9);
        } else summary = amountToBuy * price;

        System.out.println(summary);
    }


    public static void task23(){
        int currenntYear = scanner.nextInt();
        int joindeYear = scanner.nextInt();
        int yearWorked = currenntYear - joindeYear;
        int bonus = 0;
        if (yearWorked >= 3){
            bonus += 2500;
            System.out.println(bonus);
        }
    }

    public static void task24(){
        int basicSalary = scanner.nextInt();
        double hra = 0;
        double da = 0;
        double grossSalary;
        if (basicSalary < 1500){
            hra = basicSalary * 0.1;
            da = basicSalary *0.9;
        } else if ( basicSalary >= 1500){
            hra = 500;
            da = basicSalary * 0.98;
        }
        grossSalary = basicSalary + hra + da;
        System.out.println(grossSalary);
    }


}
