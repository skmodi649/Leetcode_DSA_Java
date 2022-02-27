package Linked_List;

import java.util.ArrayList;
import java.util.List;

class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5() {}
    ListNode5(int val) { this.val = val; }
    ListNode5(int val, ListNode5 next) { this.val = val; this.next = next; }
}


public class Partition_List {
    public ListNode5 partition(ListNode5 head, int pivot) {
        List<Integer> list = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        ListNode5 temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) < pivot)
                left.add(list.get(i));
        }
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) > pivot)
                right.add(list.get(i));
        }
        int l = 0 , r = 0;
        for(int a = 0 ; a < list.size() ; a++){
            if(list.get(a) < pivot){
                ans.add(list.get(a));
            }
        }
        for(int a = 0 ; a < list.size() ; a++){
            if(list.get(a) >= pivot){
                ans.add(list.get(a));
            }
        }
        ListNode5 tempa = head;
        for(int c = 0 ; c < ans.size() ; c++){
            tempa.val = ans.get(c);
            tempa = tempa.next;
        }
        return head;
    }
}
