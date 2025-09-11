class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] lastSeen = {-1,-1,-1};
        int count = 0;

        for(int i =0; i< n; i++){
            char ch = s.charAt(i);
            lastSeen[ch - 'a'] = i;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                int minindex = Math.min(lastSeen[0],Math.min(lastSeen[1],(lastSeen[2])));
                count  += minindex +1;
            }
        }
        return count;

    }
}