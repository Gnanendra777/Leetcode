class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0) return ans;

        String[] map = new String[]{
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" //9
        };

        backtrack(0, digits, new StringBuilder(), ans, map);
        return ans;
        }

    private void backtrack(int index , String digits, StringBuilder path, List<String> ans, String[] map){
        if(index == digits.length()){
            ans.add(path.toString());
            return;
        }

        int digit = digits.charAt(index)- '0';
        String letters = map [digit];

        for(int i =0; i < letters.length(); i++){
            path.append(letters.charAt(i));
            backtrack(index +1, digits, path, ans,map);
            path.deleteCharAt(path.length()-1);
        }
    }
}
