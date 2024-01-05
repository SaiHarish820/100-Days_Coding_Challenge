import java.util.ArrayList;
import java.util.List;

// TC : O(n*nr) & SC : O(n + nr)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1);
            result.add(currentRow);
        }

        return result;
    }
}


// New code 

class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> outer = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            List<Integer> inner = new ArrayList<>();
            for(int j = 0 ; j < i + 1 ; j++){
                inner.add(1);
            }
            outer.add(inner);
        }

        for(int i = 2 ; i < n ; i++){
            for(int j = 1 ; j < i ; j++){
                outer.get(i).set(j , outer.get(i-1).get(j-1) + outer.get(i-1).get(j));
            }
        }
        return outer;
        
    }
}
