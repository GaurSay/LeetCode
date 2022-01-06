class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        int s =0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] !=nums[s]){
                nums[s+1] = nums[i];
                s++;
            }
        }
        // System.out.println(s);
        return s+1;
    }
}