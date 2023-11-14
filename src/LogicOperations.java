import java.util.Scanner;

public class LogicOperations {

    public static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        task27();
    }

    public static void task25(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int percentage = (a+b+c+d+e)/ 5;
        System.out.println(percentage);
        if (percentage >=60){
            System.out.println("First division");
        } else if ( percentage >=50 && percentage <= 59){
            System.out.println("Second division");
        }
        else if (percentage >= 40 && percentage<= 49){
            System.out.println("Third division");
        } else if ( percentage < 40){
            System.out.println("Fail");
        }
    }

    public static void task26(){
        boolean maritialStatus = scanner.nextBoolean();
        String gender = scanner.next().toLowerCase();
        int age = scanner.nextInt();
        boolean companuInsures = checkCondition(maritialStatus,gender,age);
        if (companuInsures){
            System.out.println("Let's take this driver");
        } else System.out.println("we are going to reject the driver");

    }

    public static boolean checkCondition(boolean a, String b, int c){
        if (a || (!a && b.equals("male") && c>30) || (!a && b.equals("female") && c>25) ){
            return true;
        } else return false;
    }

    public static void task27(){
        String gender = scanner.next().toLowerCase();
        int yearOfService = scanner.nextInt();
        String qualifications = scanner.next().toLowerCase();
        int salary;
        if( gender.equals("male")){
            if (yearOfService >= 10 && qualifications.equals("post - graduate")){
                salary = 15000;
                System.out.println("Your salry is: " + salary);
            } else if (yearOfService >= 10 && qualifications.equals("graduate")) {
                salary = 10000;
                System.out.println("Your salry is: " + salary);
            } else if (yearOfService < 10 && qualifications.equals("post - graduate")) {
                salary = 10000;
                System.out.println("Your salry is: " + salary);
            } else if (yearOfService < 10 && qualifications.equals("graduate")) {
                salary = 7000;
                System.out.println("Your salry is: " + salary);
            }
        } else if ( gender.equals("female")){
            if ( yearOfService >=10 ){
                if(qualifications.equals("post - graduate")){
                    salary = 12000;
                    System.out.println("Your salry is: " + salary);
                } else if(qualifications.equals("graduate")){
                    salary = 9000;
                    System.out.println("Your salry is: " + salary);
                }
            } else if ( yearOfService < 10){
                if(qualifications.equals("post - graduate")){
                    salary = 10000;
                    System.out.println("Your salry is: " + salary);
                } else if(qualifications.equals("graduate")){
                    salary = 6000;
                    System.out.println("Your salry is: " + salary);
                }
            }
        }
    }

    public static void task28(){
        int num = scanner.nextInt();
        if ( num >= 10000 && num <= 99999){
            int reversedNumb = reversedNumber(num);
            if ( num == reversedNumb){
                System.out.println("reversed number is equal");
            } else System.out.println("reversed number is not equal");
        } else System.out.println("you entered not a 5-digoit number");

    }

    public static int reversedNumber(int num){
        int reversedNum = 0;
        while ( num !=0){
            int digit = num % 10;
            reversedNum = reversedNum *10 + digit;
            num /=10;
        }
        return reversedNum;
    }

    public static void task29(){
        int ramnAge = scanner.nextInt();
        int shyamAge = scanner.nextInt();
        int ajayaAge = scanner.nextInt();

        if (ramnAge <= shyamAge && ramnAge <= ajayaAge){
            System.out.println("The yasngest obe is Ram: "+ramnAge);
        } else if(shyamAge <= ramnAge && shyamAge <= ajayaAge){
            System.out.println("The yasngest obe is Shyam: "+shyamAge);
        } else System.out.println("The yasngest obe is Ajay: "+ajayaAge);
    }

    public static void task30(){
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ( (a + b + c) == 180){
            System.out.println("Your triangle is valid ");
        } else System.out.println("Your triangle is not valid ");
    }

    public static void task31(){
        int n = scanner.nextInt();
        System.out.println(Math.abs(n));
    }

    public static void task32(){
        double length = scanner.nextDouble();
        double breadth =  scanner.nextDouble();
        double area = length * breadth;
        double perimetre =  2 * (length + breadth);
        boolean areaBiggerThenPerimetre = area > perimetre;
        if (areaBiggerThenPerimetre){
            System.out.println("Area if bigger tha Permetre");
        }
        else System.out.println("Area is not bigger that Permetre");
    }

    public static void task33(){
        double hardnes = scanner.nextDouble();
        double carbon = scanner.nextDouble();
        double tensile = scanner.nextDouble();
        boolean firstCondition = hardnes > 50;
        boolean secondCondition = carbon < 0.7;
        boolean thirdCondition = tensile > 5600;
        int grade = 0;
        if ( firstCondition && secondCondition && thirdCondition){
            grade = 10;
        } else if ( firstCondition && secondCondition) grade = 9;
        else if ( firstCondition && thirdCondition) grade = 8;
        else if (firstCondition || secondCondition || thirdCondition) grade = 6;
        else if (!firstCondition && !secondCondition & !thirdCondition) grade = 5;

        System.out.println(grade);
    }

    public static void task34(){
        int numOfDaysLate = scanner.nextInt();
        int fine;
        if (numOfDaysLate >= 1 &&numOfDaysLate <= 5 ){
            fine = 50;
            System.out.println(fine + " paise");
        } else if ( numOfDaysLate>= 6 && numOfDaysLate<= 10){
            fine = 1;
            System.out.println( fine + " rupees");
        } else if ( numOfDaysLate> 10 && numOfDaysLate<= 30) {
            fine = 5;
            System.out.println(fine + " rupees");
        } else System.out.println("Your emembership was cancelled");

    }

    public static void task35() {
        double time = scanner.nextDouble();
        if ( time >= 2 && time < 3) {
            System.out.println("Worker is highly efficient");
        } else if (time >= 3 && time <4) {
            System.out.println("Worker is ordered to improve speed");
        }
        else if (time >= 4 && time <=5) {
            System.out.println("Woorker is given training to improve  his speed");
        } else if ( time >5) {
            System.out.println("Woorker has to leave the company");
        }
    }

    public static void task36(){
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        int b = scanner.nextInt();
        boolean numbersaAreEqual;
        if (a == c && c == b){
            numbersaAreEqual = true;
        } else numbersaAreEqual = false;

        System.out.println(numbersaAreEqual);
    }

    public static void task37(){
        int number = scanner.nextInt();
        int digitCount;
        if (number > 0){
            digitCount = countDigits(number);
            System.out.println(digitCount);
        } else System.out.println("Your number is negative");
    }
    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void task38(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ( a > b && b > c) System.out.println("Your numbers in decreasing order");
        else if (a < b && b < c) System.out.println("Your numbers in increasing order");
        else System.out.println("You numers in chaotic order");
    }

    public static void task39(){
        int a = scanner.nextInt();
        if ( a % 5 == 0){
            System.out.println("your number is multiple of 5");
        } else System.out.println("your number is not multiple of 5");
    }
}
