//https://www.geeksforgeeks.org/problems/selection-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution
{
    int  select(int arr[], int i)
    {
        int min=Integer.MAX_VALUE;
        int pos=i;
         for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]<min)
               {
                   min=arr[j];
                   pos=j;
               }
           }
           return pos;
    }
    
    void selectionSort(int arr[], int n)
    {
       for(int i=0;i<n;i++)
       {
           int pos=select(arr,i);
           if(arr[pos]<arr[i])
           {
               int temp=arr[i];
               arr[i]=arr[pos];
               arr[pos]=temp;
           }
       }
    }
}
