package ds;

public class helpers {
	public static LinkedListNode arrayToLinkedList(int [] arr){
		//System.out.println(arr[0]);
		LinkedListNode head = new LinkedListNode(arr[0]);
		LinkedListNode curr = head;
		for (int i = 1; i < arr.length; i++){
			curr = new LinkedListNode(arr[i], null, curr); //d, next, prev
		}
		return head;
	}

}
