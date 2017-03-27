package edu.leetcode.linkedList;

public class ReorderList143 {

    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode left=head;
        int n=1;
        while(left.next!=null){
            left=left.next;
            n++;
        }
        if(n%2!=0){
            n=n/2+1;
        }else{
            n=n/2;
        }
        ListNode leftEnd=head;
        while(n>1){
            leftEnd=leftEnd.next;
            n--;
        }
        ListNode right=leftEnd.next;
        leftEnd.next=null;
        right=reversList(right);
        left=head;
        boolean flag=true;
        ListNode next=null;
        //Set a flag
        while(right!=null){
            if(flag){
                next=left.next;
                left.next=right;
                left=next;
            }else{
                next=right.next;
                right.next=left;
                right=next;
            }
            flag=!flag;
        }
    }
    
    private ListNode reversList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=head;
        ListNode p=head.next;
        ListNode after=null;
        while(p!=null){
            after=p.next;
            p.next=pre;
            pre=p;
            p=after;
        }
        head.next=null;
        return pre;
    }

}
