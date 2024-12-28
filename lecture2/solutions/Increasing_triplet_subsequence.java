class Solution {
    public boolean increasingTriplet(int[] nums) {
        int curGreaterElement = nums[nums.length - 1];
        int curSmallerElement = nums[0];
        boolean[] isThereGreaterElementRightMe = new boolean[nums.length];
        boolean[] isThereSmallerElementLeftMe = new boolean[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (curGreaterElement > nums[i]) {
                isThereGreaterElementRightMe[i] = true;
            }
            curGreaterElement = Math.max(curGreaterElement, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (curSmallerElement < nums[i]) {
                isThereSmallerElementLeftMe[i] = true;
            }
            curSmallerElement = Math.min(curSmallerElement, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (isThereSmallerElementLeftMe[i] && isThereGreaterElementRightMe[i]) {
                return true;
            }
        }

        return false;     
    }
}