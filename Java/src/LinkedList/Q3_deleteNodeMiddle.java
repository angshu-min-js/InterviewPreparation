package LinkedList;

import ds.LinkedListNode;
import ds.helpers;

public class Q3_deleteNodeMiddle {
	public static boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null)
			return false;
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}

	public static void main(String[] args) {
		LinkedListNode head = helpers.randomLinkedList(10, 1, 20);
		System.out.println(head.printForward());
		deleteNode(head.next);
		System.out.println(head.printForward());
	}
}
