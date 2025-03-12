class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }

         map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x-> lm.put(x.getKey(),x.getValue()));
        int ans[] = new int[k];
        int x=0;
        for(Map.Entry<Integer,Integer> entry: lm.entrySet()){
            if(x==k){
                break;
            }
            ans[x] = entry.getKey();
            x++;
            // System.out.println("a : " + entry.getKey() +" " + entry.getValue());
        }

        return ans;



    }
}