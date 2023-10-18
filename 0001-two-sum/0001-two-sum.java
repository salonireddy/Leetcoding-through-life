class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                res[0] = i;
                res[1] = mp.get(nums[i]); 
            }
            else{
                mp.put(target-nums[i],i); 
            }
        }
        return res;
    }
}