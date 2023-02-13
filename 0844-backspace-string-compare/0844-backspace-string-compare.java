import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '#') {
                stack.push(arr[i]);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        String str1 = stack.toString();
        stack.clear();
        char[] arr1 = t.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != '#') {
                stack.push(arr1[i]);
            } else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        String str2 = stack.toString();
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
}