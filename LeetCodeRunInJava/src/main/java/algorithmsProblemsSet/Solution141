class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode p=head,q=head.next;
        while(p!=null&&q!=null&&p!=q){
            if(p.next==null){
                p=null;
            }else{
                p=p.next;
            }
            if(q.next==null||q.next.next==null){
                q=null;
            }else{
                q=q.next.next;
            }
        }
        if(p==null||q==null) return false;
        return true;
    }
}
