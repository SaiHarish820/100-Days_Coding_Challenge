class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int  mx = Integer.MIN_VALUE;
        for(int i= 0 ; i<nums.length ;i++){
            cs+=nums[i];
            mx = Math.max(mx,cs);
            cs = Math.max(cs ,0);
        }
            return mx;
    }
}