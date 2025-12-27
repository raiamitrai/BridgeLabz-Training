package OOPs.inheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {

    private int tenure; // in years

    public FixedDepositAccount(long accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        displayBasicDetails();
        System.out.println("Tenure      : " + tenure + " years");
    }
}

