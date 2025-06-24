class Solution {
    public int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        // f[i >> 1]은 i를 오른쪽으로 1비트 시프트한 값의 결과 (i를 2로 나눈 몫)
        // (i & 1)은 i의 마지막 비트가 1인지 0인지를 판단 (i가 홀수면 1, 짝수면 0)
        // 즉, i의 이진수에서 1의 개수 = i를 2로 나눈 수의 1의 개수 + i가 홀수인지 여부
        return f;
    }
}