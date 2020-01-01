package chapter_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class ctci_4_9 {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(10);
		root.left =  new  TreeNode(8);
		root.right = new TreeNode(14);
		root.left.left =  new TreeNode(7);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(12);
		root.right.right =  new TreeNode(15);
		
		ArrayList<LinkedList<Integer>> bstSeq = allBstSequence(root);
		
		printBstSeq(bstSeq);
	}

	private static void printBstSeq(ArrayList<LinkedList<Integer>> bstSeq) {
		int count = 1;
		for(LinkedList<Integer> lists : bstSeq ) {
			System.out.print(count+". ");
			for(Integer listItem : lists) {
				System.out.print(listItem+"-");
			}
			System.out.println();
			count++;
		}
		
	}

	private static ArrayList<LinkedList<Integer>> allBstSequence(TreeNode node) {
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		if(node == null) {
			result.add(new LinkedList<Integer>());
			return result;
		}
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(node.data);
		
		ArrayList<LinkedList<Integer>> leftSeq = allBstSequence(node.left);
		ArrayList<LinkedList<Integer>> rightSeq = allBstSequence(node.right);
		
		for(LinkedList<Integer> l : leftSeq) {
			for(LinkedList<Integer> r : rightSeq) {
				ArrayList<LinkedList<Integer>> weaved = new  ArrayList<LinkedList<Integer>>();
				weaveLists(l,r,weaved,prefix);
				result.addAll(weaved);
			}
		}
		
		return result;
	}

	private static void weaveLists(LinkedList<Integer> left, LinkedList<Integer> right, ArrayList<LinkedList<Integer>> weaved,
			LinkedList<Integer> prefix) {
		
		if(left.size() == 0 || right.size() == 0) {
			LinkedList<Integer> prefixCloned = (LinkedList<Integer>) prefix.clone();
			prefixCloned.addAll(left);
			prefixCloned.addAll(right);
			weaved.add(prefixCloned);
			return;
		}
		
		int leftFirst = left.removeFirst();
		prefix.addLast(leftFirst);
		weaveLists(left,right,weaved,prefix);
		prefix.removeLast();
		left.addFirst(leftFirst);

		int rightFirst = right.removeFirst();
		prefix.addLast(rightFirst);
		weaveLists(left,right,weaved,prefix);
		prefix.removeLast();
		right.addFirst(rightFirst);
		
	}
	
	

}
