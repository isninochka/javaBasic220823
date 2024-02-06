package lessons.lesson18.extraTask.task2;

import java.util.Random;

public class Task2 {
//    Создайте массив из всех нечётных чисел от 1 до 99.
//    Выведите его на экран в строку в обратном порядке

    public static void main(String[] args) {

        int[] oddNumArray = new int [50];
        int counterArray = 0;

        for (int i = 0; i < oddNumArray.length; i++) {
            if (i % 2 !=0) {
                oddNumArray[counterArray] = i;
                counterArray++;
            }
        }
        for (int i = 49; i >=0 ; i--) {

            System.out.print(oddNumArray[i] + ", ");

        }
    }

}
