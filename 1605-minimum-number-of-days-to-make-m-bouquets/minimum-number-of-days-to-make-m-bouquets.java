class Solution {

    // Check if it is possible to make m bouquets on day
    public boolean possible(int[] bloomDay, int day, int m, int k) {
        int cnt = 0;
        int noOfBouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
            } else {
                noOfBouquets += cnt / k;
                cnt = 0;
            }
        }

        noOfBouquets += cnt / k;

        return noOfBouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        long flowersNeeded = (long) m * k;

        if (flowersNeeded > bloomDay.length)
            return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        int low = mini;
        int high = maxi;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}