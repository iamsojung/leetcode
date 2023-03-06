class Solution {
    public int jump(int[] N) {
        int len = N.length - 1;
        int curr = -1;
        int next = 0;
        int ans = 0;
        
        for (int i = 0; next < len; i++) {
            if (i > curr) { //curr보다 i가 크다면,
                ans++; //정답을 ++ 해주고,
                curr = next; //curr을 next로 바꿔준다.
            }
            next = Math.max(next, N[i] + i); // next는 최소값으로 갱신해준다.
        }
        return ans;
    }
}