public class Fibonacci {

    public static void main(String[] args) {
        int num = 100;

        int a = 0, b = 1, c;
        boolean fibo = false;

        while (a <= num) {
            System.out.print(a + " ");
            if (a == num) {
                fibo = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (fibo) {
            System.out.println("\n" + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\n" + num + " não pertence à sequência de Fibonacci.");
        }

    }

}
