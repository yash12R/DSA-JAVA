class Solution {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j)
            swap(nums, i++, j--);
    }

    public void nextPermutation(int[] nums) {
if (nums == null || nums.length < 2) return;
        int n = nums.length;

        int isswap = 0;
        int smallestind = n - 1;
        int small = Integer.MAX_VALUE;
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                isswap = 1;
                break;
            }

        }

        if (isswap == 0) {
    reverse(nums, 0, n - 1);
    return;   
}

       int j = n - 1;
while (nums[j] <= nums[pivot]) {
    j--;
}
swap(nums, pivot, j);
reverse(nums, pivot + 1, n - 1);

        
    }
}