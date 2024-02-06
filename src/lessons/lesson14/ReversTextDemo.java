package lessons.lesson14;

import java.util.Random;
import java.util.Scanner;

public class ReversTextDemo {

    public static void main(String[] args) {

    ReverseText reverseText = new ReverseText();
    Scanner scanner =new Scanner (System.in);

        System.out.println( "Пожалуйста введите текст: ");

        String userText = scanner.nextLine();

        String reversResult = reverseText.reversUserText(userText);
        System.out.println("Ваш текст выглядит так: ");
        System.out.println(reversResult);

    }

    }

