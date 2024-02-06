package extraHW2.task_16;

public class Numbers_Method {

    public static int linearSearch (int[] array, int search){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;

            }
        }
        return -1;

    }
}
