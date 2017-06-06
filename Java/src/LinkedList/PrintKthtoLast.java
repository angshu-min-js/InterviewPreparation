package LinkedList;

import sun.awt.image.ImageWatched.Link;
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
	public static class Index{
		public int value=0;
	}
	public static LinkedListNode printKthB(LinkedListNode head, int k){
		Index idx = new Index();
		return printKthB(head, k, idx);
	}
	public static LinkedListNode printKthB(LinkedListNode head, int k, Index idx){
		if(head==null)
			return null;
		LinkedListNode node = printKthB(head.next, k, idx);
		idx.value = idx.value +1;
		if(idx.value == k){
			return head;
		}
		return node;
	}
	public static LinkedListNode printKthC(LinkedListNode head, int k){
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for(int i=0;i<k;i++){
			if(p1==null)return null;
			p1=p1.next;
		}
			while(p1!=null){
				p1=p1.next;
				p2=p2.next;
			}
			return p2;
		}
	public static void main(String[] args){
		int[] arr = {1,2,3,404,5};
		LinkedListNode head = helpers.arrayToLinkedList(arr);
		System.out.println(printKthA(head, 2)); //Time: O(1), Space: O(n)
		System.out.println(printKthB(head, 2).data); //Time: O(1), Space: O(n)
		System.out.println(printKthC(head, 2).data); //Time: O(n), Space: O(1)
		
	}
}
