class Solution {
    public int maxProduct(int[] nums) {
        // Brute Force 
        // TC : O(n*n) &* SC : O(1)
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j < n ; j++){
                if((nums[i]-1) * (nums[j]-1) > max ){
                    max = (nums[i]-1) * (nums[j]-1);
                }
            }
        }
        return max;   
    }
}