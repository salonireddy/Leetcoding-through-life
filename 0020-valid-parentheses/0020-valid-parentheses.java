class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            else if(ch==')' || ch=='}' || ch==']'){
                if(st.empty()) return false;
                char curr = st.peek();
                if((ch==')' && curr != '(') || (ch==']' && curr != '[') || (ch=='}' && curr != '{'))
                    return false;
                else
                    st.pop();
            }
        }
        if(!st.empty()) return false;
        return true;
    }
}