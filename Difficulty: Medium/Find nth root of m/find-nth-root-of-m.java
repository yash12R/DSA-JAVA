class Solution {

    long power(long x, int n) {
        long ans = 1;
        while (n-- > 0) {
            ans *= x;
        }
        return ans;
    }

    public int nthRoot(int n, int m) {

        if (m == 0) return 0;   // Edge case

        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long val = power(mid, n);

            if (val == m)
                return mid;
            else if (val < m)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
