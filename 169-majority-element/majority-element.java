class Solution {
    public int majorityElement(int[] nums) {
         int x = getPotentialElement(nums);
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                c++;
            }
        }
        if(c >= nums.length/2){
            return x;
        }
        return -1;
    }
    private static int getPotentialElement(int arr[]){
        int val = arr[0];
        int count =1;
        
        for(int i =1;i<arr.length;i++){
            if(arr[i]==val){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                val = arr[i];
                count = 1;
            }
        }
        
        return val;
    }
}