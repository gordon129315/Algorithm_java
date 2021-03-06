package Linear_data_structure.stack.parentheses_matching;

import java.util.LinkedList;

public class Parentheses {
    public static void main(String[] args) {
        new Parentheses().run();
    }

    public void run() {
        String str = "{}[]()";
        System.out.println(isValid(str));
    }

    public boolean isValid(String formula){
        if (formula == null) {
            return false;
        }

        if (formula.equals("")) {
            return true;
        }
        LinkedList<Character> list = new LinkedList<>();
        char ch = ' ';
        for (int i = 0; i < formula.length(); i++) {
            ch = formula.charAt(i);
            switch (ch) {
                case '(':
                    list.add(')');
                    break;
                case '{':
                    list.add('}');
                    break;
                case '[':
                    list.add(']');
                    break;
                default:
                    if (list.isEmpty()) {
                        return false;
                    }
                    else if (list.getLast() == ch) {
                        list.removeLast();
                    }
                    else if (list.getLast() != ch) {
                        return false;
                    }
                    break;
            }
        }
        return list.isEmpty();
    }
}
