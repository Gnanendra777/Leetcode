class Solution {
public:
    int scoreOfString(string s) {
        int sum=0;
        for(int i =0;i<s.size()-1;i++){
            int a1 = static_cast<int>(s[i]);
            int a2=static_cast<int>(s[i+1]);
            sum+=(abs(a1-a2));
        }
        
    return sum;
    }
};