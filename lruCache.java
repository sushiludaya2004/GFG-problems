//https://www.geeksforgeeks.org/problems/lru-cache/1?page=1&category=Queue&sortBy=submissions
// class LRUCache {
//     class Node {
//         int key;
//         int value;
//         Node prev;
//         Node next;
        
//         Node(int key, int value) {
//             this.key = key;
//             this.value = value;
//         }
//     }
    
//     private Node head;
//     private Node tail;
//     private Map<Integer, Node> map;
//     private int capacity;
    
//     public LRUCache(int capacity) {
//         this.capacity = capacity;
//         map = new HashMap<>();
//         head = new Node(-1, -1); // dummy head
//         tail = new Node(-1, -1); // dummy tail
//         head.next = tail;
//         tail.prev = head;
//     }
    
//     public int get(int key) {
//         if (map.containsKey(key)) {
//             Node node = map.get(key);
//             remove(node);
//             insert(node);
//             return node.value;
//         } else {
//             return -1;
//         }
//     }
    
//     public void set(int key, int value) {
//         if (map.containsKey(key)) {
//             remove(map.get(key));
//         } else if (map.size() == capacity) {
//             remove(tail.prev);
//         }
//         insert(new Node(key, value));
//     }
    
//     private void remove(Node node) {
//         map.remove(node.key);
//         node.prev.next = node.next;
//         node.next.prev = node.prev;
//     }
    
//     private void insert(Node node) {
//         map.put(node.key, node);
//         node.next = head.next;
//         node.next.prev = node;
//         head.next = node;
//         node.prev = head;
//     }
// }



class LRUCache {
    private int capacity;
    private Map<Integer, Integer> cache;
    private Stack<Integer> lruStack;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        lruStack = new Stack<>();
    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            updateLRUStack(key);
            return cache.get(key);
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if (cache.containsKey(key)) {
            updateLRUStack(key);
        } else {
            if (cache.size() >= capacity) {
                int leastUsedKey = lruStack.remove(0);
                cache.remove(leastUsedKey);
            }
        }
        cache.put(key, value);
        updateLRUStack(key);
    }
    
    private void updateLRUStack(int key) {
        lruStack.removeElement(key);
        lruStack.push(key); 
    }
}
