class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.split(" ");
        
        System.out.println(arr.length);
        
        return arr[arr.length-1].length();
    }
}