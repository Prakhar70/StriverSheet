package Day5_LinkedList;

class removeNthLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null||head.next==null){
            return null;
        }
        int k=n;
        ListNode frwd=head,curr=head;
        while(k-->0){
            frwd=frwd.next;
        }
        if(frwd == null){
            return head.next;//First element has to be removed
        }
        while(frwd.next!=null){
            frwd = frwd.next;
            curr= curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}