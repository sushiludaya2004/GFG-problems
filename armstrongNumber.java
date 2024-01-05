//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
class Solution {
    static String armstrongNumber(int n){
        int sum=0;
        int ans = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            ans = rem*rem*rem;
            sum += ans;
            n = n/10;
        }
        if(temp == sum) return "Yes";
        else return "No";
    }
}
