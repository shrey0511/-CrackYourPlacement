//https://leetcode.com/problems/palindrome-linked-list/

public class PalindromeLinkedList_234 {
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

    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;

        ListNode middle = getMiddle(head);
        ListNode secondHead = reverse(middle);

        ListNode temp = head;
        while(temp != null && secondHead != null){
            if(temp.val != secondHead.val)
                break;
            temp = temp.next;
            secondHead = secondHead.next;
        }

        return temp == null || secondHead == null;
    }

    public ListNode getMiddle(ListNode node){
        ListNode slow = node , fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode node){
        ListNode prev = null , pres = node , next = pres.next;

        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!= null){
                next = next.next;
            }
        }

        return prev;
    }
}
