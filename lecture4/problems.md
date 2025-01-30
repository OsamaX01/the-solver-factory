[Top K](https://leetcode.com/problems/top-k-frequent-elements/)
```c++
class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int, int> frequency;
        for (int x : nums) {
            if (frequency.find(x) == frequency.end()) { // x doesn't exist in the map, frequency.count(x) also works
                frequency[x] = 0;
            }
            frequency[x] = frequency[x] + 1;
        }

        vector<pair<int, int>> frequencyPair;
        for (auto [key, value] : frequency) { // sorted by key because using map.
            frequencyPair.emplace_back(value, key);
        }

        sort(frequencyPair.rbegin(), frequencyPair.rend()); // decreasingly
        // reverse(frequencyPair.begin(), frequencyPair.end());
        // assert(k <= frequencyPair.size());
        vector<int> ret;
        for (int i = 0; i < k && i < (int)frequencyPair.size(); ++i) {
            ret.push_back(frequencyPair[i].second);
        }
        return ret;
    }
};
```


[Two Sum](https://leetcode.com/problems/two-sum)
```c++
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> valueIndex;
        for (int i = 0; i < (int)nums.size(); ++i) {
            const int need = target - nums[i];
            if (valueIndex.find(need) != valueIndex.end()) {
                return vector<int> {valueIndex[need], i};
            }
            valueIndex[nums[i]] = i;
        }
        assert(false);
    }
};
```

[Find the Difference](https://leetcode.com/problems/find-the-difference-of-two-arrays)

```c++
class Solution {

    vector<int> findDiff(const vector<int> &a, const vector<int> &b) {
        unordered_set<int> st_a(a.begin(), a.end()), st_b(b.begin(), b.end());
        
        vector<int> ret;
        for (int x : st_a) {
            if (!st_b.count(x)) {
                ret.push_back(x);
            }
        }
        
        return ret;
    }

public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        return vector<vector<int>> {findDiff(nums1, nums2), findDiff(nums2, nums1)};
    }
};
```