//https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

import org.w3c.dom.Node;

public class FlattenMultiLevelDoublyLL_430 {
    public static void main(String[] args) {
        
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    public Node flatten(Node head) {
        Node curr = head;
        while(curr != null){
            if(curr.child!=null){
                Node tail = getTail(curr.child);
                
                if(curr.next != null)
                    curr.next.prev = tail;

                tail.next = curr.next;
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }

            curr = curr.next;
        }

        return head;
    }

    public Node getTail(Node node){
        while(node.next!=null){
            node = node.next;
        }
        return node;
    }
}
