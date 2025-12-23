package leetcode;

class SolutionReverse {
    public int reverse(int x) {

        int y=x;
        String st = Integer.toString(y);
        int len=st.length() - 1;
        int g=0;
        while(x !=0){
            int num=x%10;
            if (g > Integer.MAX_VALUE / 10 || (g == Integer.MAX_VALUE / 10 && num > 7)) {
                return 0;
            }
            if (g < Integer.MIN_VALUE / 10 || (g == Integer.MIN_VALUE / 10 && num < -8)) {
                return 0;
            }
            g= g*10+num;

            x=x/10;
        }
        return g;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        SolutionReverse sol = new SolutionReverse();

        System.out.println(sol.reverse(123));    // 321
        System.out.println(sol.reverse(-123));   // -321
        System.out.println(sol.reverse(1534236469)); // 0 (overflow)
    }
}

