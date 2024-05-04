package homework;

import java.util.Random;

public class Task2 {
    /*
    Task 2
    Запишите в 4 переменные случайные числа от 0 до 100
    Выведите все 4 на экран
    Программа должна определить максимальное из этих четырех чисел
    Результат вывести на экран
    */

    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);
        System.out.println("Число 4: " + num4);

        int max = num1;

        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        if (num4 > max){
            max = num4;
        }

        System.out.println("Максимальное число: " + max);
    }
}
