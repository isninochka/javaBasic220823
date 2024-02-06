package lessons.lesson3;

public class Praktika {
    public static void main(String[] args) {

        int num0 = 0;
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;

        int sum = num0+num1+num2+num3+num4+num5+num6+num7+num8+num9;
        System.out.println ("Sum =" + sum);

        int intNumSum = sum/10;
        double doubleNumSum = sum/10;

// значение double должно выводиться на экрак как 4.5, но так как значения изначально даны как int выводится 4.0

        System.out.println ("SummInt =" + intNumSum);
        System.out.println ("SummDouble =" + doubleNumSum);

    }
}
