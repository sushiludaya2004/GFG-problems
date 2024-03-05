//https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1?page=1&category=Linked%20List&difficulty=Hard&sortBy=submissions

class Clone {
    
    Node copyList(Node head) {
      
    //     HashMap<Node,Node> hashMap=new HashMap<>();
    //     Node temp = head;

    //     while(temp != null) {
    //         Node newNode = new Node(temp.data);
    //         hashMap.put(temp,newNode);
    //         temp = temp.next;
    //     }
    //     Node t = head;

    //     while(t != null) {
    //         Node node = hashMap.get(t);
    //         node.next = (t.next != null) ? hashMap.get(t.next) : null;
    //         node.arb = (t.arb != null) ? hashMap.get(t.arb) : null;
    //         t = t.next;
    //     }
    //     return hashMap.get(head);
    
    Node temp = head;
	
    while(temp != null) {
        Node newNode = new Node(temp.data);
        newNode.next = temp.next;
        temp.next = newNode;
        temp = temp.next.next;
    }
	
    Node itr = head;
    while(itr != null) {
        if(itr.arb != null)
            itr.next.arb = itr.arb.next;
        itr = itr.next.next;
    }
	
    Node dummy = new Node(0);
    itr = head;
    temp = dummy;
    Node fast;
    while(itr != null) {
        fast = itr.next.next;
        temp.next = itr.next;
        itr.next = fast;
        temp = temp.next;
        itr = fast;
    }
    return dummy.next;
    }
}
