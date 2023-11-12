class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){return 0;}
        int i = 0;
        int j = nums.length-1;
        int temp;
        while (i <= j){
            if(nums[i] == val){
                while (nums[j] == val && j > i){
                    j--;
                }
                if(i == j){
                    return i;
                }
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            i++;
        }

        return i;
    }
}
