package extraHW3.task_0_3;

import lessons.lesson7.calculator.UserInput;

public class ProduktDemo {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        Produkt produkt = new Produkt("LapTop HP");


        System.out.println("Введите стоимость продукта " + produkt.name);
        double regularPrice = userInput.userInputDouble();

        System.out.println("Введите скидку на продукт  " + produkt.name);
        double discount = userInput.userInputDouble();


        double price = produkt.actualPrice(regularPrice,discount);

        System.out.println("Стоимость продукта " + produkt.name + " с учетом скидки, равна: " + price);


    }
}
