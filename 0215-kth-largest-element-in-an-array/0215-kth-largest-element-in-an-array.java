class Solution {
    public int findKthLargest(int[] nums, int k) {

       int min = 0;
        int max = 0;
        for (var num : nums) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        
        int[] num2frequency = new int[max - min + 1];
        for (var num : nums) {
            num2frequency[num - min]++;
        }

        for (var i = num2frequency.length-1; i >= 0; i--) {
            var frequency = num2frequency[i];
            k -= frequency;
            if (k <= 0) {
                return i + min;
            }
        }
        throw new IllegalStateException();
        
    }
}