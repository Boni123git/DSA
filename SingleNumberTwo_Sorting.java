//Leetcode submitted solution
class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums[1] != nums[0]){
            return nums[0];
        }
        if(nums[len-1] != nums[len-2]){
            return nums[len-1];
        }

        int i = 1;
        while(i < len){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
            i = i + 3;
        }
        return -1;
    }
}
