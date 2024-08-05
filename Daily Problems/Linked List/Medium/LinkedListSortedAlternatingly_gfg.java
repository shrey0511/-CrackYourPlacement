//https://www.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class LinkedListSortedAlternatingly_gfg {
    public static void main(String[] args) {
        
    }

    class Node {
        int data;
        Node next;
        
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node sort(Node head){
        if(head == null || head.next == null) return head;

        Node middle = getMiddle(head);

        Node right = middle.next;
        middle.next = null;

        Node left = head;

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    public Node getMiddle(Node node){
        Node slow = node , fast = node;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node left , Node right){
        if(right == null) return left;
        if(left == null) return right;

        Node dummy = new Node(0);
        Node temp = new Node(0);
        dummy.next = temp;

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right =right.next;
            }
            temp = temp.next;
        }

        temp.next = (left == null)? right : left;

        return dummy.next;

    }
}
