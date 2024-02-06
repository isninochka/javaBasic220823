package lessons.lesson18.extraTask.extraTask2_1;

import java.util.Arrays;

public class ExtraTask_1MethodBubble {

    public static boolean bubbleSort(int[] workingArray){
        boolean notSorted = true;
        int temp;
        while (notSorted) {
            System.out.println(notSorted);
            System.out.println(Arrays.toString(workingArray));
            notSorted = false;
            for (int i = 0; i < workingArray.length-1; i++) {
                if(workingArray[i]>workingArray[i+1]){
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i+1];
                    workingArray[i+1] = temp;
                    notSorted = true;

                }
            }
        } return notSorted;

    }

}
