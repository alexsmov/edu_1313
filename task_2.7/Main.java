/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 31;
        int b = scan.nextInt();


        if (a/b== 31)

            System.out.println(true);
        else if (a/b== 1) System.out.println(true);
        else System.out.println(false);




    }
}

