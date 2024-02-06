package lessons.lesson8;

public class IfNumbers {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        double randomX = Math.random();
        double randomY = Math.random();
        double randomZ = Math.random();

        x= (int) (randomX*100);
        System.out.println("Число х ="+x);

        y= (int) (randomY*100);
        System.out.println("Число y ="+y);

        z= (int) (randomZ*100);
        System.out.println("Число z ="+z);

        if (x<y && x<z) {

             System.out.println("Наименьшее число ="+ x);
        }
        else if (y<x && y<z) {
            System.out.println("Наименьшее число =" + y);
        }
        else {
            System.out.println("Наименьшее число ="+ z);



        }

        if (x>y && x>z) {

            System.out.println("Наибольшее число ="+ x);
        }
        else if (y>x && y>z) {
            System.out.println("Наибольшее число =" + y);
        }
        else {
            System.out.println("Наибольшее число ="+ z);

            boolean resultMaxNum;


        }

    }

        }




