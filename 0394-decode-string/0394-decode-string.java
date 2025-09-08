class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=']') st.push(ch);
            else{
                StringBuilder sb= new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sb.insert(0,st.pop());

                }
                st.pop();
                StringBuilder numString=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    numString.insert(0,st.pop());
                }
                int n=Integer.parseInt(numString.toString());
                String ans=sb.toString().repeat(n);

                for(char c: ans.toCharArray()) st.push(c);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.insert(0,st.pop());
        }
        return res.toString();
    }
}