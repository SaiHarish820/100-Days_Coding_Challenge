class Solution {
    public int findDuplicate(int[] nums) {
         Tc  O(n) & SC  O(n)
        Arrays.sort(nums);
        int ans = 0;

        for(int i = 0 ; i  nums.length - 1 ; i++){
            if(nums[i] == nums[i+1]){
                ans = nums[i];
                break;
            }
        }
        return ans;



        int hash[] = new int[9];
        int incr = 0;

        for(int i = 0 ; i  nums.length ; i++){
             hash[nums[i]] = incr + 1;
             incr = 0;
        }
    }
}