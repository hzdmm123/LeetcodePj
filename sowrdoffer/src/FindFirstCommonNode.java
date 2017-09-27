/**
 * Created by hzdmm on 2017/4/11.
 */
public class FindFirstCommonNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null||pHead2==null){
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int m=0,n=0;
        while (p1.next!=null){
            p1= p1.next;
            m++;
        }
        while (p2.next!=null){
            p2=p2.next;
            n++;
        }
        if (p1!=p2){
            return  null;
        }
        int exp=m-n;
        if (exp>0){
            while (exp>0){
                pHead1=pHead1.next;
                exp--;
            }
        }else {
            while (exp<0){
                pHead2=pHead2.next;
                exp++;
            }
        }
        while (pHead1!=pHead2){
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return pHead1;

    }
}
