package recursion.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        new Fibonacci().run();
    }

    public void run() {
        System.out.println(fib(6));
    }

    public int fib(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        else if (i > 2) {
            return fib(i - 1) + fib(i - 2);
        }
        return 0;
    }
}
