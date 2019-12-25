package chapter_4;

public class ctci_4_4 {
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(9);
		root.right = new TreeNode(10);
		root.left.left = new  TreeNode(11);
		root.left.right = new TreeNode(13);
		//root.left.left.left =  new TreeNode(15);
		//root.left.left.right = new TreeNode(19);
		
		System.out.println("Is it balanced? "+isBalanced(root));
	}

	private static boolean isBalanced(TreeNode node) {
		if(node == null) {
			return true;
		}
		else {
			int heightdiff = getHeight(node.left) - getHeight(node.right);
			if(Math.abs(heightdiff) > 1) {
				return false;
			}
			else {
				return isBalanced(node.left) && isBalanced(node.right);
			}
		}
	}

	private static int getHeight(TreeNode node) {
		if(node == null) {
			return -1; //Imp: The height of the root is considered as -1
		}
		else {
			return Math.max(getHeight(node.left), getHeight(node.right))+1;
		}
	}

}
