package chapter_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ctci_5_3 {
	
	
	
	public static void main(String args[]) {
		int ip = 1135;
		char[] binchar = convertToCharacterArray(ip);
		Set<Integer> zeropositions = new HashSet<Integer>();
		zeropositions = getZeroPositions(binchar);
		Iterator<Integer> it = zeropositions.iterator();
		int maxLength = 0;
		while(it.hasNext()) {
			int temp = getMaxlength(it.next(),binchar);
			if(temp > maxLength) {
				maxLength = temp;
			}
		}
		System.out.println("Longest 1's Sequence is "+maxLength);
	}

	private static int getMaxlength(Integer position, char[] binchar) {
		char[] temp = binchar;
		temp[position] = '1';
		int onelength = 0;
		int currmax = 0;
		for(char c : temp) {
			if(c == '1') {
				onelength++;
			}
			else {
				if(onelength > currmax) {
					currmax = onelength;
				}
				onelength = 0;
			}
		}
		temp[position] = '0';
		return onelength > currmax ? onelength : currmax;
	}

	private static HashSet<Integer> getZeroPositions(char[] binchar) {
		Set<Integer> zeroes = new HashSet<Integer>();
		int count = 0;
		for(char c : binchar) {
			if(c == '0') {
				zeroes.add(count);
			}
			count++;
		}
		return (HashSet<Integer>) zeroes;
	}

	private static char[] convertToCharacterArray(int ip) {
		String binstring = Integer.toBinaryString(ip);
		return binstring.toCharArray();
	}

}
