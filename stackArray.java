//https://www.geeksforgeeks.org/problems/implement-stack-using-array/1?page=1&category=Stack&sortBy=submissions
class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    top++;
        arr[top] = a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
	    if(top == -1) return -1;
        int a = arr[top];
        top--;
        return a;
        
	}
}
