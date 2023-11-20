class Solution {
    public int reverse(int x) {

        int h= -2147483648;
        int k=2147483647;
        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (reversed > k || reversed< h)  return 0;
        else return (int)reversed;

        
    }
}