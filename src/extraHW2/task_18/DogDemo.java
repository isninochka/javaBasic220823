package extraHW2.task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog newDog = new Dog ("Rex", 1);

        String voiceNewDog = newDog.voice();

        System.out.println(voiceNewDog);

        Dog secondDog = new Dog("Lessy", 3);

        String voiceSecondDog = secondDog.voice();

        System.out.println(voiceSecondDog);

    }
}
