package chapter_4;

/*
 * Imp: Note we need to have two sub-routines - one to traverse T1 isSubtree and one to match - matchTree
 */
public class ctci_4_10 {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(10);
		root.left =  new  TreeNode(8);
		root.right = new TreeNode(14);
		root.left.left =  new TreeNode(7);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(12);
		root.right.right =  new TreeNode(15);
		
		TreeNode root2 = new TreeNode(14);
		root2.left = new TreeNode(12);
		root2.right =  new TreeNode(15);
		
		System.out.println("Does T1 contain T2? "+containsTree(root,root2));
		
	}

	private static boolean containsTree(TreeNode root, TreeNode root2) {
		if(root2 == null) {
			return true;
		}
		else {
			return isSubTree(root,root2);
		}
	}

	private static boolean isSubTree(TreeNode root, TreeNode root2) {
		if(root == null) {
			return false;
		}
		else if(root.data == root2.data && matchTree(root,root2)) {
			return true;
		}
		return isSubTree(root.left,root2) || isSubTree(root.right,root2);
		
	}

	private static boolean matchTree(TreeNode root, TreeNode root2) {
		if(root == null && root2 == null) {
			return true;
		}
		else if(root == null || root2 == null) {
			return false;
		}
		else if(root.data != root2.data) {
			return false;
		}
		else {
			return matchTree(root.left,root2.left) && matchTree(root.right,root2.right);
		}
	}

}
