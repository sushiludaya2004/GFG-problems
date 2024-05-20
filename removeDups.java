//https://www.geeksforgeeks.org/problems/remove-duplicates3034/1?page=1&category=Strings&difficulty=Easy&status=unsolved&sortBy=submissions
class Solution {
    String removeDups(String S) {
        // code here
        ArrayList<Character>a =new ArrayList<>();
         StringBuilder ans=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(!a.contains(S.charAt(i))){
                a.add(S.charAt(i));
                 ans.append(S.charAt(i));
            }
        }
        return ans.toString();
    }
}
