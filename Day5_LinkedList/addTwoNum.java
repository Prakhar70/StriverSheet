package Day5_LinkedList;

public class addTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1=l1,cur2=l2;
        ListNode dummy1=new ListNode(-1);
        ListNode dummy=dummy1;
        int carry=0;
        while(cur1!=null || cur2!=null || carry!=0){
            int val1=cur1!=null?cur1.val:0;
            int val2=cur2!=null?cur2.val:0;
            int sum=val1+val2+carry;
            ListNode elem=new ListNode (sum%10);
            carry=sum/10;
            
            dummy.next=elem;
            dummy=dummy.next;
            if (cur1!=null){
                cur1=cur1.next;
            }
            if (cur2!=null){
                cur2=cur2.next;
            }
        }
        return dummy1.next;
    }
}
