class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;

         while(i<j && j>=0 && i<s.length){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
           i++;
          j--;
         }
         
    }
}