class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;
        int n = nums.length;
        int []ans = new int[2];
        int s = -1;
        int e = -1;
        //search left
        while(l<=r){
            int mid = (l+r) >>1;
            if(nums[mid] == target){
                s = mid;
                r = mid-1;
            } else if(nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        ans[0] =s ;

        l =0;
        r = nums.length-1;
        //search right
        while(l<=r){
            int mid = (l+r) >>1;
            if(nums[mid] == target){
                e = mid;
                l = mid+1;
            } else if(nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        ans[1] =e;

        //System.out.println(s);
        return ans;
    }
}