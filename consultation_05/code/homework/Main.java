package homework;

import java.util.Scanner;

public class Main {
    /*
    Task 1
    Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
    1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
    Перепишите решение задачи с использованием switch вместо if-else
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3: ");
        int number = scanner.nextInt();

        switch (number) {

            case 1:
                System.out.println("Вы ввели число 1!");
                break;

            case 2:
                System.out.println("Вы ввели число 2!");
                break;

            case 3:
                System.out.println("Вы ввели число 3!");
                break;

            default:
                System.out.println("Вы ввели неправильное число. Попробуйте еще раз.");
        }
    }
}
