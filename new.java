import java.util.*;

class Q3 {
    static int Precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static void InfixToPostfix(String exp) {
        Stack<Character> st3 = new Stack<>();
        StringBuilder output_exp = new StringBuilder();
        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                output_exp.append(c);
            }else if(c == '(') {
                st3.push(c);
            }else if (c == ')') {
                while (!st3.isEmpty() && st3.peek() != '(')
                    output_exp.append(st3.pop());
                st3.pop();
            }else{
                while (!st3.isEmpty() && Precedence(c) <= Precedence(st3.peek())){
                    output_exp.append(st3.pop());
                }
                st3.push(c);
            }
        }
        while (!st3.isEmpty()){
            if(st3.peek() == '(')
                System.out.println("Invalid Expression");
            output_exp.append(st3.pop());
        }
        System.out.println("The postfix expression is: " + output_exp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Infix Expression:");
        String str = scan.nextLine();
        InfixToPostfix(str);
    }
}
