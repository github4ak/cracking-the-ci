package chapter_04;

import java.util.Random;

public class ctci_4_11 {
	//No main method - this code is inspired from the solutions.
}

class Tree{
	TreeNodeMod root = null;
	
	public int size() {
		return root == null ? 0 : root.size();
	}
	
	public TreeNodeMod getRandomNode() {
		if(root == null) {
			return null;
		}
		
		Random  random = new Random();
		int i = random.nextInt(size());
		return root.getIthNode(i);
	}
	
	public void InsertInOrder(int value) {
		if(root == null) {
			root = new TreeNodeMod(value);
		} else {
			root.insertInOrder(value);
		}
	}
}


class TreeNodeMod{
	private int size;
	private int data;
	public TreeNodeMod right;
	public TreeNodeMod left;
	
	TreeNodeMod(int d){
		d = data;
		size = 1;
	}
	
	public void insertInOrder(int value) {
		if(value <= data) {
			if (left == null) {
				left = new TreeNodeMod(value);
			} else {
				left.insertInOrder(value);
			}
		} else {
			if(right == null) {
				right = new TreeNodeMod(value);
			} else {
				right.insertInOrder(value);
			}
		}
	}

	public TreeNodeMod getIthNode(int i) {
		int leftSize = left == null ? 0 : left.size();
		if(i <  leftSize) {
			return  left.getIthNode(i);
		} else if(i == leftSize) {
			return this;
		} else {
			return right.getIthNode(i - (leftSize+1));
		}
	}
	
	public TreeNodeMod find(int d) {
		if(d == data) {
			return this;
		} else if(d < data) {
			return left != null ? left.find(d) :  null;
		} else if(d > data) {
			return right != null ? right.find(d) : null;
		}
		return null;
	}
	

	public int size() {
		return size;
	}
	
	public int data() {
		return data;
	}
}
