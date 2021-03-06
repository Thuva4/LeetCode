package Java;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeSorted {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode listNode = l1.val < l2.val ? new ListNode(l1.val) : new ListNode(l2.val);
        if(l1.val<l2.val){
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        ListNode head = listNode;
        listNode = head.next;
        while(l1!=null || l2!=null ){
            if(l1!=null && l2!=null) {
                if (l1.val < l2.val) {
                    listNode = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    listNode = new ListNode(l2.val);
                    l2 = l2.next;
                }
            } else if(l1!=null){
                listNode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                listNode = new ListNode(l2.val);
                l2 = l2.next;
            }

            listNode = listNode.next;
        }
        return head;
    }
}
