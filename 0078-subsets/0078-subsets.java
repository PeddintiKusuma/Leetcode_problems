
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      backtrack(0,nums,new ArrayList<>(),ans);
      return ans;  
    }
    private void backtrack(int start,int[] nums,List<Integer> c, List<List<Integer>> ans){
        //add empty set also to ans
        //append-recurse-del
        ans.add(new ArrayList<>(c));
        //explore
        for(int i=start;i<nums.length;i++){
            c.add(nums[i]);
            backtrack(i+1,nums,c,ans);
            c.remove(c.size()-1);
        }
    }

}