package ds;

import java.util.LinkedList;

import sun.awt.image.ImageWatched.Link;

public class helpers {
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	public static LinkedListNode arrayToLinkedList(int [] arr){
		//System.out.println(arr[0]);
		LinkedListNode head = new LinkedListNode(arr[0]);
		LinkedListNode curr = head;
		for (int i = 1; i < arr.length; i++){
			curr = new LinkedListNode(arr[i], null, curr); //d, next, prev
		}
		return head;
	}
	
	public static LinkedListNode randomLinkedList(int n, int min, int max){
		LinkedListNode head = new LinkedListNode(randomIntInRange(min, max));
		LinkedListNode prev = head;
		for(int i =1; i< n; i++){
			int data = randomIntInRange(min, max);
			LinkedListNode next = new LinkedListNode(data);
			prev.setNext(next);
			prev = next;
		}
		return head;
		
	}

}
