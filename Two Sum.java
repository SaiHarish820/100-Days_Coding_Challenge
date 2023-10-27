// Brute Force Method
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        for(int i = 0 ; i < nums.length-1 ; i++ ){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                     ans[1] = j;
                     break;
                }
            }
        }

        return ans;
    }
}



// Map approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , i);
        }
        int found = 0;
        for(int i = 0 ; i < nums.length ; i++){
            found = target - nums[i];
            if(map.containsKey(found) && map.get(found) != i){
                return new int[]{i , map.get(found)};
            }
        }

        return new int[]{};
    }
}
