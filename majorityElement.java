//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays&difficulty=Medium&status=unsolved&sortBy=submissions
class Solution
{
    static int majorityElement(int a[], int size)
    {
        int cnt = 0;
        int ele = -1;
        int result = 0;
        int c = 0;
        for(int i = 0; i < size; i++){
            if(cnt == 0){
                ++cnt;
                ele = a[i];
            }
            else if(a[i] == ele) cnt++;
            else cnt--;
        }
        
        for(int i = 0; i< size; i++){
            if(a[i] == ele) {
                c = a[i];
                result++;
            }
        }
        
        if(result > (size/2)) return c;
        return -1;
    }
}
