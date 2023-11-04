class Solution {
    public void nextPermutation(int[] nums) {

        int index1 = -1;
        int index2 = -1;
        int n = nums.length;

        // Find the break point
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                index1 = i;
                break;
            }
        }

        // Condition without break point

        if(index1 == -1){
            reverse(nums,0);
        }
        
        else{
        // Find the next greater element 
        for(int i = n-1 ; i>=index1 ; i--){
            if(nums[i] > nums[index1]){
                index2 = i;
                break;
            }
        }
        swap(nums,index1,index2);
        // Reverse the rest sub array
        reverse(nums,index1 + 1);
        }
    }

    void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;

        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}