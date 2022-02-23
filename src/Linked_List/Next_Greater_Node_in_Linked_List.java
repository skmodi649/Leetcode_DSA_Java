//Concept of Monotonic stack has been used
// A monotonic stack is one in which the values are in the increasing order



package Linked_List;

import java.util.ArrayList;
import java.util.Stack;


class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
  }


public class Next_Greater_Node_in_Linked_List {
    public int[] nextLargerNodes(ListNode2 head) {
        // Using the concept of monotonic stack in which the elements are stored in the
        // increasing order

        //traverse the linkedlist to array
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        //initalize a monotonic stack
        Stack<Integer> s = new Stack<Integer>();
        int ans[] = new int[arr.size()];
        //traverse from upperbound tp lowerbound
        for(int i=arr.size()-1;i>=0;i--){
            while((!s.isEmpty())&&(s.peek()<=arr.get(i))){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = s.peek();
            }
            s.push(arr.get(i));
        }
        return ans;
    }
}
