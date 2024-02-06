package lessons.lesson21.lottery2.entity;

import lessons.lesson21.lottery2.service.CheckNumbers;
import lessons.lesson21.lottery2.service.NumbersInput;

public class WinnerNumbers {

    private int[] winnerNumbers = new int[5];
    NumbersInput numbersInput = new NumbersInput();
    CheckNumbers checkNumbers = new CheckNumbers();


    public void fillWinnerNumbers() {
        int counter = 0;

        while (counter < 5) {
            int randomNumber = numbersInput.randomNumberInput();
            if (checkNumbers.isRandomNumberCorrect(randomNumber, winnerNumbers)) {
                winnerNumbers[counter] = randomNumber;
                counter++;
            }
        }
    }


}
