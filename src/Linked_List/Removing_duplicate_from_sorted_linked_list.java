package Linked_List;
import java.util.HashMap;
class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
  }

public class Removing_duplicate_from_sorted_linked_list {
    public ListNode1 deleteDuplicates(ListNode1 head) {
        if(head == null || head.next == null)
            return head;
        ListNode1 tempa = head;
        HashMap<Integer , Integer> hash = new HashMap<>();
        while(tempa != null){
            if(!hash.containsKey(tempa.val))
                hash.put(tempa.val , 1);
            else
                hash.put(tempa.val , hash.get(tempa.val)+1);
            tempa = tempa.next;
        }
        ListNode1 temp = head;
        ListNode1 prev = head;
        while(temp!=null){
            if(hash.get(temp.val)>=2){
                if(temp==head){
                    head = head.next;
                    prev = prev.next;
                }else{
                    deleteNode(temp,prev);
                }
            }else{
                if(temp!=head){
                    prev = prev.next;
                }
            }
            temp = temp.next;
        }
        return head;
    }
    public static void deleteNode(ListNode1 head,ListNode1 prev){
        prev.next = head.next;
    }
}
