class Solution {
    public int findDuplicate(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            int index = Math.abs(arr[i]);
            int value = arr[index];
            if(value > 0){
                arr[index] = value*(-1);
            }
            else{
                return Math.abs(arr[i]);
            }
        }
        return -1;
    }
}