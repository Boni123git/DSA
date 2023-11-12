class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        // Use HashSet instead
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i],1);
        }
        return false;
    }
}
