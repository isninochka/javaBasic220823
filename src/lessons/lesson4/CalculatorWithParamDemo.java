package lessons.lesson4;

public class CalculatorWithParamDemo {
    public static void main(String[] args) {
        CalculatorWithParam calc = new CalculatorWithParam();
        System.out.println("Результат сложения:"+calc.add(375.2,893.7));

        double num = 937.7;
        double num2 = 579.4;

        System.out.println("Результат деления:"+calc.div (num,num2));
    }
}
