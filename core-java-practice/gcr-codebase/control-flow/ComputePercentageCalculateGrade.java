package controlflow;
import java.util.Scanner;
public class ComputePercentageCalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int physicsMark = sc.nextInt();
        int chemistryMark = sc.nextInt();
        int mathMark = sc.nextInt();

        System.out.println("Physics marks" + physicsMark);
        System.out.println("Chemistry marks" + chemistryMark);
        System.out.println("Maths marks" + mathMark);

        int percentage = ((physicsMark + chemistryMark + mathMark) / 3 )*100;
        int averageMarks = (physicsMark + chemistryMark + mathMark) / 3;

        if(percentage < 40){
            System.out.println("Grade : R");
            System.out.println("Remidial standers");
        }
        if(percentage >39 && percentage < 50){
            System.out.println("Grade : E");
            System.out.println("Level 1-, too below agency-normalized standards");
        }
        if(percentage >49 && percentage < 60){
            System.out.println("Grade : D");
            System.out.println("Level 1, well below agency-normalized standards");
        }
        if(percentage >59 && percentage < 70){
            System.out.println("Grade : C");
            System.out.println("Level 2, below, but agency-normalized standards");
        }
        if(percentage >69 && percentage < 80){
            System.out.println("Grade : B");
            System.out.println("Level 3, at agency-normalized standards");
        }
        if(percentage >79){
            System.out.println("Grade : A");
            System.out.println("Level 4, above agency-normalized standards");
        }

    }
}
