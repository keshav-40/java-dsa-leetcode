// LeetCode 7: Reverse Integer
// Topic: Math
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int reverse(int n) {
        long revNum = 0;
        boolean isNegative = n < 0;

        n = Math.abs(n);

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }

    if(isNegative == true ){
        revNum= -revNum;
    }

        return (int) revNum;
    }
}

