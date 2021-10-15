/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

public class Main {
    public static void main(String[] args) {
        double vklad = 1000;
        double procent = 0.02;

        for (int year = 1; year <= 5; year++) {
            vklad += vklad * procent;
            System.out.println("За " + year + " год, на вашем счету появилась " + vklad + " сумма долларов");
        }
    }
}
