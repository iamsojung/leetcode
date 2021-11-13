class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(hm.containsKey(nums[i])){
                int num = hm.get(nums[i]);
                
                hm.put(nums[i],num+1);
                max = Math.max(max,num+1);
            }else{
                
            hm.put(nums[i],1);
                max = Math.max(max,1);
            }
        }
        Iterator<Integer> keys = hm.keySet().iterator();
        while( keys.hasNext() ){
            int key = keys.next();
      //      System.out.println( String.format("키 : %s, 값 : %s", key, map.get(key)) );
            if(hm.get(key)==max){
                return key;
            }
        }
        
        return 0;

    }
}

        
 