//https://www.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1?page=2&category=Stack&sortBy=submissions
class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
         Stack<Integer> s = new Stack<>();
        int ans = 0;
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch!='+' && ch!='-' && ch!='*' && ch!='/'){
                int operand = Character.getNumericValue(ch);
                s.push(operand);
            }else{
                if(ch=='+'){
                    int n1 = s.pop();
                    int n2 = s.pop();
                    ans=n1+n2;
                    s.push(ans);
                }else if(ch=='-'){
                    int n1 = s.pop();
                    int n2 = s.pop();
                    ans=n2-n1;
                    s.push(ans);
                
                }else if(ch=='*'){
                    int n1 = s.pop();
                    int n2 = s.pop();
                    ans=n1*n2;
                    s.push(ans);
                }else{
                    int n1 = s.pop();
                    int n2 = s.pop();
                    ans=n2/n1;
                     s.push(ans);
                }    
            }
        }
        return ans;
    }
}
