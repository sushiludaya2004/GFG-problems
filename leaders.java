//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&difficulty=Easy&sortBy=submissions
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer> a = new ArrayList<>();
        int max = arr[n-1];
        for(int i = n-1; i >= 0; --i){
            if(arr[i] >= max){
                a.add(arr[i]);
                max = arr[i];
            }
        }
        reverse(a);
        return a;
    }
    
    static void reverse(ArrayList<Integer> a) {
        int i = 0;
        int j = a.size() - 1;
        while (i < j) {
            int temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            i++;
            j--;
        }
    }
}
