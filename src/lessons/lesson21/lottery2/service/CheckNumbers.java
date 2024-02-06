package lessons.lesson21.lottery2.service;

public class CheckNumbers {
    public boolean isRandomNumberCorrect(int randomNumber, int[] array){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == randomNumber)
                return false;
        }
        return true;
    }

    public boolean isUserNumberCorrect(int userNumber, int[] array){

        if (userNumber < 0 || userNumber > 50 ) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber)
                return false;
        }

        return true;

    }
}
