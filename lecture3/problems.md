[Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/)


Solution
```c++
class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> st;
        for (auto x : nums) {
            st.emplace(x);
        }

        int mx = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (st.count(nums[i] - 1)) continue;
            int cur = 1;
            for (int j = nums[i] + 1; ; j++) {
                if (st.count(j)) cur++;
                else break;
            }

            mx = max(mx, cur);
        }

        return mx;
    }
};
```