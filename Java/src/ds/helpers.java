package ds;

public class helpers {
	public static LinkedListNode arrayToLinkedList(int [] arr){
		LinkedListNode head = new LinkedListNode(arr[0]);
		LinkedListNode curr = head;
		for(int i: arr){
			curr = new LinkedListNode(arr[i], null, curr); //d, next, prev
		}
		return head;
	}

}
