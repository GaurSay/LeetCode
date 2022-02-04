class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int c1=0;
        int c2=0;
        int val1 = -1;
        int val2 = -1;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val1){
                c1++;
            }
            else if(arr[i]==val2){
                c2++;
            }
            else if(c1==0){
                val1 = arr[i];
                c1=1;
            }
            else if(c2==0){
                val2 = arr[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val1){
                c1++;
            }
            if(arr[i]==val2){
                c2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(c1>n/3){
            list.add(val1);
        }
        if(val1 != val2 && c2>n/3 ){
            list.add(val2);
        }
        return list;
        
    }
}