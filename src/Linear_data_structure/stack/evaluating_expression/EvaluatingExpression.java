package Linear_data_structure.stack.evaluating_expression;

import java.util.LinkedList;

public class EvaluatingExpression {
    public static void main(String[] args) {
        new EvaluatingExpression().run();
    }

    public void run() {
        String  formula = "2+6/3";
        System.out.println(evaluate(formula));
    }

    public double evaluate(String formula) {
        formula += "$";
        LinkedList<Double> num_list = new LinkedList<>();
        LinkedList<Character> oprt_list = new LinkedList<>();
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == ' ') {
                continue;
            }
            else if (formula.charAt(i) == '$') {
                while (!oprt_list.isEmpty()) {
                    num_list.add(calculate(num_list.removeLast(), num_list.removeLast(), oprt_list.removeLast()));
                }
            }
            else if (Character.isDigit(formula.charAt(i))) {
                num_list.add(Double.parseDouble(formula.charAt(i) + ""));
            }
            else {
                if (oprt_list.isEmpty() || priority(formula.charAt(i)) > priority(oprt_list.getLast())) {
                    oprt_list.add(formula.charAt(i));
                }
                else {
                    num_list.add(calculate(num_list.removeLast(), num_list.removeLast(), oprt_list.removeLast()));
                    oprt_list.add(formula.charAt(i));
                }
            }
        }


        return num_list.getLast();
    }

    public int priority (char ch) {
        if (ch == '*' || ch == '/') {
            return 2;
        }
        else if (ch == '-' || ch == '+') {
            return 1;
        }
        return 0;
    }

    public double calculate(double v2, double v1, char oprt) {
        double result = 0;
        switch (oprt)
        {
            case '+':
                result = v1 + v2;
                break;

            case '-':
                result = v1 - v2;
                break;

            case '*':
                result = v1 * v2;
                break;

            case '/':
                result = v1 / v2;
                break;
        }
        return result;
    }


}
