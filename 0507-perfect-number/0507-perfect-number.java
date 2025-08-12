class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> res=new ArrayList<>();
int div;
        for(int i=1;i<num;i++){
            if(num%i==0){
                res.add(i);
            }

        }
        int sum=0;
        for(int i=0;i<res.size();i++){
            sum=sum+res.get(i);

        }
        if(sum!=num){
            return false;
        }
        return true;
    }
}