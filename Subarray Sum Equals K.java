// Brute Force 

class Solution {  // TC : O(N^3)
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int target = k, count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){  // Fix: Change condition to j < n
                int sum = 0;
                for(int a = i ; a <= j ; a++){  // Fix: Change starting index to i + 1
                    sum += nums[a];
                }
                if(sum == target ) count++;
            }
        }
        return count;
    }
}


// Better Approach

class Solution {  // TC : O(N^2)
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int target = k, count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == target) count++;
            }
        }
        return count;
    }
}
