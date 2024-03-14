//https://www.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1?page=1&category=Queue&sortBy=submissions
class Solution {
    public String FirstNonRepeating(String A) {
        Queue<Character> queue = new LinkedList<>();
        //HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int[] count = new int[26]; // Assuming input consists of lowercase English letters
        
        for (char ch : A.toCharArray()) {
            //map.put(ch, map.getOrDefault(ch, 0) + 1);
            queue.offer(ch);
            count[ch - 'a']++;
            
            while (!queue.isEmpty() && count[queue.peek() - 'a'] > 1) {
                queue.poll();
            }
            
            if (queue.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(queue.peek());
            }
        }

        return sb.toString();
    }
}
