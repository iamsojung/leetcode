class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] alphabet = new int[26];
        
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']=i;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        
        for(int i=0;i<s.length();i++){
            end = Math.max(end,alphabet[s.charAt(i)-'a']);
            
            if(i==end){
                list.add(end-start+1);
                start = i+1;
            }
        }
    return list;
        
    }
}