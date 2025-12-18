//Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
//Hint =>
//Create a variable named fee and take user input for fee.
//Create another variable discountPercent and take user input.
//Compute the discount and assign it to the discount variable.
//Compute and print the fee you have to pay by subtracting the discount from the fee.
//I/P => fee, discountPrecent
//O/P => The discount amount is INR ___ and final discounted fee is INR ___

package programmingElements;

import java.util.Scanner;

public class StudentFeeAndStudentDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPercent = sc.nextInt();
        double discount = (fee * discountPercent)/100;
        double discountFee = fee - discount;
        System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR " + discountFee);
    }
}
