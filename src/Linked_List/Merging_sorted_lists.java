package Linked_List;

import java.util.ArrayList;
import java.util.Collections;

class Listnode {
      int val;
      Listnode next;
      Listnode() {}
      Listnode(int val) { this.val = val; }
      Listnode(int val, Listnode next) { this.val = val; this.next = next; }
  }

public class Merging_sorted_lists {
    public Listnode mergeTwoLists(Listnode list1, Listnode list2) {
        if(list1 == null && list2 == null)
            return list1;
        if(list1 == null && list2 != null)
            return list2;
        if(list2 == null && list1 != null)
            return list1;
        ArrayList<Integer> list = new ArrayList<>();
        Listnode temp1 = list1;
        Listnode temp2 = list2;
        int n1 = 0 , n2 = 0;
        while(temp1 != null){
            list.add(temp1.val);
            temp1 = temp1.next;
            n1++;
        }
        while(temp2 != null){
            list.add(temp2.val);
            temp2 = temp2.next;
            n2++;
        }
      /*  if((n1 + n2) == 0){
            return list1;
        }
        if(n1 == 0 && n2 != 0){
            return list2;
        }
        if(n2 == 0 && n1 != 0){
            return list1;
        } */
        Collections.sort(list);
        int i = 0;
        Listnode temp = list1;
        while(temp.next != null){
            temp.val = list.get(i);
            i++;
            temp = temp.next;
        }
        temp.next = list2;
        while(temp != null){
            temp.val = list.get(i);
            i++;
            temp = temp.next;
        }
        return list1;
    }
}




/*
OPTIMISED SOLUTION :


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                prev.next = temp1;
                temp1 = temp1.next;
            } else {
                prev.next = temp2;
                temp2 = temp2.next;
            }
            prev = prev.next;
        }

        if (temp1 == null) {
            prev.next = temp2;
        } else if (temp2 == null) {
            prev.next = temp1;
        }

        return prehead.next;
    }
}
 */
