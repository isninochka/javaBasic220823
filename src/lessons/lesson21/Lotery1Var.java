package lessons.lesson21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotery1Var {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] winNumbers = new int[5];
        int[] usersNumbers = new int[5];

        System.out.println("Please enter your numbers:");

        for (int i = 0; i < usersNumbers.length; i++) {
            System.out.println("Пожалуйста введите " + (i + 1) + "-ый номер (от 1 до 50) : ");
            usersNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < winNumbers.length; i++) {
            winNumbers[i] = random.nextInt(50) + 1;
        }

        System.out.println("лотерейный билет пользователя: ");
        System.out.println(Arrays.toString(usersNumbers));

        System.out.println("выигрышные номера: ");
        System.out.println(Arrays.toString(winNumbers));

    }
}
