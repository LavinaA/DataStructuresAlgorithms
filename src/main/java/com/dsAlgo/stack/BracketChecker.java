package com.dsAlgo.stack;

import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        String expr = "([{}]";
        boolean b = isBalancedExpression(expr);
        if (b == true) {
            System.out.println("The expresion is Balanced");
        } else if (b == false) {
            System.out.println("the expression is not balanced");
        }

    }

    private static boolean isBalancedExpression(String expr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("invalid");
                    return false;
                } else {

                    char ch1 = stack.pop();
                    switch (ch) {
                        case ')':
                            if (ch1 != '(') {
                                System.out.println("invalid");
                                return false;
                            }
                            break;
                        case ']':
                            if (ch1 != '[') {
                                return false;
                            }
                            break;
                        case '}':
                            if (ch1 != '{') {
                                return false;
                            }
                            break;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("invalid");
            return false;
        }
        return true;
    }
}
