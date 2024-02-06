package lessons.lesson11;

import lessons.lesson7.calculator.UserInput;

public class UserData {
    int numOfShapeType;

    double shapeParam1;
    double shapeParam2;
    double userAnswer;

    double corAnswer;
    boolean checkResult;

    UserInput ui =new UserInput();

    public void inputNumOfShapeType(){
        System.out.println("Please choice your shape: ");
        System.out.println("1.Круг");
        System.out.println("2.Квадрат");
        System.out.println("3.Прямоугольник");
        numOfShapeType = ui.userInputInt();

        if (numOfShapeType<1 || numOfShapeType>3)
            System.out.println("Ваш выбор некорректен!");
        System.exit(1);

        switch (numOfShapeType) {
            case 1:
                System.out.println("Пожалуйста введите радиус круга: ");
                shapeParam1 = ui.userInputDouble();
                break;
            case 2:
                System.out.println("Пожалуйста введите сторону квадрата: ");
                shapeParam1 = ui.userInputDouble();
                break;
            case 3:
                System.out.println("Пожалуйста введите первую сторону прямоугольника: ");
                shapeParam1 = ui.userInputDouble();
                System.out.println("Пожалуйста введите вторую сторону прямоугольника: ");
                shapeParam2 = ui.userInputDouble();
                break;
        }



        }
    public void inputUserAnswer() {
        System.out.println("Пожалуйста введите свой вариант ответа: ");
        userAnswer = ui.userInputDouble();
    }

    }



