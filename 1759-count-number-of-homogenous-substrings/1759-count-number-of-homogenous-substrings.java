class Solution {
    final int MOD = 1000000007;
    public int countHomogenous(String s) {
        int ans = 0;
        int curr = 0;
            
        for (int i = 0; i<s.length(); i++) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else{
                curr = 1;
            }
            ans = (ans+curr)% MOD;
        }
        return ans;
    }
}