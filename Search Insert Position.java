// TC : O(n)  & SC : O(1)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] >= target){
                    ans = i;
                    break;
            } 
        }

        if( ans == 0 && target > nums[nums.length-1]) 
         ans = nums.length;
         else if(ans == 0 && target == 0)
         ans = 0;
        return ans;
        
    }
}