class Solution {
    public int countHomogenous(String s) {
        int left = 0;
        long res = 0;
        
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(left) == s.charAt(right)) {
                res += right - left + 1;
            } else {
                res += 1;
                left = right;
            }
        }

        return (int) (res % (1000000007));       
    }
}


// Approach Two

class Solution {
    public int countHomogenous(String s) {
        int res = 0, track = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                track++;
            } else {
                track++;
                while (track > 0) {
                    res = (int) ((res + track) % (1000000007));
                    track--;
                }
            }
        }

        // Handle the last character(s) if needed
        track++;
        while (track > 0) {
            res = (int) ((res + track) % (1000000007));
            track--;
        }

        return res;
    }
}
