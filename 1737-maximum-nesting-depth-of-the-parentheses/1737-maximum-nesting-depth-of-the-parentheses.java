class Solution {
    public int maxDepth(String s) {
        int Depth =0, maxDepth =0;
        for(char c : s.toCharArray()){
            if(c =='('){
                Depth++;
                maxDepth = Math.max(maxDepth,Depth);
            }
            else if(c == ')'){
                Depth--;
            }
        }
        return maxDepth;
    }
}