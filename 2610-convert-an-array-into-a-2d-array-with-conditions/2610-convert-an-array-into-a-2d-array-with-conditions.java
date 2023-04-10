class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list=new ArrayList<>(); //정답을 만들 배열 선언
        boolean[] visit=new boolean[nums.length];
        int count=0;
        while(true){
            List<Integer> arr=new ArrayList<>();
            
            for(int i=0;i<nums.length;i++){ // 배열만큼 반복문 돌면서 
                if(!visit[i] && !arr.contains(nums[i])){// 방문하지 않고, 새로 만든 리스트에 없는 경우
                    count++;
                    visit[i]=true;
                    arr.add(nums[i]);
                }
            }
            if(count==0) break;
            
            list.add(arr);
            count=0;
        }
        return list;
    }
}