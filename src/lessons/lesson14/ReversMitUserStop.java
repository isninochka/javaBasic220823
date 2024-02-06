package lessons.lesson14;

import java.util.Scanner;

public class ReversMitUserStop {
    public static void main(String[] args) {

        ReverseText reverseText = new ReverseText();
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        do {
            System.out.println("Пожалуйста введите текст: ");

            String userText = scanner.nextLine();

            String reversResult = reverseText.reversUserText(userText);
            System.out.println("Ваш текст выглядит так: ");
            System.out.println(reversResult);

            System.out.println("продолжать? Y / N");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals("N")) {
                {condition = false;}
                System.out.println("Вы закончили работу с текстами");
            }
        }
        while (condition) ;
        }


    }



