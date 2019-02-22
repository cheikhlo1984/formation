package binarytree;

import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args)
	{
		PreOrderTraversal bi=new PreOrderTraversal();
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();
		System.out.println("Using Recursive solution:");
 
		bi.preOrderRecursive(rootNode);
 
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Using Iterative solution:");
 
		bi.preOrderIterative(rootNode);
	}
	
	//Recursive solution
	public void preOrderRecursive(TreeNode root) {
		if (root != null) {
			System.out.printf("%d", root.data);
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
	}
	
	//Iterative solution
	public void preOrderIterative(TreeNode root) {
		if (root == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode n = stack.pop();
			System.out.printf("%d", n.data);
			
			if (n.right != null) {
				stack.push(n.right);
			}
			if (n.left != null) {
				stack.push(n.left);
			}
		}
		
	}
	
	public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
}
