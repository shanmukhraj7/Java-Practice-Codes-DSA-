public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head, slow = head, prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev != null){
            prev.next = slow.next;
        }
        return head;
    }
}
