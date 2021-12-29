class Solution {
    public int maxSubArray(int[] arr) {
        // KADANS ALGO
        int max_sum = Integer.MIN_VALUE;
        int s= 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(max_sum < sum){
                max_sum = sum;
                start = s;
                end = i;
            }
            if(sum < 0){
                sum =0;
                s =i+1;
            }
        }
        return max_sum;
    }
}