//https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1?page=1&category=Strings&difficulty=Easy&status=unsolved&sortBy=submissions
class Solution {
    
    public String reverse(String S){
        //code here
        String st = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i< S.length(); i++){
            stack.push(S.charAt(i));
        }
        
        int i = 0;
        while(!stack.isEmpty()){
            st += stack.pop();
        }
        return st; 
    }

}
