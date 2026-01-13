package exception.throwvsthrows;

public class ThrowVsThrows {

    double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        if(amount < 0 || rate < 0 ){
            throw new IllegalArgumentException("Invalid Input");
        }

        return (amount * rate * years)/100;
    }

}
