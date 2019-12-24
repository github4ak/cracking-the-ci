package chapter_4;

public class ctci_4_2 {
	
	public static void main(String args[]) {
		int arr[] = {2,3,5,7,9,10,13};
		TreeNode root = null;
		root = 	buildBST(arr,0,arr.length - 1);
		printPreOrder(root);
	}
	
	private static TreeNode buildBST(int arr[],int low,int high) {
		if(low > high) {
			return null;
		} else {
			int mid = (high+low)/2;
			TreeNode root = new TreeNode(arr[mid]);
			root.left = buildBST(arr,low,mid-1); //Imp: Not to include mid in any of sub-array calculations
			root.right = buildBST(arr,mid+1,high);
			return root;
		}
	}
	
	private static void printPreOrder(TreeNode node) {
		if(node != null) {
			System.out.println(node.data);
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}

}

class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int value){
		data = value;
		this.left = null;
		this.right = null;
	}
}
