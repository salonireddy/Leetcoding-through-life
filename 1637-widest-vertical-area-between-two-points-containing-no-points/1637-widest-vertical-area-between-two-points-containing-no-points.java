class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));
        int diff = -1;
        for(int i=0;i<points.length-1;i++){
            if(points[i+1][0] - points[i][0]>diff){
                diff = points[i+1][0] - points[i][0];
            }
        }
        return diff;
    }
}