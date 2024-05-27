https://www.geeksforgeeks.org/problems/find-first-repeated-character4108/1?page=1&category=Strings&difficulty=Easy&sortBy=submissions
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        HashMap<Character,Integer> hash=new HashMap<>();
        for(char c:s.toCharArray()){
            if(hash.get(c)==null){
                hash.put(c,1);
            }
            else{
                return ""+c;
            }
        }
        return "-1";
    }
} 
