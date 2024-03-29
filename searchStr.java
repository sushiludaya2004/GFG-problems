//https://www.geeksforgeeks.org/problems/search-pattern-z-algorithm--141631/1
class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int nedLen = pat.length();
        for(int i=0;i<S.length()-nedLen+1;i++){
            if(pat.charAt(0)==S.charAt(i))
            if(S.substring(i,i+nedLen).equals(pat))
            list.add(i+1);
        }
        return list;
    }
}
