package chapter_8;

import java.util.ArrayList;
import java.util.Iterator;

public class ctci_8_4 {
	
	static ArrayList<ArrayList<Integer>> findSubsets(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		
		int max = 1 << set.size();
		
		for(int j = 0 ; j <  max ; j++) {
			ArrayList<Integer> subset = binaryToSet(j);
			allsubsets.add(subset);
		}
		
		return allsubsets;
	}
	
	static ArrayList<Integer> binaryToSet(int num) {
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int index = 0;
		// L -> R binary number : To remember
		for(int k = num ; k >0 ; k>>=1) {
			if((k & 1) == 1) {
				subset.add(index);
			}
			index++;
		}
		return subset;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<>();
		for(int i=0; i <5;i++) {
			set.add(i);
		}
		
		ArrayList<ArrayList<Integer>> subsets = findSubsets(set);
		
		Iterator<ArrayList<Integer>> it = subsets.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
