class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int maxLength = 0;
        for(int i=0;i<arr.length;i++){
            int x = arr[i];
            if(!hs.contains(x-1)){
                int count =1;
                while(hs.contains(x+1)){
                    count++;
                    x++;
                }
                if(count > maxLength){
                    maxLength = count;
                }
            }
        }
        return maxLength;
    }
}