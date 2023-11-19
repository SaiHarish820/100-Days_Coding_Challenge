class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
// Brute Force Method TC : O(n1*n2) & SC : O(n1)
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] ans = new int[n1];
         for(int i = 0 ; i < n1 ; i++){
             boolean found = false; 
             for(int j = 0 ; j < n2 ; j++){
                 if(nums1[i] == nums2[j])   found = true;
                 if(found && nums2[j] > nums1[i]) {  ans[i] = nums2[j];  break; }
                 else   ans[i] = -1;
             }
         }
         return ans;
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Optimal Solution TC : O(n2) & SC : O(n1+n2)
        Map<Integer, Integer> map = new HashMap<>(); // map for next greater element
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.empty() && stack.peek() < num) { // Pop elements from stack and update map with next greater element
                map.put(stack.pop(), num);
            }
            stack.push(num); // Push current element onto stack
        }
        for (int i = 0; i < nums1.length; i++) { // Check if each element in nums1 has a next greater element in map
            nums1[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1; // Update element in nums1 with next greater element or -1
        }
        return nums1;
    }
}
