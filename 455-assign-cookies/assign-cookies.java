class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = s.length;
        int n = g.length;

        int l =0;
        int r= 0;

        while(l<m && r<n){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }

        return r;
    }
}