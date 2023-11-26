import java.util.Scanner;

public class Loops {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task6();
//        char[][] array = new char[5][5];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == 0 || i == array.length -1 || j == 0 || j == array.length-1 ) {
//                    array[i][j] = '*';
//                } else {
//                    array[i][j] = ' ';
//                }
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

    public static void task1(){
        int sum = 0;
        for(int i=0; i<10; i++){
            System.out.println("Please enter number " + (i+1) + ": ");
            int first = scanner.nextInt();
            sum+=first;
        }
        System.out.println(sum);
    }

    public static void task2(){
        System.out.println("How many numbers? ");
        int amount = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<amount; i++){
            System.out.println("Please enter number " + (i+1) + ": ");
            int first = scanner.nextInt();
            sum+=first;
        }
        System.out.println(sum);
    }
     public static void task3(){
        int n = scanner.nextInt();
        System.out.println(findFactorial(n));
//        int mult =1;
//        for( int i =1; i<=n; i++){
//            mult*=i;
//        }
//         System.out.println(mult);
     }

     public static int findFactorial (int n){
        if ( n==0 || n ==1){
            return 1;
        }
        else {
            return n * findFactorial(n-1);
        }
     }

     public static void task4(){
        System.out.println("please write what operation do you want to see: ");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                for(int i=0; i< 3 ; i++){
                    System.out.println("Hello world");
                }
                break;
            case 2:
                for(int i=0; i< 10 ; i++){
                    System.out.println(i+1);
                }
                break;
            case 3:
                int count = 0;
                while ( count < 10){
                    System.out.print( "* ");
                    count++;
                }
                break;
            case 4:
                for(int i=5; i>= -5 ; i--){
                    System.out.println(i);
                }
                break;
            case 5:
                for(int i=5; i<=30 ; i+=3){
                    System.out.println(i);
                }
                break;

        }

     }
    public static void task5(){
        for( int i=0; i<10; i++){
            System.out.println("I am now printing for the " + (i + 1) +"th time");
        }
    }

    public static void task6(){
        int n = scanner.nextInt();
        double sum =0;
        for ( int i=1; i<=n; i++){
            sum+=1.0/i;
        }
        System.out.println( sum);
    }
}
