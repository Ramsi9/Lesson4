import com.sun.source.tree.IfTree;

import javax.sound.sampled.Line;
import javax.xml.transform.Result;
import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;


public class Main {
    public static void main(String[] args) {

/*
         System.out.println("Введите свой вес в кг");
         double weight = new Scanner(System.in).nextDouble();
         System.out.println("Введите свой рост в м");
         double height = new Scanner(System.in).nextDouble();

         System.out.println( weight/(height * height) + "=BMI");
*/

        {
            System.out.println("\t\t***DOBRO POJALOVAT V KALKYLATOR***\t\t");

            System.out.println("Умножение");{

            System.out.println("Введите первое число:");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Введите второе число:");
            double b = new Scanner(System.in).nextDouble();
            System.out.println( a + "*" + b + "=" + a*b );}

            System.out.println("Деление");{
            System.out.println("Введите первое число:");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Введите второе число:");
            double b = new Scanner(System.in).nextDouble();
            System.out.println( a + "/" + b + "=" + a/b );}

            System.out.println("Сложение");{

            System.out.println("Введите первое число:");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Введите второе число:");
            double b = new Scanner(System.in).nextDouble();
            System.out.println( a + "+" + b + "=" + a + b );}

            System.out.println("Вычитание");{

            System.out.println("Введите первое число:");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("Введите второе число:");
            double b = new Scanner(System.in).nextDouble();
            System.out.println( a + "-" + b + "=" + (a-b) );}




        }



       /*    System.out.println("Введите один из знаков, | + - * / |");int v = new Scanner(System.in).nextInt();System.out.println("Введите второе число:");
            int b = new Scanner(System.in).nextInt();
            int ans = 0;
            if (v == '+') {
                ans = a + b;
            } else if (v == '-') {
                ans = a - b;
            } else if (v == '*') {
                ans = a * b;
            } else if (v == '/') {
                ans = a / b;}*/





        /*long $ = (20);
        System.out.println($);
        long b = (10);
        System.out.println(b);
        long catCount = (2);
        System.out.println(catCount);
        long badBoy = (10);
        System.out.println(badBoy);
        long letsGo = (15);
        System.out.println(letsGo);
        char a = 'H';
        System.out.println(a);
        char c = 'X';
        System.out.println(c);
        String m = ("Hello world");
        System.out.println(m);
        Integer l = (10);
        System.out.println(l);
        double v = (123);
        System.out.println(v);
*/
    }
}