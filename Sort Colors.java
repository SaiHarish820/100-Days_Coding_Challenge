class Solution {
    public void sortColors(int[] nums) {
	// TC : O(2n) & SC : O(1)
        int red = 0, white = 0 ,blue = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                red++;
            }
            else if(nums[i] == 1){
                white++;
            }
            else if(nums[i] == 2){
                blue++;
            }
        }

        for(int i = 0 ; i < red ; i++) nums[i] = 0;

        for(int j = red ; j < red + white ; j++) nums[j] = 1;

        for(int k = red + white ; k < nums.length ; k++) nums[k] = 2;

        
    }
}