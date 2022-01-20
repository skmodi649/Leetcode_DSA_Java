/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Difficulty : Medium
Remarks : Fully designed algorithm
 */





package Linked_List;

class listnode {
      int val;
      listnode next;
      listnode() {}
      listnode(int val) { this.val = val; }
      listnode(int val, listnode next) { this.val = val; this.next = next; }
  }

public class Remove_Node {
    public listnode removeNthFromEnd(listnode head, int n) {
        int len = 0;
        listnode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int k = len - n + 1;
        listnode behind = head;
        listnode ahead = head.next;
        if(len == 1){
            head = null;
            return head;
        }
        else if(k == 1){
            listnode tempa = head;
            head = head.next;
            return head;
        }
        else if(k == 2){
            listnode tempa = head;
            listnode tempaa = head.next;
            tempa.next = tempaa.next;
            return head;
        }
        else{
            while(k > 2){
                behind = behind.next;
                ahead = ahead.next;
                k--;
            }
            behind.next = ahead.next;
            return head;
        }
    }
}
