
//https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1?page=1&category=Stack&sortBy=submissions
class twoStacks
{
    int top;
    int up;
    int arr[] = new int[1000];
    int a[] = new int[1000];
    twoStacks()
    {
        top = -1;
        up = -1;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        top++;
        arr[top] = x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        up++;
        a[up] = x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        // if(top == -1) return -1;
        // int x = arr[top];
        // top--;
        // return x;
        
        if(top==-1) return -1;
        return arr[top--];
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        // if(up == -1) return -1;
        // int x = a[up];
        // up--;
        // return x;
        
        if(up==-1) return -1;
        return a[up--];
    }
}
