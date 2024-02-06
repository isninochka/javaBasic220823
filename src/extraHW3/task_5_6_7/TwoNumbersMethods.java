package extraHW3.task_5_6_7;

public class TwoNumbersMethods {

    int number1;
    int number2;

    public static int greatestNumber (int number1, int number2){
        if (number1>number2){
            System.out.println("The first number is greater than the second");
            return number1;
        }else {
            System.out.println("The second number is greater than the first");
        }return number2;
    }
    public static int smallestNumber (int number1, int number2){
        if (number1<number2){
            System.out.println("The first number is smaller than the second");
            return number1;
        }else {
            System.out.println("The second number is smaller than the first");
        }return number2;
    }

    public static int equalsNumbers (int number1, int number2){
        if (number1==number2){
            System.out.println("Numbers are equals");
            return number1;
        }else {
            System.out.println("Numbers are different");
        }return number2;
    }
}
