package Day5_LinkedList;


class deleteNodeLL {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}