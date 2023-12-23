class Solution {
    public int searchInsert(int[] nums, int target) {
        //O(n) time
    /*  for(int i=0;i<nums.length;i++){
        if(nums[i]>=target) return i;
        }
        return nums.length;
    */
        //O(logn) time
        int start=0;
        int end = nums.length-1;
        int mid =0;
        while(start<=end){
            mid = (end+start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}