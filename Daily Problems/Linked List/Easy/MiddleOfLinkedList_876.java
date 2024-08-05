//https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleOfLinkedList_876 {
    public static void main(String[] args) {
        
    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            if(fast.next != null)
                fast = fast.next.next;
        }

        return slow;
    }

}
