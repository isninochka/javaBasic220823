package lessons.lesson12.Praktika;

import lessons.lesson12.CheckNumbers;

public class CheckString {

    public boolean checkText (String userText){
        int stringLength = userText.length();

        CheckNumbers checkNumbers = new CheckNumbers();
        boolean checkResult = checkNumbers.isEven(stringLength);
        return checkResult;
    }
}
