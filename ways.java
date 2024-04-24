//https://www.geeksforgeeks.org/problems/paths-to-reach-origin3850/1
class Solution
{
    public static int ways(int n, int m)
    {
        return solve(n,m);
    }
    public static int solve(int i,int j){
        if(i < 0 || j < 0){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }
        int l = solve(i-1,j);
        int r = solve(i,j-1);
        return l + r;
    }
}
