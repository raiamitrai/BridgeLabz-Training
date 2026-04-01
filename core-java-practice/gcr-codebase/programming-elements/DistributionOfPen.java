//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
//Hint =>
//Use Modulus Operator (%) to find the reminder.
//Use Division Operator to find the Quantity of pens
//I/P => NONE
//O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___

package programmingElements;

public class DistributionOfPen {
    public static void main(String[] args) {
        int numberOfPens = 14;
        int numberOfStudent = 3;
        int equalDistribution = numberOfPens/numberOfStudent;
        int notDistributedPen = numberOfPens % numberOfStudent;
        System.out.println("The Pen Per Student is " +equalDistribution+" and the remaining pen not distributed is " + notDistributedPen);
    }
}
