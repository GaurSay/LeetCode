class Solution {
    public int[] twoSum(int[] arr, int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        for(int i =0;i<arr.length;i++){
            if(hm.containsKey(n-arr[i])){
                ans[0] = hm.get(n-arr[i]);
                ans[1] = i;
            }
            else{
                hm.put(arr[i],i);
            }
        }
        return ans;
        
    }
}