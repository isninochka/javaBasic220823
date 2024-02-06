package extraHW2.task_15;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Nokia");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model is " + phoneModel);

        Phone newPhone = new Phone("Apple");
        String phoneModel2 = newPhone.getModel();
        System.out.println("Phone model2 is " + phoneModel2);

    }
}
