//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
//I/P => NONE
//O/P => Sam’s average mark in PCM is ___


package programmingElements;

public class SamsAveragemarkinPCM {
    public static void main(String[] args) {
        int markIntMath = 94;
        int markInPhysics = 95;
        int markInChemistry = 96;

        int averageMarkInPCM = (markInChemistry + markInPhysics + markIntMath)/3;
        System.out.println("Sam’s average mark in PCM is " + averageMarkInPCM);
    }
}
