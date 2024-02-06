package extraHW2.task_16;

import lessons.lesson7.calculator.UserInput;

import java.util.Scanner;

public class Numbers {
//    1. Получить от пользователя набор данных (6 целочисленных значений)
//2. Сохранить полученные данные в массив
//3. Получить от пользователя ключевой элемент
//4. Реализовать метод линейного поиска ключевого элемента в массиве,
//    метод должен вернуть индекс элемента или -1
//            5. Если элемент существует, вывести на консоль: Элемент в n-индексе,
//    иначе Элемент не найден.
//            6. Проанализируйте написанный код используя режим Дебаггер
public static void main(String[] args) {


    UserInput ui = new UserInput();
    int[] userArrays = new int[6];



    for (int i = 0; i < userArrays.length; i++) {

        System.out.println("Введите число " + (i+1) + ":");
        userArrays[i] = ui.userInputInt();
    }
    System.out.println("Введите число, которое хотите найти в массиве ");
    int searchNumber = ui.userInputInt();

    int searchIndex = Numbers_Method.linearSearch(userArrays,searchNumber);

    System.out.println("Искомый элемент имеет индекс:" + searchIndex);

    if (searchIndex == -1){
        System.out.println("Искомый элемент не найден");

    }










}
}
