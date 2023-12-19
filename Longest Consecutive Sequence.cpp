class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        if(nums.size() == 0) return 0;

        sort(nums.begin(),nums.end());

        int  longest = 1 , lastsmallest = INT_MIN , currcount = 0;


        for(int i = 0 ; i < n ; i++){
            if(nums[i] - 1 == lastsmallest){
                currcount++;
                lastsmallest = nums[i];
            }
            else if(lastsmallest!=nums[i]){
                currcount = 1;
                lastsmallest = nums[i];
            }

            longest = max(longest,currcount);
        }
        return longest;
        
    }
};
