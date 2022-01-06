class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // TC - O(n) // SC - O(1)
        int l=0;
        int r=n-1;
        
        int sum = 0;
        int lmax = 0;
        int rmax = 0;
        while(l<=r){
            if(height[l] <= height[r]){
                if(height[l] >= lmax){
                    lmax = height[l];
                }
                else{
                    sum += lmax - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rmax){
                    rmax = height[r];
                }
                else{
                    sum += rmax-height[r];
                }
                r--;
            }
        }
        return sum;   

    }
}

        // TC - O(n) // SC - O(2n)
//         int left[] = new int[n];
//         left[0] = height[0];
        
//         for(int i=1;i<n;i++){
//             left[i] = Math.max(height[i],left[i-1]);
//         }
        
//         int right[] = new int[n];
//         right[n-1] = height[n-1];
        
//         for(int i=n-2;i>=0;i--){
//             right[i] = Math.max(height[i],right[i+1]);
//         }
//         int sum = 0;
//         for(int i = 0;i<n;i++){
//             sum += Math.min(left[i],right[i])-height[i];
//         }
        
//         return sum;