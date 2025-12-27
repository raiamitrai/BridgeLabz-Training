package OOPs.inheritance.bankaccounttypes;

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        displayBasicDetails();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

