class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max2 = max;
                max = nums[i];
            }
            else if(nums[i]>max2){
                max2 = nums[i];
            }
            if(nums[i]<min){
                min2 = min;
                min = nums[i];
            }
            else if(nums[i]<min2){
                min2 = nums[i];
            }
        }
        return (max*max2) - (min*min2);
    }
}