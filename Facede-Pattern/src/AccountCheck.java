public class AccountCheck {
    private final int accountNumber;
    private final int pinNumber;

    public AccountCheck(int accountNumber, int pinNumber) {
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
    }

    public boolean checkAccountNumber(int clientsAccountNumber){
        if (clientsAccountNumber == accountNumber){
            return true;
        }

        return false;
    }

    public boolean checkPin(int clientsPin){
        if(clientsPin==pinNumber){
            return true;
        }

        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }
}
