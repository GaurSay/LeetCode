class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            switch(arr[mid]){
                case 0 : 
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;
                case 1 : 
                    mid++;
                    break;
                case 2 :
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
    }
    private static void swap(int arr[],int a,int b){
        int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
    }
}