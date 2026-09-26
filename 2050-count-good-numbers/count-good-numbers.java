class Solution {

    static final long MOD = 1000000007;

    long power(long x, long y) {
        if (y == 0) {
            return 1;
        }

        long ans = power(x, y / 2);

        ans = (ans * ans) % MOD;

        if (y % 2 == 1) {
            ans = (ans * x) % MOD;
        }

        return ans;
    }
    public int countGoodNumbers(long n) {
        
        long odd = n / 2;
        long even = n - odd;

        return (int)((power(5, even) * power(4, odd)) % MOD);
    }
}