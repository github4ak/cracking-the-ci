package chapter_4;

public class ctci_4_8 {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(5);
		root.right = new TreeNode(10);
		root.left.left = new  TreeNode(3);
		root.left.right = new TreeNode(6);
		root.left.left.left =  new TreeNode(15);
		root.left.left.right = new TreeNode(19);
		
		System.out.println("The common ancestor is "+findCommonAncestor(root,6,15));
		
	}

	private static Integer findCommonAncestor(TreeNode root, int i, int j) {
		if(!covers(root,i) || !covers(root,j)) {
			return null;
		}
		
		return findCommonAncestorHelper(root,i,j);
	}

	private static Integer findCommonAncestorHelper(TreeNode root, int i, int j) {
		if(root == null || root.data == i || root.data == j) {
			return root.data; //Exception possible
		}
		
		boolean iIsOnLeft = covers(root.left,i);
		boolean jIsOnLeft = covers(root.left,j);
		
		if(iIsOnLeft != jIsOnLeft) {
			return root.data;
		}
		
		TreeNode childNode = iIsOnLeft ? root.left : root.right;
		
		return findCommonAncestorHelper(childNode,i,j);
	}

	private static boolean covers(TreeNode root, int i) {
		if(root == null) {
			return false;
		}
		else if(root.data == i){
			return true;
		} else {
			return covers(root.left,i) || covers(root.right,i);
		}
	}
}
