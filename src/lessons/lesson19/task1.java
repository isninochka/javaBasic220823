package lessons.lesson19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task1 {

//    Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
//    Не используйте дополнительный массив для хранения результатов.

    public static void main(String[] args) {

        String[] strings = new String[]{"Каждый","охотник","желает","знать","где", "сидит", "фазан"};

        System.out.println(Arrays.toString(strings));

        for (int i = 0; i< strings.length/2; i++) {
            String tempString = strings[i];
            strings[i] = strings[strings.length-1-i];
            strings[strings.length -1 -i] = tempString;

           }
        System.out.println(Arrays.toString(strings));

    }


}
