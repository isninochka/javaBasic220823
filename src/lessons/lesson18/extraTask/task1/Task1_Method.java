package lessons.lesson18.extraTask.task1;

import java.util.Arrays;

public class Task1_Method {

    public static int findNum(int[] intArray) {


        int sumNum = ((intArray.length + 1) * (intArray.length + 2)) / 2;

        int sum= Arrays.stream(intArray).sum();

        System.out.println(sum);
        System.out.println(sumNum);

        int misNum = sumNum-sum;
        return misNum;


    }
}