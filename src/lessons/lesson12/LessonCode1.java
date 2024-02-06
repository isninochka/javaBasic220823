package lessons.lesson12;

import java.util.Scanner;

public class LessonCode1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число ");

        int num = scanner.nextInt();

        if (num % 2 == 0) {
            int newNum = num+10;

            System.out.println("Вы ввели четное число: " + newNum);


        } else {

            System.out.println("Вы ввели не четное число: " + num);
        }

    }
}