//https://www.geeksforgeeks.org/problems/the-celebrity-problem/1?page=1&category=Stack&sortBy=submissions
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(M[v1][v2]==0){// v1 v2 ko nahi janta to shayad v1 celeb ho sakta ah or or jab v2 ko v1 nahi janta to v2 to celeb nahi ho sakta to v2 pop
              st.push(v1);
            }
            else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1;// koi celeb nahi ha
         int potential = st.pop();//
        for(int j=0;j<n;j++){
            if(M[potential][j]==1) return -1;
        }
        for(int i=0;i<n;i++){// ab columnn wise check kar rahe ha ki koi or 0 to nahi ha
            if(i==potential) continue;
            if(M[i][potential]==0) return -1;
        }
        return potential; 
    }
}
