package chapter_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ctci_4_3 {
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(9);
		root.right = new TreeNode(10);
		root.left.left = new  TreeNode(11);
		root.left.right = new TreeNode(13);
		root.right.left =  new TreeNode(15);
		root.right.right = new TreeNode(19);
		
		ArrayList<LinkedList<TreeNode>> result = createLevelLinkedList(root);
		
		printLevelLinkedList(result);
	}
	
	private static void printLevelLinkedList(ArrayList<LinkedList<TreeNode>> result) {
		for(LinkedList<TreeNode> lists : result) {
			for(TreeNode node : lists) {
				System.out.print(node.data+" ");
			}
			System.out.println();
		}
	}

	private static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<>();
		if(root!=null) {
			current.add(root);
		}
		
		while(!current.isEmpty()) {
			result.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			
			for(TreeNode node : parents) {
				if(node.left != null) {
					current.add(node.left);
				}
				if(node.right != null) {
					current.add(node.right);
				}
			}
		}
		
		return result;
	}

}
