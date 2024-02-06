package lessons.lesson18.extraTask.extraTask2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarDemo {
//    1. Создайте 5 объектов типа Car
//    a. Объект Car должен содержать поля
//● private double price;
//● private String model;
//● и конструктор с этими полями
//2. Сохраните объекты в массив
//3. Распечатайте результат
//    a. Результат печати одного авто должен выглядеть:
//            ● Car - BMW, price = 2.3
//            4. Применив метод “сортировка пузырьком” отсортируйте массив по
//            стоимости
//5. Распечатайте результат
//6. Применив метод “сортировка пузырьком” отсортируйте массив по модели
//            (первая буква из модели)
//7. Распечатайте результат

    public static void main(String[] args) {


        Car car1 = new Car(14000, "WV");
        Car car2 = new Car(18000, "Audi");
        Car car3 = new Car(23000, "Nissan");
        Car car4 = new Car(37000, "Mecedes");
        Car car5 = new Car(50000, "Tesla");

        Car [] cars = {car1,car2,car3,car4,car5};
        System.out.println("Массив состоит из автомобилей: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Model - " + cars[i].getModel() + ", price - " + cars[i].getPrice());
                    }

        


    }
}
