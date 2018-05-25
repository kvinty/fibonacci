import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fibonacci(long n) {
        BigInteger[] fib = new BigInteger[] {
            BigInteger.valueOf(0),
            BigInteger.valueOf(1),
        };
        BigInteger[][] p = new BigInteger[][] {
            {BigInteger.valueOf(0), BigInteger.valueOf(1)},
            {BigInteger.valueOf(1), BigInteger.valueOf(1)},
        };
        while (n > 0) {
            if (n % 2 == 1) {
                fib = new BigInteger[] {
                    fib[0].multiply(p[0][0]).add(fib[1].multiply(p[1][0])),
                    fib[0].multiply(p[0][1]).add(fib[1].multiply(p[1][1])),
                };
            }
            p = new BigInteger[][] {
                {
                    p[0][0].multiply(p[0][0]).add(p[0][1].multiply(p[1][0])),
                    p[0][0].multiply(p[0][1]).add(p[0][1].multiply(p[1][1])),
                }, {
                    p[1][0].multiply(p[0][0]).add(p[1][1].multiply(p[1][0])),
                    p[1][0].multiply(p[0][1]).add(p[1][1].multiply(p[1][1])),
                },
            };
            n /= 2;
        }
        return fib[0];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(Long.parseLong(args[0])));
    }
}
