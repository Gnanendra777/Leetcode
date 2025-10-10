class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()){
            freq[c]++;
        }

        int length=0;
        for(int count : freq){
            length += (count/2)*2;
        }
        if(length < s.length()) length++;

        return length;
    }
}