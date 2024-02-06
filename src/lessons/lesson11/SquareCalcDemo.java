package lessons.lesson11;

public class SquareCalcDemo {
    public static void main(String[] args) {
        UserData userData = new UserData();
        ShareAreaCalc areaCalc = new ShareAreaCalc();

        userData.inputNumOfShapeType();

        userData.inputUserAnswer();

        switch (userData.numOfShapeType){
            case 1:
                userData.corAnswer = ((int) (100 * areaCalc.circleArea(userData.shapeParam1))) / 100;
                break;
            case 2:
                userData.corAnswer = areaCalc.squareArea(userData.shapeParam1);
                break;
            case  3:
                userData.corAnswer = areaCalc.rectangleArea(userData.shapeParam1, userData.shapeParam2);
                break;
        }
        userData.checkResult =(userData.userAnswer == userData.corAnswer);

        if (userData.checkResult){
            System.out.println("Ваш ответ правильный");
        } else {
            System.out.println("Ваш ответ не правильный");
        }

    }
}
