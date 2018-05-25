# About
This is a comparison of the most common implementations of arbitrary-precision arythmetic in different programming languages.  
Big integers are used to compute fibonacci numbers using exponentiation by squaring approach applied to a fixed 2x2 matrix

# Usage
1) Install g++, Java compiler, Python2 and Python 3 interpreters, and GMP (`libgmp-dev` on Debian)
1) Run ./test  
On author's machine, the results are as follows:  
```
C++:        0.05  
Java:       3.19  
Python 2:   1.13  
Python 3:   1.02
```

# Conclusion
GMP is by far the fastest implementation  
Java's BigInteger is exceptionally slow, even compared to interpreted Python
