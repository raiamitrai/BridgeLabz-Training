package OOPs.inheritance.bankaccounttypes;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount(101001, 50000, 4.5);

        CheckingAccount ca =
                new CheckingAccount(202002, 30000, 10000);

        FixedDepositAccount fd =
                new FixedDepositAccount(303003, 200000, 5);

        sa.displayAccountType();
        System.out.println();

        ca.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}

