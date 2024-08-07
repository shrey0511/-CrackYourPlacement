//https://leetcode.com/problems/copy-list-with-random-pointer/

import java.util.HashMap;

public class CopyListWithRandomPointer_138 {
    public static void main(String[] args) {
        
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            map.put(temp , new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while(temp!=null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }
}
