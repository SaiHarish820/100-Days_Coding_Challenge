class Solution {
    // TC : O(n)  & SC : O(1)
    
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count+=1;
            }
            else
            {
                count=0;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
}
