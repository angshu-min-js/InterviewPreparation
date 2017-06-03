package LinkedList;

import ds.LinkedListNode;
import ds.helpers;

public class PrintKthtoLast {
	public static int printKthA(LinkedListNode n, int k){
		if(n==null) return 0;
		int index = printKthA(n.next, k)+1; //stack of linkedlist
		if(index==k)
		System.out.println(k+" th to the last is "+n.data);
		return index;		
	}
	
	public static int printKthB(){
		return 0;
	}
	public static int printKthC(){
		return 0;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		LinkedListNode head = helpers.arrayToLinkedList(arr);
		System.out.println(printKthA(head, 2)+" is the size of the linkedList");
		
	}
}
