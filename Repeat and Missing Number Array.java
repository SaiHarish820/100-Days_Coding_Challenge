import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY


	// TC : O(2n) & SC : O(n)
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>(2);
        int repeated = -1;
        int missing = -1;
        int n = A.size();

        // Using HashSet to track unique elements
        Set<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int current = A.get(i);

            // Check for the repeated element
            if (!uniqueSet.add(current)) {
                repeated = current;
            }
        }

        // Find the missing element
        for (int i = 1; i <= n; i++) {
            if (!uniqueSet.contains(i)) {
                missing = i;
                break;
            }
        }

        ans.add(repeated);
        ans.add(missing);

        return ans;
    }
}
