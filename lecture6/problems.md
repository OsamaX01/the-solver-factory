[Guess Number](https://leetcode.com/problems/guess-number-higher-or-lower/description/)
```c++
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
    int check(int mid) {
        return guess(mid) <= 0;
    }
public:
    int guessNumber(int n) {
        int l = 1, r = n, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(mid)) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        assert(ans != -1);
        return ans;
    }
};
```


[Koko](https://leetcode.com/problems/koko-eating-bananas/)
```c++
class Solution {
    bool check(const vector<int> &a, const int k, const int h) { // pure function
        long long need = 0;
        for (int x : a) {
            need += (x + k - 1) / k;
            // need += x / k + (x % k != 0);
            if (need > h) return false;
        }
        return true;
    }
public:
    int minEatingSpeed(vector<int>& a, int h) {
        int l = 1, r = *max_element(a.begin(), a.end());
        int ans = r;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(a, mid, h)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
};
```
