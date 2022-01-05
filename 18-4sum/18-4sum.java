class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int left = j+1;
                int right = nums.length-1;
                int target2 = target - nums[i] - nums[j]; 
                while(left < right){
                    if(nums[left] + nums[right] < target2){
                        left++;
                    }
                    else if(nums[left] + nums[right] > target2){
                        right--;
                    }
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                        
                        // for duplicated of num 3
                        while(left< right && nums[left] == list.get(2)){
                            left++;
                        }
                        
                        // for duplicated of num 4
                        while(left< right && nums[right] == list.get(3)){
                            right--;
                        }
                        
                    }
                }
                // for duplicated of num 2
                while(j+1<n  && nums[j+1] == nums[j]){
                     j++;
                }
                
            }
            // for duplicated of num 1
            while(i+1<n  && nums[i+1] == nums[i]){
                i++;
            }
        }
        return ans;
    }
}