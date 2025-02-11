class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
           if(i<k){
            pq.add(nums[i]);
           } else{
            if(nums[i] > pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
           }
        }
        return pq.peek();
    }
}