package com.problems;

public class AddTwoNumbers2 {




public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode res = new ListNode();
    ListNode temp = res;
    int carry = 0;
    int sum = 0;
    while(l1!=null || l2 !=null) {
    	if(l1!=null) {
    		sum = l1.val;
    		l1 = l1.next;
    	}
    		
    	if(l2!=null) {
    		sum = sum + l2.val;
    		l2 = l2.next;
    	}
    	sum = sum + carry;
    	if(sum>=10) {
    		carry = sum/10;
    		sum = sum%10;
    	} else {
    		carry = 0;
    	}
    	temp.next = new ListNode(sum);//
    	temp = temp.next;
    	sum = 0;	
    		
    }
    
	if(carry == 1) {
		temp.next = new ListNode(carry);
	}
    
    return res.next;
}
}