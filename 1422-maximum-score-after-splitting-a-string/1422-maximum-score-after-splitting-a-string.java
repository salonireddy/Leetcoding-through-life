class Solution {
    public int maxScore(String s) {
        int leftScore=0, rightScore=0;
        int maxScore=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                rightScore++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                leftScore++;
            }
            else if(s.charAt(i)=='1'){
                rightScore--;
            }
            maxScore = Math.max(maxScore, rightScore+leftScore);
        }
        return maxScore;
    }
}