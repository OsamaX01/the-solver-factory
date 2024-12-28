# Time Complexity Guide

## Intro:
- We mentioned that on average between processes, CPUs can do \(10^8\) (100 million) operations per second.
- We talked about Big O notation and possible complexities, such as:
  - \(O(1)\) - constant
  - \(O(\log n)\)
  - \(O(\sqrt{n})\)
  - \(O(n)\) - linear
  - \(O(n^2)\), \(O(n^3)\) - quadratic, cubic
  - \(O(2^n)\) - exponential
  - \(O(n!)\) - factorial
- We discussed some examples of codes to get their complexities, and we discussed some codes with nested complexities like \(O(n \log n^2)\).
- We mentioned constant factors and that we don’t have to worry about them; we just need to be aware of them.

---

## Code Examples for Time Complexity

```cpp
#include "bits/stdc++.h"
using namespace std;
typedef long long ll;
 
int main(){
    // O(1)
    int a = 5;
    int b = 7;
    int c = 4;
    int d = a + b + c + 153;
    cout << a << ' ' << b << ' ' << c << ' ' << d << '\n';
 
    int i = 0, n = 100, m = 100;
 
    // O(n)
    for (int i = 1; i <= n; i++) {
        // constant time code here
        cout << a + b << '\n'; // O(1)
    }
 
    while (i < n) {
        // constant time code here
        i++;
    }
 
    // O(n)
    for (int i = 1; i <= 5 * n + 17; i++) {
        // constant time code here
    }
 
    // O(max(n, 457737))
    for (int i = 1; i <= n + 457737; i++) {
        // constant time code here
    }
 
    // O(n * m) 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            // constant time code here
        }
    }
 
    // O(log2(n))
    for (int i = 1; i < n; i *= 2) {
        // constant time code here
    }
 
    // o(nlogn)
    for (int i = 0; i < n; i++) {
        for (int j = 1; j < n; j *= 2) {
            // constant time code here
        }
    }
 
    // O(n * log2(n) * log2(n)) 
    for (int i = 0; i < n; i++) {
        for (int j = 1; j < n; j *= 2) {
            for (int k = n; k > 0; k /= 2) {
                // constant time code here
            }
        }
    }
 
    // O(n * (n +1) / 2) = O(n * n)
    for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
            // constant time code here
        }
    }
 
    // O(N * N + M)
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            // constant time code here
        }
    }
    for (int i = 1; i <= m; i++) {
        // more constant time code here
    }
 
    // O(sqrt(n))
    for (int i = 0; i * i <= n; i++) {
        // constant time code here
    }
 
    n = 10;
 
    // O(2 ^ n)
    for (int i = 0; i < pow(2, n); i++) {
        // constant time code here
    }
 
    // 
    int limit = 1;
    for (int i = 1; i <= n; i++) {
        limit *= i;
    }
    for(int i = 0; i < limit; i++) {
        // constant time code here
    }
}
```

## Extra Respurces
[Video](https://www.youtube.com/watch?v=zUUkiEllHG0)
[Book 1](https://usaco.guide/CPH.pdf#page=27)
[Book 2](https://darrenyao.com/usacobook/cpp.pdf#page=12)

