//https://www.geeksforgeeks.org/problems/smallest-distant-window3132/1?page=1&category=sliding-window&sortBy=submissions
class Solution {
    public int findSubString( String str) {
        // Your code goes here
         HashSet<Character> s=new HashSet<>();
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<str.length();i++)
        s.add(str.charAt(i));
        int ans=str.length(),i=-1,j=-1;
        while(true){
            boolean f1=false;
            boolean f2=false;
            //for acquiring 
            while(i<str.length()-1&&m.size()<s.size()){
                i++;
                m.put(str.charAt(i),m.getOrDefault(str.charAt(i),0)+1);
                f1=true;
            }
            //for termination 
            while(j<i&&m.size()==s.size()){
                ans=Math.min(ans,i-j);
                j++;
                if(m.get(str.charAt(j))==1){
                    m.remove(str.charAt(j));
                }
                else{
                    m.put(str.charAt(j),m.get(str.charAt(j))-1);
                }
                f2=true;
            }
            if(f1==false&&f2==false)
            return ans;
           
        }
    }
}
