//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class RemoveNthNodeFromEndOfList_19 {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head , fast = head;
        
        for(int i = 0 ; i<n ; i++){
            slow = slow.next;
        }
        if(slow == null)
            //Since we need to remove nth from end
            return head.next;

        while(slow.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = fast.next.next;

        return head;
    }
}
