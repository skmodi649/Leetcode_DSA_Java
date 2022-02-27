package Linked_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3() {}
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
}



public class Nodes_between_Critical_Point {
    public int[] nodesBetweenCriticalPoints(ListNode3 head) {
        int[] arr = {-1 ,-1};
        if(head.next.next == null)
            return arr;
        if(head.next.next.next == null)
            return arr;
        ListNode3 prev = head;
        ListNode3 current = prev.next;
        ListNode3 front = current.next;
        int counter = 2;
        int[] ans = new int[2];
        List<Integer> index = new ArrayList<>();
        while(current.next != null){
            if(current.val > prev.val && current.val > front.val)
                index.add(counter);
            if(current.val < prev.val && current.val < front.val)
                index.add(counter);
            prev = prev.next;
            current = prev.next;
            front = current.next;
            counter++;
        }
        if(index.size() < 2)
            return arr;
        Collections.sort(index);
        ans[1] = index.get(index.size() - 1) - index.get(0);
        int diff = 99999;
        for(int j = 0 ; j < index.size() - 1 ; j++){
            int value = index.get(j+1) - index.get(j);
            if(value < diff)
                diff = value;
        }
        ans[0] = diff;
        return ans;
    }
}
