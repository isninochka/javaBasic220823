package extraHW3.task_0_4;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", 10000);
        String ownerFirstName = bankAccount.getOwner();
        int money = bankAccount.getMoney();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + money);


    }
}
