//https://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/

public class Sort0s1s2sinLikedList_gfg {
    public static void main(String[] args) {
        
    }

    class Node {
        int data;
        Node next;
    
        // Constructor to initialize a new node with data
        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    public static Node sortList(Node head) {
        int[] count = new int[3];

        Node temp = head;

        while(temp!=null){
            count[temp.data]++;
            temp = temp.next;
        }

        Node temp1 = head;
        int i = 0;
        while(temp1!=null){
            if(count[i] == 0){
                i++;
            }else{
                temp1.data = i;
                count[i]--;
                temp1 = temp1.next;
            }
        }

        return head;
    }
}
