class Solution {
    public int findDuplicate(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     int index = Math.abs(arr[i]);
        //     int value = arr[index];
        //     if(value > 0){
        //         arr[index] = value*(-1);
        //     }
        //     else{
        //         return Math.abs(arr[i]);
        //     }
        // }
        // return -1;

        int slow = arr[0];
        int fast = arr[0];
        
        do{
            slow = arr[slow];
            fast= arr[arr[fast]];
        }while(slow!=fast);

        fast = arr[0];

        while(slow!=fast){
            slow= arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}