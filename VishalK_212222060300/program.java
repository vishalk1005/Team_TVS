public class MaxSubArray {
    
    public int maxSubArray(int[] nums) {
        // Initialize the maximum sum and the current sum
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solution.maxSubArray(input);
        
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
