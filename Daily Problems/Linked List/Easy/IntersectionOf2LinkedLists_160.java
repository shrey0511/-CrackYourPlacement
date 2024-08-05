//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionOf2LinkedLists_160 {
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA , temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 == null)? headB : temp1.next;
            temp2 = (temp2 == null)? headA : temp2.next;
        }
        return temp1;
    }
}
