package Day5_LinkedList;

class mergeSortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null){
            return (list1==null)?list2:list1;
        }
        ListNode dummy=new ListNode(-1);
        ListNode dummy1=dummy;
        ListNode curr1=list1,curr2=list2;
        while(curr1!=null && curr2!=null){
            if (curr1.val<curr2.val){
                dummy.next=curr1;
                dummy=dummy.next;
                curr1=curr1.next;
            }else{
                dummy.next=curr2;
                dummy=dummy.next;
                curr2=curr2.next;
            }
        }
        dummy.next=(curr1!=null)?curr1:curr2;
        return dummy1.next;
        
    }
}