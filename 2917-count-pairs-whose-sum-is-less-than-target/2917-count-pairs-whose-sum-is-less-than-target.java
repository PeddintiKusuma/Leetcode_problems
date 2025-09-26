class Solution {
    public int countPairs(List<Integer> nums, int target) {
       int count=0;
       int n=nums.size();
       int[] ele= new int[n];
       for(int i=0;i<n;i++){
        ele[i]=nums.get(i);
       }

       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(ele[i]+ele[j]<target){
                count++;
            }
        }
       }

          return count;
    }
}