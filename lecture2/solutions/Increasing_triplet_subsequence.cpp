class Solution {
public:
    bool increasingTriplet(vector<int> &nums) {
        int maxElemnt = nums[nums.size() - 1]; // O(n)
        vector<int> isThereGreaterElemntOnRight(nums.size(), false);
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums[i] < maxElemnt) {
                isThereGreaterElemntOnRight[i] = true;
            }
            maxElemnt = max(maxElemnt, nums[i]);
        }

        int mnElement = nums[0];
        vector<int> isThereSmallerElemntOnLeft(nums.size(), false);
        for (int i = 0; i < nums.size(); i++) { // O(n)
            if (nums[i] > mnElement) {
                isThereSmallerElemntOnLeft[i] = true;
            }
            mnElement = min(mnElement, nums[i]);
        }

        for (int i = 0; i < nums.size(); i++) { // O(n)
            if (isThereGreaterElemntOnRight[i] && isThereSmallerElemntOnLeft[i]) {
                return true;
            }
        }

        return false;
    }
};