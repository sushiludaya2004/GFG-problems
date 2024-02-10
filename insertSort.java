//https://www.geeksforgeeks.org/problems/insertion-sort/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
  static void insert(int arr[],int i)
  {
      int k=i;
       for(int j=i+1;j>0 && arr[k]>arr[j] ;j--)
       {
           int temp=arr[k];
           arr[k]=arr[j];
           arr[j]=temp;
           k--;
       }
  }

  public void insertionSort(int arr[], int n)
  {
      for(int i=0;i<n-1;i++)
      {
          insert(arr,i);
      }
  }
}
