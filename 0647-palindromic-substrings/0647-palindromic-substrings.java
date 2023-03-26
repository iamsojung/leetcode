class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length();
        Boolean[][] dp = new Boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        
        int count = len;
        
        for (int d = 1; d < len; d++) {
            for (int i = 0; i < len-d; i++) {
                int j = d+i;
                boolean flag = s.charAt(i) == s.charAt(j);
                if(j-i < 3) {
                    dp[i][j] = flag;
                }else if(flag){
                    dp[i][j] = dp[i+1][j-1];
                }else{
                    dp[i][j] = false;
                }
                if(dp[i][j] ) count++;
            }
        }
        return count;
    }
}