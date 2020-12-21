public class ATMBooth {
    public static void main(String[] args) {
        BankAccountFacade bankAccount = new BankAccountFacade(123456, 1234, 30000);

        bankAccount.withdrawMoney();
    }
}
