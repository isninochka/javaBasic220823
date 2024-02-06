package lessons.lesson18.extraTask.task1;

public class Task1 {

//    Дан массив размера N-1, содержащий только различные целые числа в диапазоне от 1 до N .
//    Найдите недостающий элемент.
//            Пример 1:
//    Вход:
//    N = 5
//    А[] = {1,2,3,5}
//    Выход: 4
//    Пример 2:
//    Вход:
//    N = 10
//    А[] = {6,1,2,8,3,4,7,10,5}
//    Выход: 9



    public static void main(String[] args) {


        int[] intArray = {1,2,3,4,5,7,8};

        int missing = Task1_Method.findNum(intArray);

        System.out.println("Недостающее число в вашем массеве - " + missing);





    }
}
