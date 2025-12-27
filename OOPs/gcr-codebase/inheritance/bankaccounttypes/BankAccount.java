package OOPs.inheritance.bankaccounttypes;

class BankAccount {

    protected long accountNumber;
    protected double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBasicDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

