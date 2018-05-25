import sys


def fibonacci(n):
    fib = (0, 1)
    p = ((0, 1), (1, 1))
    while n > 0:
        if n % 2 == 1:
            fib = (
                fib[0] * p[0][0] + fib[1] * p[1][0],
                fib[0] * p[0][1] + fib[1] * p[1][1],
            )
        p = (
            (
                p[0][0] * p[0][0] + p[0][1] * p[1][0],
                p[0][0] * p[0][1] + p[0][1] * p[1][1],
            ), (
                p[1][0] * p[0][0] + p[1][1] * p[1][0],
                p[1][0] * p[0][1] + p[1][1] * p[1][1],
            ),
        )
        n //= 2
    return fib[0]


def main():
    print(fibonacci(int(sys.argv[1])))


if __name__ == '__main__':
    main()
