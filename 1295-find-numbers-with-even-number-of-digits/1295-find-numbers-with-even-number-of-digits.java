class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        
        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digitCount = 0;
            
            // Count the number of digits in the current number
            while (num > 0) {
                digitCount++;
                num = num / 10;
            }
            
            // Check if the total digit count is even
            if (digitCount % 2 == 0) {
                evenDigitCount++;
            }
        }
        
        return evenDigitCount;
    }
}
