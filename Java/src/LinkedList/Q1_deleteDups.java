package LinkedList;
import java.util.HashSet;

import ds.LinkedListNode;
public class Q1_deleteDups { //Time O(n), Space O(n)
	public static void deleteDupsA(LinkedListNode n){
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev = null;
		while(n!=null){
			if(set.contains(n.data))
				prev.next = n.next;
			else{
				set.add(n.data);
				prev  = n;
			}
			n = n.next;
		}
	}
	
	public static void deleteDupsB(LinkedListNode n){ //Time O(n^2), Space O(1)
		LinkedListNode curr  = n;
		while(curr!=null){
			LinkedListNode runner = curr;
			while(runner.next !=null){
				if(runner.next.data==curr.data){
					runner.next=runner.next.next;
				}
				else
					runner = runner.next;
			}
			curr = curr.next;
		}
	}
	public static void main(String []args){
		LinkedListNode first = new LinkedListNode(0);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i%2);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println("LinkedList: "+head.printForward());
		//deleteDupsA(head);
		deleteDupsB(head);
		//System.out.println("With Buffer: "+head.printForward());
		System.out.println("Without Buffer: "+head.printForward());
	}
}
