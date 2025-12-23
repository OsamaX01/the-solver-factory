Read Each part and guess the time complexity. 

Answes included at the bottom. 

```c++
int main(){
    // Part 1
    int a = 5;
    int b = 7;
    int c = 4;
    int d = a + b + c + 153;
    cout << a << ' ' << b << ' ' << c << ' ' << d << '\n';
 
    int i = 0, n = 100, m = 100;
 
    // Part 2
    for (int i = 1; i <= n; i++) {
        // constant time code here
        cout << a + b << '\n'; // O(1)
    }
 
    while (i < n) {
        // constant time code here
        i++;
    }

    // Part 3
    for (int i = 1; i <= 5 * n + 17; i++) {
        // constant time code here
    }
 
    // Part 4
    for (int i = 1; i <= n + 457737; i++) {
        // constant time code here
    }
 
    // Part 5
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            // constant time code here
        }
    }
 
    // Part 6
    for (int i = 1; i < n; i *= 2) {
        // constant time code here
    }
 
    // Part 7
    for (int i = 0; i < n; i++) {
        for (int j = 1; j < n; j *= 2) {
            // constant time code here
        }
    }
 
    // Part 8
    for (int i = 0; i < n; i++) {
        for (int j = 1; j < n; j *= 2) {
            for (int k = n; k > 0; k /= 2) {
                // constant time code here
            }
        }
    }
 
    // Part 9
    for (int i = 1; i <= n; i++) {
        for (int j = i; j <= n; j++) {
            // constant time code here
        }
    }
 
    // Part 10
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            // constant time code here
        }
    }
    for (int i = 1; i <= m; i++) {
        // more constant time code here
    }
 
    // Part 11
    for (int i = 0; i * i <= n; i++) {
        // constant time code here
    }
 
    // part 12
    for (int i = 0; i < pow(2, n); i++) {
        // constant time code here
    }
 
    /* Answers
      Part1: O(1)
    Part2: O(n)
    Part3: O(n)
    Part4: O(max(n, 457737))
    Part5: O(n * m)
    Part6: O(log2(n))
    Part7: o(n*logn)
    Part8: O(n * log2(n) * log2(n))
    Part9: O(n * (n +1) / 2) = O(n * n)
    Part10: O(N * N + M)
    Part11: O(sqrt(n))
    Part12: O(2 ^ n)
    */
}

```
