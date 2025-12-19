//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
//Hint =>
//Use infinite while loop as in while (true)
//Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

package controlflow;



import java.util.Scanner;
class SumOfZeroOrNegativeNumberUsingWhileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = input.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println("The total sum is " + sum);
    }
}
