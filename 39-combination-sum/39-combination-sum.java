class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
         // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        getsubset(arr,0,target,new ArrayList<>(),ans);
        return ans;
    }
    
    private static void getsubset(int arr[],int index,int          sum,ArrayList<Integer> ds,List<List<Integer>> ans){
        if(index == arr.length){
            if(sum == 0){
            	ans.add(new ArrayList<>(ds));
        	}
            return;
        }
 
        //adding curr index element - picking ( we can pick same again)
        if(arr[index] <= sum){
            ds.add(arr[index]);
        	getsubset(arr,index,sum-arr[index],ds,ans);
        	ds.remove(ds.size()-1);
        }
        
        // without curr index
        getsubset(arr,index+1,sum,ds,ans);
        
        
    }
}