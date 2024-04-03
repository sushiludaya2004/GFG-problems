//https://www.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        HashSet<Long> set = new HashSet<>();
        // pair[] result = new pair[1];
        ArrayList<pair> list = new ArrayList<>();
        
        for(long num:B)
            set.add(num);
            
        for(long num: A){
            
             long find = (X - num);
             
             if(set.contains(find)){
                 list.add(new pair( num, find));
             }
        }
        
        pair[] result = new pair[list.size()];

        for (int i = 0; i < list.size(); i++) {
            pair p = list.get(i);
            result[i] = new pair(p.first, p.second);
        }
        return result;
    }
}
