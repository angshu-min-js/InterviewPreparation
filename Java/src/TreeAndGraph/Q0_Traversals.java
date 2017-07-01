package TreeAndGraph;

import ds.TreeNode;
/* DFS */
public class Q0_Traversals {
	public static void visit(TreeNode node){
		if(node!=null) System.out.println(node.data);
	}
	public static void inOrderTraversal(TreeNode node){
		if(node!=null){
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}
	public static void preOrderTraversal(TreeNode node){
		if(node!=null){
			visit(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	public static void postOrderTraversal(TreeNode node){
		if(node!=null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			visit(node);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,4,3,2,7,5,6};
		TreeNode root = TreeNode.createMinimalBST(arr);
		root.print();
		postOrderTraversal(root);
		
	}
}
