package leetcode;
class SolutionPelindrome {
    public boolean isPalindrome(int x) {
        int original = x;
        int k  =0;
        while(x > 0){
            int m = x % 10;
            k = (k * 10 ) + m;
            x = x/10;
        }
        if(k  == original) {
            return true;
        }
        return false ;
    }
}

public class Pelindrome {
    public static void main(String[] args) {

        SolutionPelindrome sol = new SolutionPelindrome();

        System.out.println(sol.isPalindrome(121));   // true
        System.out.println(sol.isPalindrome(123));   // false
        System.out.println(sol.isPalindrome(10));    // false
    }
}


