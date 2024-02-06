package lessons.lesson21.lottery2.service;

import java.util.Random;
import java.util.Scanner;

public class NumbersInput {

    public int userNumberInput(int counter){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите " + (counter + 1) + "-е число вашего билета: ");
        return scanner.nextInt();
    }

    public int randomNumberInput(){
        Random random = new Random();
        return (1 + random.nextInt(50));
    }

}
