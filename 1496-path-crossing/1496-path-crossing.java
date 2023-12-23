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
            String point = pathx + "," + pathy;
            System.out.println(point);
            if(set.contains(point)){
                return true;
            }
            else{
                set.add(point);
            }
        }
       return false; 
    }
}