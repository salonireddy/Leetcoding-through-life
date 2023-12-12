class Solution {
    public int maxProduct(int[] nums) {
        int big1 = Integer.MIN_VALUE, big2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>big1){
                big2 = big1;
                big1 = nums[i];
            }
            else if(nums[i] > big2 && nums[i]<=big1){
                big2 = nums[i];
            }
        }
        return (big1-1) * (big2-1);
    }
}