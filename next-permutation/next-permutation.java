class Solution {
    public void nextPermutation(int[] arr) {
        
        int n = arr.length;
		if(arr ==null  || n <=1) {
			return ;
		}
        int i = n-2;
        
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        
        if(i>=0){
            int j = n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            //swap
            int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
        }
        
        // reverse after potential index;
		reverse(arr,i+1,n-1);
        
    }
    
    private static void reverse(int arr[],int l, int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}
}