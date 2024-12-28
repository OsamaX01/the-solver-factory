class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        cur_greater_element = nums[-1]
        cur_smaller_element = nums[0]
        is_there_greater_element_right_me = [False] * len(nums)
        is_there_smaller_element_left_me = [False] * len(nums)

        for i in range(len(nums) - 1, -1, -1):
            if cur_greater_element > nums[i]:
                is_there_greater_element_right_me[i] = True
            cur_greater_element = max(cur_greater_element, nums[i])

        for i in range(len(nums)):
            if cur_smaller_element < nums[i]:
                is_there_smaller_element_left_me[i] = True
            cur_smaller_element = min(cur_smaller_element, nums[i])

        for i in range(len(nums)):
            if is_there_smaller_element_left_me[i] and is_there_greater_element_right_me[i]:
                return True

        return False