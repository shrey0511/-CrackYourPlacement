//https://leetcode.com/problems/partition-list/

public class PartitionList_86 {
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

    public ListNode partition(ListNode head, int x) {
        ListNode beforeX = new ListNode(0);
        ListNode afterX = new ListNode(0);

        //For traversing both
        ListNode curr1 = beforeX;
        ListNode curr2 = afterX;

        ListNode temp = head;
        while(temp!=null){
            if(temp.val < x){
                curr1.next = temp;
                curr1 = curr1.next;
            }else{
                curr2.next = temp;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }

        curr1.next = afterX.next;
        curr2.next = null;

        return beforeX.next;
    }
}
