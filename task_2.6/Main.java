/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


        if (a % 2 == 0) {
            System.out.println("Делится");
            System.out.println(a/b);
        } else {
            System.out.println("Делится с остатком");
            System.out.println(a%b);


        }
    }
}
