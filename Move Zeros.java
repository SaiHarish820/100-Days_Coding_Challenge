class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        for(int j = 0 ; j < n ; j++){
        for(int i = 0 ; i < n - 1 ; i++){
            int temp = 0;
            if(nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        }
    }
}
