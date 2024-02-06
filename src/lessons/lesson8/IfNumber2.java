package lessons.lesson8;

public class IfNumber2 {

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


        if (x<y && y<z) {
            System.out.println ("По убыванию:" + x + " ," + y + " ," + z);
        }
        else if (x<z && z<y) {
            System.out.println ("По убыванию:"+ x + " ," + z + " ," + y);
        }
        else if (y<x && x<z) {
            System.out.println ("По убыванию:"+ y + " ," + x + " ," + z);
        }
        else if (y<z && z<x) {
            System.out.println ("По убыванию:"+ y + " ," + z + " ," + x);
        }
        else if (z<x && x<y) {
            System.out.println ("По убыванию:"+ z + " ," + x + " ," + y);
        }
        else if (z<y && y<x) {
            System.out.println ("По убыванию:"+ z + " ," + y + " ," + x);
        }
        else {
            System.out.println ("Выбраны одно или несколько одинаковых чисел");

        }
        if (x>y && y>z) {
            System.out.println ("По возрастанию:" + x + " ," + y + " ," + z);
        }
        else if (x>z && z>y) {
            System.out.println ("По возрастанию:"+ x + " ," + z + " ," + y);
        }
        else if (y>x && x>z) {
            System.out.println ("По возрастанию:"+ y + " ," + x + " ," + z);
        }
        else if (y>z && z>x) {
            System.out.println ("По возрастанию:"+ y + " ," + z + " ," + x);
        }
        else if (z>x && x>y) {
            System.out.println ("По возрастанию:"+ z + " ," + x + " ," + y);
        }
        else if (z>y && y>x) {
            System.out.println ("По возрастанию:"+ z + " ," + y + " ," + x);
        }
        else {
            System.out.println ("Выбраны одно или несколько одинаковых чисел");

        }

    }

}

