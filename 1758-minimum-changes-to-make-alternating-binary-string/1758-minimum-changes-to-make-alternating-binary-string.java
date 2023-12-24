class Solution {
    public int minOperations(String s) {
        int n = s.length();
        String s1 = "", s0="";
        int score1=0, score0=0;
        for(int i=0;i<n/2;i++){
            s1=s1+"1";
            s1=s1+"0";
            s0=s0+"0";
            s0=s0+"1";
        }
        if(n%2!=0){
            s1+="1";
            s0+="0";
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s1.charAt(i)){
                score1++;
            }
            if(s.charAt(i)!=s0.charAt(i)){
                score0++;
            }
        }
        return Math.min(score0, score1);
    }
}