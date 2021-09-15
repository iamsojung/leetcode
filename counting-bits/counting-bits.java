class Solution {
    public int[] countBits(int n) {
        
        int[] answer = new int[n+1];
        answer[0] = 0;
        
        for(int i=1;i<=n;i++){
            
            int num = i;
            int cnt = 0;
            
            while(num!=0){
                
                int remainder = num%2;
                System.out.println(remainder);
                if(remainder==1){
                    cnt++;
                }
                num = num/2;
            }
            System.out.println("----");
            answer[i] = cnt;
        }
        
        return answer;
    }
}