package customClass;

public class CapitalOne {
    public static void main(String[] args) {

        bankAccount account1 = new bankAccount();
        account1.setInfo("ytd", 123456789, 0);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(400);
        account1.checkBalance();

    }
}
