package lessons.lesson21.lottery2.entity;


import lessons.lesson21.lottery2.service.CheckNumbers;
import lessons.lesson21.lottery2.service.NumbersInput;

public class LotteryTicket {

    private int[] lotteryTicket = new int[5];

    NumbersInput numbersInput = new NumbersInput();
    CheckNumbers checkNumbers = new CheckNumbers();


    public void fillTicket(){

        int counter = 0;

        while (counter < 5) {
            int userNumber = numbersInput.userNumberInput(counter);
            if (checkNumbers.isUserNumberCorrect(userNumber, lotteryTicket)) {
                lotteryTicket[counter] = userNumber;
                counter++;
            } else {
                System.out.println("ваше число не корректно, пожалуйста повторите ввод!");
            }
        }
    }


}
