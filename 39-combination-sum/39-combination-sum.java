class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getsubsets(arr,0,target,new ArrayList<>(),ans);
        return ans;
    }
    private static void getsubsets(int arr[],int index,int target,ArrayList<Integer> output,List<List<Integer>> ans){
        if(index == arr.length){
            if(target==0){
                ans.add(new ArrayList<>(output));
            }
            return;
        }
        
        if(arr[index] <= target){
            output.add(arr[index]);
            getsubsets(arr,index,target-arr[index],output,ans);
            output.remove(output.size()-1);
        }
        
        getsubsets(arr,index+1,target,output,ans);
    }
}