//https://www.geeksforgeeks.org/problems/in-first-but-second5423/1
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
         ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int num : b) hs.add(num);
        for(int num: a) if(!hs.contains(num)) res.add(num);
        return res;
    }
}
