//https://www.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    //brute force
	   // for(int i = 0; i < n; i++){
	   //     for(int j = 0; j < m; j++){
	   //         if(matrix[i][j] == x) return true;
	   //     }
	   // } 
	   // return false;
	   
	   //optimal
	   int row = 0;
	   int col = m - 1;
	   while(row < n && col >= 0){
	       if(matrix[row][col] == x) return true;
	       else if(matrix[row][col] > x) col--;
	       else row++;
	   }
	   return false;
	  } 
} 
