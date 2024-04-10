//https://www.geeksforgeeks.org/problems/alone-in-couple5507/1
class Solution{
    static int findSingle(int n, int arr[]){
        // code here
         int single = 0;
        
        for(int num : arr)
        {
            single ^= num;
        }
        return single;
    }
}
