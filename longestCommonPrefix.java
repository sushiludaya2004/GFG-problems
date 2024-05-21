//https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?page=1&category=Strings&difficulty=Easy&sortBy=submissions
class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here >
        String mins = arr[0]; //geek
        for(int i=0; i<n; i++){
            if(mins.length() > arr[i].length()){
                mins = arr[i];
            }
        }
        
        String res = "";
        for(int i=1; i<=mins.length();i++){
            String s = mins.substring(0,i);
            boolean flag = false;
            for(int j=0; j<n; j++){
                if(!arr[j].startsWith(s)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
            res=s;
        }
        
        if(res.length()>0){
            return res;
        }else{
            return "-1";
        }
    }
}
