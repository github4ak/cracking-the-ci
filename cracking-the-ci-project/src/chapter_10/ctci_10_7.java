package chapter_10;

import java.util.Arrays;

/*This is a small example of using bit-vectors.
 * This questions deals with integer range, representing them as bool values
 * of a bit-vector,  and finding the first non-entered bit-value
 * 2nd Part deals with using 1000 size blocks and finding the non-entered values in 
 * two passes.
 * a) First pass - find the chunk with less than 1000 size,
 * b) Second pass - In that chunk, find the missing element.
 */

public class ctci_10_7 {
	
	public static void main(String args[]) {
	
	byte[] bitfield = new byte[20];
    
    System.out.println(Arrays.toString(bitfield));
    
    int n = 10;
    
    bitfield[n/8] |= 1 << (n%8);
    
    //Try to understand the output, 0-7, then 8,9, 10th position there is a 1, which is 4
    System.out.println(Arrays.toString(bitfield));
    
 }

}
