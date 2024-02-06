package extraHW3.task_5_6_7;

import lessons.lesson7.calculator.UserInput;

public class TwoNumbers {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        System.out.println("Please, enter first number: ");
        int number1 = userInput.userInputInt();

        System.out.println("Please, enter second number: ");
        int number2 = userInput.userInputInt();

        int greaterNumber = TwoNumbersMethods.greatestNumber(number1,number2);
        System.out.println(greaterNumber);

        int smallerNumber = TwoNumbersMethods.smallestNumber(number1,number2);
        System.out.println(smallerNumber);

        int equalsNumbers = TwoNumbersMethods.equalsNumbers(number1,number2);

        }

    }

