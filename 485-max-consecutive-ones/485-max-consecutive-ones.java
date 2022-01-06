class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        
        int maxLength = 0;
         int count=0;
        for(int i=0;i<arr.length;i++){  
            if(arr[i] == 1){
                count++;
            }
            else{
                maxLength = Math.max(maxLength,count);
                count = 0;
            }
        }
        if(maxLength < count){
            maxLength = Math.max(maxLength,count);
        }
        return maxLength;
    }
}