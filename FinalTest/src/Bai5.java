import java.text.DecimalFormat;
import java.util.Stack;

public class Bai5 {
    public static void main(String[] args) {
        String x = "1+2x3+4-5x7+4x4x5";
        String arrayExpression[] = x.split("");
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        int index = 0;
        while (index < arrayExpression.length) {

            String item = arrayExpression[index];
            if (priority(item) == 0) {
                stack1.push(item);
                System.out.println("stack1:" + item);
            } else {
                while ((!stack2.isEmpty()) && (priority(item) <= priority(stack2.peek()))) {
                    String top = stack2.pop();
                    String num2String = stack1.pop();
                    String num1String = stack1.pop();
                    double result = calculater(num1String, num2String, top);
                    stack1.push(result + "");
                    System.out.println("stack1:" + result);
                }
                stack2.push(item);
                System.out.println("stack2:" + item);
            }
            index++;
        }


        while (!stack2.isEmpty()) {

            String op = stack2.pop();
            String num2String = stack1.pop();
            String num1String = stack1.pop();
            double result = calculater(num1String, num2String, op);
            stack1.push(result + "");

        }
        System.out.println(stack1.pop());
    }

    public static double calculater(String num1String, String num2String, String operator) {
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    static int priority(String s) {
        if (s.equals("+") || s.equals("-")) return 1;
        if (s.equals("x") || s.equals("/")) return 2;
        return 0;

    }
}
