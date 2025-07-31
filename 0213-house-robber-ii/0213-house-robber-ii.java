class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int lootSkippingLast=0;
        int lootSkippingFirst=0;
        int[] skipLastHouse = new int[nums.length-1];
        int[] skipFirstHouse = new int[nums.length-1];

        for(int i=0;i<=nums.length-2;i++){
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
            lootSkippingLast=robHelper(skipLastHouse,nums.length-1);
            lootSkippingFirst= robHelper(skipFirstHouse, nums.length-1);

      
        }
        return Math.max(lootSkippingLast,lootSkippingFirst);
      
    }

public int robHelper(int[] nums,int n){
    
    if(n==0) return 0;
    if(n==1) return nums[0];
    int[] dp = new int[n];
    dp[0]=nums[0];
    dp[1]=Math.max(nums[0],nums[1]);
    for(int i=2;i<=n-1;i++){
        dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
    }
    return dp[n-1];
}
}