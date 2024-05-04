package homework;

import java.util.Random;

public class Task4 {
    /*
     Реализовать с использованием switch Ваш ребенок принес оценку за контрольную
     работу по математике. В школе 12 бальная система. Запишите в переменную случайное
     число от 0 до 12. Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
     (Оставшееся время не может быть больше 1 часа) На сегодня у него осталось 45 минут.
     (записать в переменную)
     Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся
     на сегодня времени 1 час от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
     от 4 до 6 -> Нейтральные слова + ко времени 15 минут 3 -> Огорчитесь. Минус 30 минут
     ко времени оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
     Выведите на экран оставшееся на сегодня время для просмотра ТВ
     */

    public static void main(String[] args) {

        Random random = new Random();
        int grade = random.nextInt(13);

        int remainingTime = 45;

        switch (grade){
            case 12:
            case 11:
            case 10:
                System.out.println(grade + " Молодец!");
                remainingTime += 60;
                break;

            case 9:
            case 8:
            case 7:
                System.out.println(grade + " Так держать!");
                remainingTime += 45;
                break;

            case 6:
            case 5:
            case 4:
                System.out.println(grade + " Не плохо.");
                remainingTime += 15;
                break;

            case 3:
            case 2:
            case 1:
                System.out.println(grade + " Очень печально.");
                remainingTime -= 30;
                break;

            default:
                System.out.println(" Трагедия " + grade);
        }
    }
}
