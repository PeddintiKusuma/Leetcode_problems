class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(res.containsKey(diff)){
                return new int[] {i,res.get(diff)};
            }
            res.put(nums[i],i);
        }
        return null;
    }
}