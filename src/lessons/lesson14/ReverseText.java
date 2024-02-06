package lessons.lesson14;

public class ReverseText {
    public String reversUserText (String userText){

        String reverseResult ="";

        for (int i = userText.length() -1; i>=0;i--){
            reverseResult=reverseResult+userText.charAt(i);
        }
        return reverseResult;
    }





}
