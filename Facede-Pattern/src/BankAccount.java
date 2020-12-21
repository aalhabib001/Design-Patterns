public class BankAccount {
    private int balanceInAccount;

    public BankAccount(int amountOfCash){
        balanceInAccount = amountOfCash;
    }

    public void cashDeposit(int depositAmount){
        balanceInAccount+=depositAmount;
        System.out.println("The Amount of "+depositAmount+" BDT was Successfully Deposited");
    }

    public void cashWithdrawal(int withdrawAmount){
        balanceInAccount-=withdrawAmount;
        System.out.println("The Amount of " + withdrawAmount + " BDT was Successfully Withdrawn");
    }

    public boolean enoughMoney(int amount){
        if(amount<=balanceInAccount){
            return true;
        }

        return false;
    }

}
