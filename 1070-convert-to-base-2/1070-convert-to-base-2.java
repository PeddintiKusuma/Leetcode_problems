class Solution {
    public String baseNeg2(int n) {
        StringBuilder sb=new StringBuilder();
        if(n==0){
            return "0";
        }

        while(n!=0){
            int rem=n%-2; 
            n=n/-2;
            if(rem<0){
                rem+=2;
                n+=1;
            }
            sb.append(rem);
        }
 return sb.reverse().toString();
    }
}