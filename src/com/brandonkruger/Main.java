/* Date created: 2021/11/22 @18:07
 * Stack = LIFO data structure.
 * Last-In First-Out.
 * Stores objects like a pile of books.
 */
 package com.brandonkruger;

import java.util.Stack;
public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack <String>();

        //System.out.println(stack.empty());

        stack.push("Apple"); //Bottom of stack.
        stack.push("Microsoft");
        stack.push("Alphabet Inc");
        stack.push("Amazon Inc");
        stack.push("Facebook");
        stack.push("TSMC");
        stack.push("Tencent"); //Top of stack.

        //String wealthiestCompany = stack.pop();
        //System.out.println(stack.peek());
        //System.out.println(stack.search("Tesla"));
        System.out.println(stack);

        // Where can stacks be implemented?
        // 1. Undo/redo features in text editors.
        // 2. Moving backward/forward through browser history.
        // 3. Backtracking algorithms (maze, file directories).
        // 4. Calling functions (call stack)

    }
}
