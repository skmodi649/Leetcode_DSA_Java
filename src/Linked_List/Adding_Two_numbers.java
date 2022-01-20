/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */




package Linked_List;

class ListNode {
      int val;
      listnode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, listnode next) { this.val = val; this.next = next; }
  }

public class Adding_Two_numbers {
    public listnode addTwoNumbers(listnode l1, listnode l2) {

        listnode dummyHead = new listnode(0);
        listnode p = l1;
        listnode q = l2;
        listnode current = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            current.next = new listnode(sum % 10);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            current.next = new listnode(carry);
        }
        return dummyHead.next;
    }
}
