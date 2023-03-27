class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0 )return 0;
        
        int dp[] = new int[amount+1]; // dp로 풀거라 배열 선언
        Arrays.fill(dp,10001); // 최대값으로 채워둔다.
        dp[0] = 0; //0값은 0으로
                    
        for(int i = 0 ;i < coins.length ;i++){ //코인 배열만큼 돌면서 
            for(int j = 1 ;j < amount+1; j++){
                if(j - coins[i] >= 0 ){ //(j - 코인 배열의 값)이 0보다 크면,, 
                    dp[j] = Math.min(dp[j], dp[j - coins[i]]+1); 
                    // dp[j]에 있는 값이랑, dp[j에서 코인의숫자를 뺸 값]+1 값을 갱신해준다.
                    //amount가 2일 때, amount 2 일때, - 2 = 0 0일때는 0개 이므로 
                }
            }
        }
        return dp[amount] == 10001? -1 : dp[amount];
    }
}