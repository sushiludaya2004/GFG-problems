//https://www.geeksforgeeks.org/problems/reverse-bits3556/1
class Solution {
    static Long reversedBits(Long x) {
        // code here
        long ans=0;
        for(int i=0;i<32;i++){
            if(((1<<i)&x)!=0){
                    ans+=((1L<<31-i));
            }
        }
        return ans;
    }
};
