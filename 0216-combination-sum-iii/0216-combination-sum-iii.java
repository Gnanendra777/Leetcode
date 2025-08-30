class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int start, int k, int remaining, List<Integer> path, List<List<Integer>> ans){
        if(path.size() == k) {
            if(remaining == 0) ans.add(new ArrayList<>(path));
            return;
        }

        for(int i =start; i <= 9; i++){
            if(remaining - i < 0) break;
            path.add(i);
            dfs(i+1,k, remaining-i, path, ans);
            path.remove(path.size() -1);           
        }
    }
}