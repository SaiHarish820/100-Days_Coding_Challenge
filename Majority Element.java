class Solution {
    public int majorityElement(int[] nums) {
        // TC : O(n^2) & SC : O(1)
        int n = nums.length;
        int curr , max = Integer.MIN_VALUE , gm = 0;
        if(n == 1) {
            return nums[0];
        }
        else{
        for(int i = 0 ; i < n - 1 ; i++){
                curr = 1;
            for(int j = 1 ; j < n ; j++){
                if(nums[i] == nums[j]){
                    curr++;
                }
                if(curr > max){
                    max = curr;
                    gm = nums[i];
                }
            }
        }
        }
        return gm;
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0 , count = 0 ;

        // Moore Voting Algorithm
        // TC : O(n) & SC : O(1)
        for(int i = 0 ; i < nums.length ; i++){
            if(count == 0){
                ele = nums[i];
            }

            if(ele == nums[i]) count++;
            else count--;
        }
        return ele;
    }
}
