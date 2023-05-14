
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nextNode = slow.next;
        ListNode prevNode = slow.next=null;
        
        while (nextNode != null) {
           ListNode currentNode=nextNode.next;
           nextNode.next=prevNode;
           prevNode=nextNode;
           nextNode=currentNode;
        }
        ListNode second = prevNode;
        ListNode first = head;
        slow.next = null;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode temp = head;

        for (int i = 1; i < 11; i++) {
            ListNode tempNode = new ListNode(i);
            temp.next = tempNode;
            temp = tempNode;
        }
        head = head.next;
        temp = head;
        Solution s = new Solution();
        s.reorderList(head);
        // while(temp!=null){
        // System.out.print(temp.val+" ");
        // temp=temp.next;
        // }

    }
}
