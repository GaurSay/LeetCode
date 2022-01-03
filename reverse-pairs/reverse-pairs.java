class Solution {
    static int count;
    public int reversePairs(int[] nums) {
      count =0;
      sort(nums,0,nums.length-1);  
      return count;
    }
    
    
    private static void sort(int[] arr,int s,int e) {
		if(s>=e) {
			return ;
		}
		int mid = (s+e)/2;
		sort(arr,s,mid);
		sort(arr,mid+1,e);
		merge(arr,s,e);
		
	}
    
    private static void merge(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int ans[] = new int[e-s+1];
		int i =s;     
		int mid = (s+e)/2;
        int j = mid+1;
        int x =s;
		for(j = mid+1 ; j<=e ; j++) {
			while(x<=mid && arr[x] <= 2* (long)arr[j]) {
				x++;
			}
			count  += mid - x +1;
		}
        i= s;
		j = mid+1;
        int k =0;
		while(i<=mid && j<=e) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				k++;
				i++;
			}
			else {
				ans[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			ans[k] = arr[i];
			k++;
			i++;
		}
		while(j<=e) {
			ans[k] = arr[j];
			k++;
			j++;
		}
		for(i =0; i<ans.length; i++){
			arr[s+i] = ans[i];
		}
			
	}
}