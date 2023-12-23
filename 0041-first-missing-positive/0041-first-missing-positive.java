class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int low_pos = 1;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] < low_pos){
                continue;
            }
            else if(nums[i] == low_pos){
                low_pos++;
            }
            else{
                return low_pos;
            }
        }
        return low_pos;
    }
}