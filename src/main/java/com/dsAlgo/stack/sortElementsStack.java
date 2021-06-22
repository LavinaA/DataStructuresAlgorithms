package com.dsAlgo.stack;

import java.util.Stack;
/*Algorithm:
While the input stack is not empty pop the element and push in temp stack if the popped element is greater than element
in tmp stack.If popped element is smaller than element in tmp stack than pop the elements from tmp stack till temp stack is empty
or till element greater than popped elements exist in temp stack.The temp stack will have sorted elements.
 */

public class sortElementsStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.push(10);
        input.push(20);
        input.push(30);
        input.push(50);
        input.push(40);
        input.push(35);
        input.push(70);
        Stack<Integer> res = sortElementsStack(input);

        while (!res.isEmpty()) {
            int i = res.pop();
            System.out.println(i);
        }


    }
    public static Stack<Integer> sortElementsStack(Stack<Integer> input){
        Stack<Integer> tempStack = new Stack<Integer>();

        while(!input.isEmpty()){
            int temp = input.pop();

            while (!tempStack.isEmpty() && tempStack.peek() < temp) {

                int i = tempStack.pop();
                input.push(i);

            }
            tempStack.push(temp);
        }

        return tempStack;

    }
}
