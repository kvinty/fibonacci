#include <array>
#include <cstdio>

#include <gmpxx.h>

mpz_class fibonacci(long n) {
    std::array<mpz_class, 2> fib = {0, 1};
    std::array<std::array<mpz_class, 2>, 2> p = {{{0, 1}, {1, 1}}};
    while (n > 0) {
        if (n % 2 == 1) {
            fib = {{
                fib[0] * p[0][0] + fib[1] * p[1][0],
                fib[0] * p[0][1] + fib[1] * p[1][1],
            }};
        }
        p = {{
            {
                p[0][0] * p[0][0] + p[0][1] * p[1][0],
                p[0][0] * p[0][1] + p[0][1] * p[1][1],
            }, {
                p[1][0] * p[0][0] + p[1][1] * p[1][0],
                p[1][0] * p[0][1] + p[1][1] * p[1][1],
            },
        }};
        n /= 2;
    }
    return fib[0];
}

int main(int, char *argv[]) {
    puts(fibonacci(strtol(argv[1], nullptr, 10)).get_str().c_str());
    return 0;
}
