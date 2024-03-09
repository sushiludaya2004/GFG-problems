//https://www.geeksforgeeks.org/problems/sort-a-stack/1?page=1&category=Stack&sortBy=submissions
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		if(s.isEmpty()){
          return s;
        }  
        
        int temp = s.pop();
        sort(s);
        insertEle(s, temp);
        return s;
	}
	
	public void insertEle(Stack<Integer> s, int temp){
	    if(s.isEmpty() || s.peek() < temp){
	        s.push(temp);
	        return;
	    }
	    
	    int ele = s.pop();
	    insertEle(s, temp);
	    s.push(ele);
	}
}
