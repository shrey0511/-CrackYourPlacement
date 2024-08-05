//https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeSortedLists_21 {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode left = list1 , right = list2;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(left != null && right != null){
            if(left.val <= right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        temp.next = (left == null)? right : left;

        return dummy.next;
    }
}
