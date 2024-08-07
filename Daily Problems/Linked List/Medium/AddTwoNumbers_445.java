//https://leetcode.com/problems/add-two-numbers-ii/

public class AddTwoNumbers_445 {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);
        int carry = 0 , sum = 0;

        while(temp1 != null || temp2 != null || carry != 0){
            int digit1 = (temp1 != null)? temp1.val : 0;
            int digit2 = (temp2 != null)? temp2.val : 0;

            sum = digit1 + digit2 + carry;
            carry = sum/10;

            tail.next = new ListNode(sum%10);
            tail = tail.next;

            temp1 = (temp1 != null) ? temp1.next : null;
            temp2 = (temp2 != null) ? temp2.next : null;
            
        }
        return reverse(dummyHead.next);
    }

    public ListNode reverse(ListNode node){
        ListNode prev = null , pres = node , next = pres.next;
        
        while(pres != null){
            pres.next = prev;

            prev = pres;
            pres = next;
            if(next!=null)
                next = next.next;
        }

        return prev;
    }
}
