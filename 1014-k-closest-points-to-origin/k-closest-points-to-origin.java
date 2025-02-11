import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int n = points.length;

        for(int i=0;i<n;i++){
            pq.add(new pair(getDist(points[i][0],points[i][1]),points[i]));
        }

        int ans[][] = new int[k][2];


        for(int i=0;i<k;i++){
            int p[] = pq.poll().point;
            ans[i][0] = p[0];
            ans[i][1] = p[1];
        }
        return ans;
    }

    private double getDist(int x,int y){
        return Math.sqrt((x*x)+(y*y));
    }
}
class pair implements Comparable<pair>{
    double dist;
    int[] point;
    public pair(double dist,int point[]){
        this.dist = dist;
        this.point = point;
    }
    
    public int compareTo(pair o){
        return Double.compare(this.dist,o.dist);
    }

}