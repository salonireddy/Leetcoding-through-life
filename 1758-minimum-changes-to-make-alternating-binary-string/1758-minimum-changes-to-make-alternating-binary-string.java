class Solution {
    public int minOperations(String s) {
        int n = s.length();
        String s1 = "", s0="";
        int score1=0, score0=0;
        
        for(int i=0;i<n;i++){
            if(i%2==0){ //location is even
                if(s.charAt(i)=='0'){
                    score1++; //string starts with 1, even pos should have 1
                }else{
                    score0++; //string starts with 0, even pos should have 0
                }
            }
            else{
                if(s.charAt(i)=='0'){
                    score0++; //string starts with 1, odd pos should have 0
                }else{
                    score1++; //string starts with 0, odd pos should have 1
                }
            }
        }
        return Math.min(score0, score1);
    }
}