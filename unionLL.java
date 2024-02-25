//https://www.geeksforgeeks.org/problems/union-of-two-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    ArrayList<Integer> sp = new ArrayList<>();
    Node ptr1 = head1;
    Node ptr2 = head2;
    
    while(ptr1 != null ){
        if( !sp.contains(ptr1.data)){
            sp.add(ptr1.data);
        }
        ptr1 = ptr1.next;
        
    }
       
    while(ptr2 != null ){
        if( !sp.contains(ptr2.data)){
            sp.add(ptr2.data);
        }
        
        ptr2 = ptr2.next;
    }
    
    
    Collections.sort(sp);
    
    Node ansH =  new Node(sp.get(0));
    Node curr = ansH;
    int i = 1;
    while( i!= sp.size()){
        curr.next =  new Node(sp.get(i++));
        curr = curr.next;
    }
    
    return ansH;
	}
}
