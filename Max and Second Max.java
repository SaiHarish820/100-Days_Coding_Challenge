// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        
	// TC : O(2n) & SC : O(1) 
        
        // For First Max Number
        ArrayList<Integer> ans = new ArrayList<>(2);
        int firstmax = Integer.MIN_VALUE;
        
        
        for(int i = 0 ; i < sizeOfArray ; i++){
            if(arr[i] > firstmax)  firstmax = arr[i];
        }
        
        int secondmax = Integer.MIN_VALUE;
        
        
        for(int j = 0 ; j < sizeOfArray ; j++){
            
            if(arr[j] < firstmax && arr[j] > secondmax) secondmax = arr[j];
        }
        
        if(secondmax == Integer.MIN_VALUE) secondmax = -1;
        
        ans.add(firstmax);
        ans.add(secondmax);
        
        return ans;
        
        
        
    }
}