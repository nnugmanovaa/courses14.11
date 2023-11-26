import java.util.Scanner;

public class Test1 {
    // Описать функцию TriangleP(a, h), находящую периметр равнобедренного треугольника
//   по его основанию a и высоте h, проведенной к основанию (a и h — вещественные).
//   С помощью этой функции найти периметры трех треугольников, для которых даны основания и высоты.
//   Для нахождения боковой стороны b треугольника использовать теорему Пифагора: b^2 = (a/2)^2 + h^2

//   The month number is given — an integer in the range 1-12 (1 — January, 2 —February, etc.).
//   Print the name of the corresponding time of year ("winter","spring", "summer", "autumn").
//
//Описание: Единицы длины пронумерованы следующим образом: 1 — дециметр,2 — километр, 3 — метр,
// 4 — миллиметр, 5 — сантиметр. Дан номерединицы длины (целое число в диапазоне 1–5) и
// длина отрезка в этихединицах (вещественное число). Найти длину отрезка в метрах..
    public static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) {
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();
        double p = TriangleP(a, h);
        System.out.println(p);
    }

    public static double TriangleP(double a, double h) {
        double b = Math.sqrt(Math.pow(a / 2,2) + Math.pow(h,2));
        return a + b + b;
    }

}