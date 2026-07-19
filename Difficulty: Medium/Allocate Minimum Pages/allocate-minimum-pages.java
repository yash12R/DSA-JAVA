import java.util.Arrays;

class Solution {

    boolean isPossible(int[] arr, long barrier, int k) {
        int students = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > barrier)
                return false;

            if (pages + arr[i] > barrier) {
                students++;

                if (students > k)
                    return false;

                pages = arr[i];
            } else {
                pages += arr[i];
            }
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        int n = arr.length;

        // Impossible case
        if (k > n)
            return -1;

        long low = Arrays.stream(arr).max().getAsInt();

        long high = 0;
        for (int x : arr)
            high += x;

        long ans = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPossible(arr, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }
}