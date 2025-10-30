class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Compare mid element with its right neighbor
            if (nums[mid] < nums[mid + 1]) {
                // Peak is on the right side
                low = mid + 1;
            } else {
                // Peak is on the left side (including mid)
                high = mid;
            }
        }
        // low and high converge to the peak index
        return low;
    }
}
