package chapter_4;

public class ctci_4_5 {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(5);
		root.right = new TreeNode(10);
		root.left.left = new  TreeNode(3);
		root.left.right = new TreeNode(6);
//		root.left.left.left =  new TreeNode(15);
//		root.left.left.right = new TreeNode(19);
		
		System.out.println("Is it BST? "+checkIfBst(root));
	}
	
	private static boolean checkIfBst(TreeNode node) {
		return checkIfBst(node,null,null);
	}
	
	//Imp: Can't compare int with null, need Integer
	private static boolean checkIfBst(TreeNode node,Integer min,Integer max) {
		if(node == null) {
			return true;
		}
		
		if((min != null && node.data < min) || (max !=null && node.data > max)) {
			return false;
		}
		
		if(!checkIfBst(node.left,min,node.data) || !checkIfBst(node.right,node.data,max)) {
			return false;
		}
		
		return true;
	}
}
