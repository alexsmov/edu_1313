/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] nums = {2, 3, 4, 5};
        if (a==5) System.out.println("Да");
        else System.out.println("Нет");

        }
    }

//Второе решение:

public class Main {
    public static void main(String[] args) {

        int[] mass = {2, 3, 4, };
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Элемент "+i+" равен "+mass[i]);
            if (mass[i]==5) {
                System.out.println("Да");

            }
            else if (i==mass.length-1)
                System.out.println("Нет");
        }
    }
}

