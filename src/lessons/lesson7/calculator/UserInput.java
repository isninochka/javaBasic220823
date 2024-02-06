package lessons.lesson7.calculator;

import java.util.Scanner;

public class UserInput {

       public int userInputInt(){
            Scanner scanner = new Scanner(System.in);
             return scanner.nextInt();

        }
        public double userInputDouble (){
           Scanner scanner = new Scanner (System.in);
           return scanner.nextDouble();

        }
        public String userInputText (){
           Scanner scanner = new Scanner(System.in);
           return scanner.nextLine();

        }


      }


