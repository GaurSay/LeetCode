class Solution {
    public double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        long nn = n;
        double ans;
        if(n<0){
            nn = -1*nn;         
        }
        ans = getpower(x,nn);
        if(n<0){
            return 1.00000/ans;
        }
        else{
            return ans;
        }
        
    }
    
    private double getpower(double x, long n) {
        // System.out.println(x+" "+n);
        if(n == 0.00){
            return 1.00000;
        }
        if(n%2 == 0.000000){
            return getpower(x*x,n/2);
        }
        else{
            return x*getpower(x,n-1);
        }
    }
    
}