
//https://www.geeksforgeeks.org/problems/help-classmates--141631/1?itm_source=geeksforgeeks
class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	   // for(int i = 0; i < n; i++){
	   //     int cnt = 0;
	   //     for(int j = i+1; j < n; j++){
	   //         if(arr[i] > arr[j]) {
	   //             cnt++;
	   //             arr[i] = arr[j];
	   //             break;
	   //         }
	   //     }
	   // if(cnt == 0) arr[i] = -1;
	   // } 
	   // return arr;
	   
	   Stack<Integer>stack=new Stack<>();
      
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
	}
}
