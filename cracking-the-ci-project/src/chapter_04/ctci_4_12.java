package chapter_04;

/*
 * Implemented the brute force approach - didn't do the hash table running sums approach
 * Solutions with more than one recursive functions seem hard to nail
 */


public class ctci_4_12 {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(10);
		root.left =  new  TreeNode(8);
		root.right = new TreeNode(14);
		root.left.left =  new TreeNode(7);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(12);
		root.right.right =  new TreeNode(1);
		
		int targetSum = 25;
		
		System.out.println("Total number of paths with targetSum "+targetSum+" are "+countPathsWithSum(root,targetSum));
	}

	private static int countPathsWithSum(TreeNode node, int targetSum) {
		if(node == null) {
			return 0;
		}
		
		int pathsFromRoot = countPathWithSumFromNode(node,targetSum,0);
		
		int pathsFromLeft = countPathsWithSum(node.left,targetSum);
		
		int pathsFromRight = countPathsWithSum(node.right,targetSum);
		
		return pathsFromRoot +  pathsFromLeft + pathsFromRight;
		
		
	}

	private static int countPathWithSumFromNode(TreeNode node, int targetSum, int currentSum) {
		if(node == null) {
			return 0;
		}
		
		currentSum += node.data;
		
		int totalPaths = 0;
		
		if(currentSum == targetSum) {
			totalPaths++;
		}
		
		totalPaths += countPathWithSumFromNode(node.left,targetSum,currentSum);
		totalPaths += countPathWithSumFromNode(node.right,targetSum,currentSum);
		
		return totalPaths;
	}
	
	
}
