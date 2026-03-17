from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n = len(nums)
        freq = {}

        for x in nums:
            freq[x] = freq.get(x, 0) + 1
            if freq[x] > n // 2:
                return x

        return -1
