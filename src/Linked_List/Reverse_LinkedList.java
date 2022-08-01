package Linked_List;
class ListNodeR {
      int val;
      ListNodeR next;
      ListNodeR() {}
      ListNodeR(int val) { this.val = val; }
      ListNodeR(int val, ListNodeR next) { this.val = val; this.next = next; }
  }

public class Reverse_LinkedList {
    public ListNodeR reverseList(ListNodeR head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNodeR secondElem = head.next;

        head.next = null;

        // Now reversing everything from the second element onwards

        ListNodeR reverseRest = reverseList(secondElem);

        // Now just joining the two lists

        secondElem.next = head;

        return reverseRest;

    }
}
