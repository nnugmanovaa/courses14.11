import java.util.Scanner;

public class LoopsAditional {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        additional4();
    }
    public static void task1(){
        int n = scanner.nextInt();
        for ( int i =0; i < n ; i++) {
            System.out.println(i+1);
        }
    }

    public static void task2(){
        int n = scanner.nextInt();
        for ( int i =n; i>0 ; i--) {
            System.out.println(i);
        }
    }

     public static void task3(){
         System.out.println("Please enter you number:");
        int n = scanner.nextInt();
        for ( int i=0; i<10; i++){
            System.out.println(n + " x "+(i+1)+ " = "+  (n*i));
         }
     }

    public static void task4(){
        System.out.println("Please enter you number:");
        int n = scanner.nextInt();
        for ( int i=10; i>0; i--){
            System.out.println(n + " x "+i+ " = "+  (n*i));
        }
    }

    public static void task5(){
        char k = 'a';
         do{
             System.out.println(k);
             k++;
         } while (k <= 'z');
    }

    public static void task6(){
        char last = 'Z';
        char first = 'A';
        for( char i = last; i>= first; i--){
            System.out.println(last);
            last--;
        }
    }
    public static void task7(){
        for ( int i=1; i <= 100; i++){
            if ( i %2 ==0){
                System.out.println(i);
            }
        }
    }

    public static void task8(){
        for ( int i=1; i <= 100; i++){
            if ( i %2 ==1){
                System.out.println(i);
            }
        }
    }

    public static void task9(){
        int sum =0;
        int n = scanner.nextInt();
        for ( int i=1; i <= n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void task10(){
        int sum =0;
        int n = scanner.nextInt();
        for ( int i=1; i <= n; i++) {
            if (i % 2 == 0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static void task11(){
        int sum =0;
        int n = scanner.nextInt();
        for ( int i=1; i <= n; i++) {
            if (i % 2 == 1) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static void task12(){
        char c = scanner.next().charAt(0);
        int n = (int) c;
        System.out.println(n);
    }

    public static void task13(){
        int n = scanner.nextInt();
        System.out.println(finsFactorial(n));
    }

    public static int finsFactorial ( int a ){
        if ( a ==0 || a ==1){
            return 1;
        }
        else {
            return a * finsFactorial(a-1);
        }
    }

    public static void task14(){
        int number = scanner.nextInt();
        int powerof = scanner.nextInt();
        int result =1;
        for ( int i=0; i< powerof; i++){
            result*=number;
        }
        System.out.println(result);
    }

    public static void task15(){
        int  number = scanner.nextInt();
        int reversed=0;
        int n;
        while (number>0){
            n= number%10;
            reversed = reversed *10 + n;
            number/=10;
        }
        System.out.println(reversed);
    }

    public static void task16() {
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum+=number%10;
            number/=10;
        }
        System.out.println(sum);
    }

    public static void task17(){
        int n =scanner.nextInt();
        boolean isPrime = true;
        if ( n<=1) isPrime = false;
        for ( int i =2; i< n; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);
    }

    public static void task18(){

    }

    public static void task19(){
        System.out.println("Please enter your number: *Note if you want to exite the program write &");
        String n;
        int amountOfPositive=0;
        int amountOfNegative=0;
        int amountOfZero=0;
        do{
            n = scanner.next();
            if(!n.equals("&")) {
                if (Integer.parseInt(n) < 0) amountOfNegative += 1;
                else if (Integer.parseInt(n) > 0) amountOfPositive += 1;
                else amountOfZero += 1;
            }
        }
        while (!n.equals("&"));
        System.out.println(amountOfPositive);
        System.out.println(amountOfZero);
        System.out.println(amountOfNegative);
    }

    public static void task20(){
        System.out.println("Please enter your number: ");
        char c;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do{
            int n = scanner.nextInt();
            if ( n > max) max = n;
            if(n < min) min = n;
            System.out.println("Do you want to continue? (Y/N)");
            c = scanner.next().charAt(0);
        }
        while (c=='Y');
        System.out.println(max);
        System.out.println(min);
    }


// **18. Write a program to calculate HCF(Highest Common Factor) of Two given number**
//
    public static void task21(){
        int sum = 0;
        for( int i = 100; i<=200; i++){
            if (i%9==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static void task22(){
        long binary = scanner.nextLong();
        int decimal = 0;
        String binaryStr = Long.toString(binary);
        for(int i = 0; i < binaryStr.length(); i++) {
            double n = (binary % 10) * Math.pow(2, i);
            binary/=10;
            decimal += n;
        }
        System.out.println( decimal);

    }

    public static void additional1(){
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        for (int i =0; i< height; i++){
            for ( int j=0; j< length; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void additional2(){
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        for (int i =0; i< height; i++){
            for ( int j=0; j< length; j++){
                if( j==0 || j == length-1 || i==0 || i == height-1) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void additional3(){
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        for (int i =0; i<height; i++){
            for ( int j=length; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void additional4(){
        char n = 'A';
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        for (int i =0; i<height; i++){
            for ( int j=0; j<=(length/2)-i+1; j++){
                System.out.print(" ");
            }
            for ( int k=0; k<=i; k++){
                System.out.print((n++)+" ");
            }
            System.out.println();
        }
    }

    public static void additional5(){
        char n = 'A';
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        for (int i =0; i<5; i++){
            n='A';
            for ( int j=0; j<i; j++){
                System.out.print(" ");
            }
            for ( int k=0; k<9-i*2; k++){
                System.out.print(n++);
            }
            System.out.println();
        }
    }


    public static void additional6(){
        int n =1;
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        for (int i =0; i<height; i++){
            for ( int j=0; j<=i; j++){
                System.out.print((n++)+ " ");
            }
            System.out.println();
        }
    }



    public static void additional7(){
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            // Внутренний цикл для управления пробелами перед звездочками
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Внутренний цикл для печати звездочек
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            // Переход на новую строку после печати строки треугольника
            System.out.println();
        }
    }
    public static void additional8(){
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= height-i-1; k++) {
                System.out.print("*");
            }

            // Переход на новую строку после печати строки треугольника
            System.out.println();
        }
    }

    public static void task123(){
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] matrix = new int [m][n];
        for( int i=0; i < m; i++){
            for ( int j=0; j < n; j++){
                matrix[i][j] = (i+1)*10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
