class Solution {
    public int longestConsecutive(int[] nums) {
         /* 1 .Brute force - O(N^2)
            2. sort - O(nlogn) prevsmall
            3. Set data structure O(n)
         */

         int n = nums.length;

         if(n==0){
             return 0;
         }

        Set<Integer> set = new HashSet<>();

        int max = 1;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for(int it:set){
             int x = it;
             if(!set.contains(x-1)){
                 int c = 1;
                 while(set.contains(x+1)){
                    c++;
                    x = x+1;
                 }
                 max = Math.max(max,c);
             }
         }


         return max;
    }
}