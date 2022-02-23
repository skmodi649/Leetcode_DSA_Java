package Linked_List;

class ListNode4 {
      int val;
      ListNode4 next;
      ListNode4() {}
      ListNode4(int val) { this.val = val; }
      ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
  }

public class Removing_Duplicates {
    public ListNode4 deleteDuplicates(ListNode4 head) {
        if(head==null || head.next==null)
            return head;
        ListNode4 temp = head;
        while(temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}
