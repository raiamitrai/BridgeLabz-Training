package Day19.JavaStack;

import java.util.*;
class Solution{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
            String input = sc.next();

            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char ch : input.toCharArray()) {

                // Opening brackets
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }

                // Closing brackets
                else {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }

                    char top = stack.pop();

                    if (ch == ')' && top != '(') {
                        balanced = false;
                        break;
                    }

                    if (ch == '}' && top != '{') {
                        balanced = false;
                        break;
                    }

                    if (ch == ']' && top != '[') {
                        balanced = false;
                        break;
                    }
                }
            }


            if (!stack.isEmpty()) {
                balanced = false;
            }

            System.out.println(balanced);
        }

	}
}




