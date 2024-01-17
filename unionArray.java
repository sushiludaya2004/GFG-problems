//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution{
//     public static int doUnion(int arr1[], int n, int arr2[], int m) 
//     {
//         int i = 0, j = 0; // pointers
//         ArrayList<Integer > Union=new ArrayList<>();
//         while (i < n && j < m) {
//             if (arr1[i] <= arr2[j]) 
//             {
//                 if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
//                 Union.add(arr1[i]);
//                 i++;
//             } else
//                 {
//                     if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
//                     Union.add(arr2[j]);
//                     j++;
//                 }
//         }
//         while (i < n)
//         {
//             if (Union.get(Union.size()-1) != arr1[i])
//             Union.add(arr1[i]);
//             i++;
//         }
//         while (j < m)
//         {
//             if (Union.get(Union.size()-1) != arr2[j])
//             Union.add(arr2[j]);
//             j++;
//         }
//         return Union.size();
// }
    public static int doUnion(int arr1[], int n, int arr2[], int m) {
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it: s)
            Union.add(it);
        return Union.size();
    }
}
