package chapter_05;

import java.util.Arrays;

public class ctci_5_2 {
	public static void main(String args[]) {
		double realno = 0.5625;
		int binarr[] = new int[32];
		int filled = 0;
		
		while(realno != 1 && filled < 31) {
			if(realno < 1) {
				binarr[filled] = 0;
			}
			else {
				binarr[filled] = 1;
				realno = realno - 1;
			}
			realno = realno * 2;
			filled++;
		}
		
		if(realno ==1 && filled < 31) {
			binarr[filled] = 1;
			System.out.println(Arrays.toString(binarr));
			printbin(binarr);
		} else {
			System.out.println("ERROR");
		}
	}

	private static void printbin(int[] binarr) {
		System.out.print("0.");
		for(int i : binarr) {
			System.out.print(i);
		}	
	}

}
