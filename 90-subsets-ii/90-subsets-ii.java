class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        getsubsets(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    private static void getsubsets(int arr[],int index,ArrayList<Integer> ds,List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(ds));
        
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i] == arr[i-1]) continue;
          
            //  include index
            ds.add(arr[i]);
            getsubsets(arr,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
        
        
        
        
    }
}