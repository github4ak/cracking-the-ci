package chapter_01;

/* Add extra code to clear the last spaces */

public class ctci_1_3 {
	
	public static void main(String args[]) {
		String a = "Mr John Smith      ";
		char carr[] = a.toCharArray();
		int count = 0;
		char lastchar = 0;
		
		for(int i = carr.length-1;i>=0;i--) {
			if(carr[i] != ' ') {
				lastchar =  carr[i];
				break;
			}
		}
		
		for(char c:carr) {
			if(c == ' ') {
				count++;
			}
		}
		
		int index = carr.length + 2*count;
		
		char newcarr[] = new char[index];
		
		for(int i = carr.length-1;i>=0;i--) {
			if(carr[i]==' ') {
				newcarr[index-1] = '0';
				newcarr[index-2] = '2';
				newcarr[index-3] = '%';
				index = index -  3;
			} else {
				newcarr[index-1] = carr[i];
				index--;
			}
		}
		
		int j;
		
		for(j = newcarr.length-1;j>=0;j--) {
			if(newcarr[j] == lastchar) {
				break;
			}
		}
		
		String urlify = String.valueOf(newcarr);
		
		System.out.println(urlify.substring(0,j+1));

	}

}
