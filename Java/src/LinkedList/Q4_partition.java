package LinkedList;

import ds.LinkedListNode;

public class Q4_partition {
	static LinkedListNode partitionA(LinkedListNode n, int x){
		LinkedListNode head = n;
		LinkedListNode tail = n;
		
		while(n!=null){
			LinkedListNode next = n.next;
			//System.out.println(n.data);
			if(n.data<x){
			n.next = head;
			head = n;
			//System.out.println(head.data);
			}
			else{
				tail.next = n;
				tail = n;
				//System.out.println(tail.data);
			}
			n=next;
		}
		tail.next = null;
		return head;
	}
	static LinkedListNode partitionB(LinkedListNode n, int x){
		LinkedListNode head = n;
		LinkedListNode tail = n;
		while(tail!=null){
			if(tail.data<x){
				LinkedListNode temp = tail.next;
				tail.next = temp.next;
				temp.next = head;
				head = temp;
			}
			tail = tail.next;
		}
		//tail.next =  null;
		return head;
	}
		public static void main(String[] args) {
			/* Create linked list */
			int[] vals = {44,22,5,2,11};
			LinkedListNode head = new LinkedListNode(vals[0], null, null);
			LinkedListNode current = head;
			for (int i = 1; i < vals.length; i++) {
				current = new LinkedListNode(vals[i], null, current);
			}
			System.out.println(head.printForward());
			
			/* Partition */
			LinkedListNode h = partitionB(head, 5);
			
			/* Print Result */
			System.out.println(h.printForward());
		}

	}

