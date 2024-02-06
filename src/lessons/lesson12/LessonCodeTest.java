package lessons.lesson12;

public class LessonCodeTest {
    public static void main(String[] args) {
    CheckNumbers cheks = new CheckNumbers();

       int userNum1 = 6;

       boolean actualResult1 = cheks.isEven(userNum1);
       boolean expectedResult1 = true;

        if (actualResult1 == expectedResult1) {
            System.out.println("Четные числа определяются правильно");
        } else {
            System.out.println("Четные числа определяются не правильно");
                    }


        int userNum2 = 7;
        boolean actualResult2 = cheks.isEven(userNum2);
        boolean expectedResult2 = false;

        if (actualResult2 == expectedResult2) {
            System.out.println("Не четные числа определяются правильно");
        } else {
            System.out.println("Не четные числа определяются не правильно");

        }



    }
}
