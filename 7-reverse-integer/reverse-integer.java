class Solution {
    public int reverse(int x) {
        boolean negative = false;
       if (x < 0) {
        x = -x;
        negative = true;
    }
    int num =0;
    while(x!=0){  
        int a=x%10; 
        // Check if the next operation is going to cause an overflow
        // and return 0 if it does
        if (num > (Integer.MAX_VALUE-a)/10) return 0;
        num=num*10+a;  
        x=x/10;  
    }  
    return negative ? -num : num;
        
    }
}