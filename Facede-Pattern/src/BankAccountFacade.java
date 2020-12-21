import java.util.Scanner;

public class BankAccountFacade {
    private int accountNumber;
    private int pinNumber;
    StartMachine startMachine;
    AccountCheck accountCheck;
    BankAccount bankAccount;

    public BankAccountFacade(int clientAccountNumber, int clientPin, int balance) {
        accountNumber = clientAccountNumber;
        pinNumber = clientPin;
        startMachine = new StartMachine();
        accountCheck = new AccountCheck(123456, 1234);
        bankAccount = new BankAccount(balance);
        startMachine.showWelcomeMassage();
    }

    public void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        int amount;

        if (accountCheck.checkAccountNumber(123456) && accountCheck.checkPin(1234)) {
            System.out.print("Enter the amount to withdraw: ");
            amount = sc.nextInt();

            if (bankAccount.enoughMoney(amount)) {
                bankAccount.cashWithdrawal(amount);
            } else {
                System.out.println("Not Enough Money to Withdraw");
            }
        } else {
            System.out.println("Wrong Account Number or Pin Number");
        }
    }
}

