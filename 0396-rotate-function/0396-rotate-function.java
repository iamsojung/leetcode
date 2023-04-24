class Solution {
    public int maxRotateFunction(int[] nums) {
        int total = 0;
        int f = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i]; // 배열의 합을 구한다.
            f += i * nums[i]; // 일단 첫번째 경우를 구한다.
        }
        int max = f; //첫번째를 max 기준으로 삼는다.
        for(int i = 1; i < nums.length; i++) { 
            // f에다가 배열의 합을 더해주고, 마지막 요소에 (n-1)을 곱하여 F(i)의 새 값을 계산한다.
            f = f + total - nums.length * nums[nums.length - i];
            max = Math.max(max, f);
        }
        return max;
    }
}