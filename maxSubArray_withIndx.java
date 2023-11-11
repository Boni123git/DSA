class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int end_idx = 0;

        for(int i = 0 ; i < nums.length ; i++){
            curr_sum += nums[i];

            if(curr_sum > max_sum){
                max_sum = curr_sum;
                end_idx = i;
            }
            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        curr_sum = nums[end_idx];
        int idx = end_idx;
        while(curr_sum != max_sum){
            curr_sum += nums[--idx];
        }
        System.out.println("start idx = " + idx + " end idx = " + end_idx);
        return max_sum;
    }
}
