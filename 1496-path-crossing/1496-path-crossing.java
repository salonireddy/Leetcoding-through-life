class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int pathx = 0, pathy = 0;
        set.add("0,0");
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch=='N'){
                pathy++;
            }
            else if(ch=='S'){
                pathy--;
            }
            else if(ch=='E'){
                pathx++;
            }
            else if(ch=='W'){
                pathx--;
            }
            if(set.contains(pathx + "," + pathy)){
                return true;
            }
            set.add(pathx + "," + pathy);
        }
       return false; 
    }
}