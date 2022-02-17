// ************ Own devised algorithm for rotating the linked list at given pivot ***************


package Linked_List;

import java.util.ArrayList;
import java.util.List;

class LISTNODE {
      int val;
      LISTNODE next;
      LISTNODE() {}
      LISTNODE(int val) { this.val = val; }
      LISTNODE(int val, LISTNODE next) { this.val = val; this.next = next; }
  }

public class Rotate_List {
    public LISTNODE rotateRight(LISTNODE head, int k) {
        if(head == null || head.next == null)
            return head;
        int len = 0;
        List<Integer> list = new ArrayList<>();
        LISTNODE temp = head;
        while(temp != null){
            len++;
            list.add(temp.val);
            temp = temp.next;
        }
        k = k % len;
        k = len - k;
        List<Integer> res = new ArrayList<>();
        for(int i = k ; i < len ; i++)
            res.add(list.get(i));
        for(int j = 0 ; j < k ; j++)
            res.add(list.get(j));
        LISTNODE tempa = head;
        int counter = 0;
        while(tempa != null){
            tempa.val = res.get(counter);
            counter++;
            tempa = tempa.next;
        }
        return head;
    }
}
