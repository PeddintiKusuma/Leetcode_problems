class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> res=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
         }
         ArrayList<Integer> arr= new ArrayList<>(res);
         Collections.sort(arr, Collections.reverseOrder());
         if(arr.size()<3){
            return arr.get(0);
         }
         return arr.get(2);

    }
}