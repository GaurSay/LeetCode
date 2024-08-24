class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int revnum =0;
        int n = x;
        while(n>0){
            int d = n%10;
            n = n/10;
            revnum = (revnum*10) + d;
        }

        return revnum ==x ? true : false;
    }
}