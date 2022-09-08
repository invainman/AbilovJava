package fourthtask;

import java.util.EmptyStackException;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        char[] array = new char[]{'[', '(', '(', '(', ')', ')', '(', ')', '(', '(', ')', ')', ']', ']'};
        isSequenceCorrect(array);
    }

    public static void isSequenceCorrect(char[] array) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '[' || array[i] == '(') {
                stack.push(array[i]);
                continue;
            }
            try {
                if ((array[i] == ']' && stack.peek() == '[') || (array[i] == ')' && stack.peek() == '(')) {
                    stack.pop();
                } else {
                    char rightSymbol = stack.peek() == '(' ? ')' : ']';
                    System.out.println("Последовательность неверная, нужна " + rightSymbol + " скобка по индексу " + i);
                    return;
                }
            } catch (EmptyStackException emptyStackException) {
                System.out.println("Последовательность неверная, в конце лишние закрывающие скобки, начиная с " + i + "скобки и дальше");
                return;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Последовательность верная");
            return;
        }


        StringBuilder str = new StringBuilder();

        while (!stack.isEmpty()) {
            str.append(stack.pop() == '(' ? ')' : ']');
        }
        System.out.println("Последовательность неверная, не хватает " + str);
    }
}
