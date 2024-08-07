//https://leetcode.com/problems/reverse-linked-list-ii/

public class ReverseLinkedListII_92 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null) return head;

        ListNode pres = head , prev = null;

        //Skip left - 1 nodes
        for(int i = 0 ; pres!=null && i<left-1 ; i++){
            prev = pres;
            pres = pres.next;
        }

        ListNode last = prev , newEnd = pres;

        ListNode next = pres.next;

        for(int i = 0 ; i<right-left+1 ; i++){

            pres.next = prev;

            prev = pres;
            pres = next;
            if(next!=null)
                next = next.next;
        }

        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = pres;

        return head;
    }
}
