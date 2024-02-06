package lessons.lesson24.sklad.service;

import java.util.Scanner;

public class InputData {

    public int UserInputInt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String UserInputLine(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
