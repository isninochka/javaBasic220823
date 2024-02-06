package lessons.lesson18.extraTask.task3;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {

//    Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//    Подсчитайте сколько в массиве чётных элементов и выведете это
//    количество на экран на отдельной строке.
public static void main(String[] args) {

    Random random = new Random();
    int arraySize = 15;
    int countEven = 0;

    int[] intArray = new int[arraySize];
    System.out.println("Массив выглядит так: ");
    for (int i = 0; i < intArray.length; i++) {
        intArray[i]=random.nextInt(10);
        System.out.print(intArray[i] + ",");
            }
    System.out.print(Arrays.toString(intArray));

    for (int i = 0; i < intArray.length; i++) {
        if (i % 2 ==0 && intArray[i]!=0);
        {countEven++;}
         }
    System.out.print("Количество четных элементов в данном массиве: " + countEven);


}
}
