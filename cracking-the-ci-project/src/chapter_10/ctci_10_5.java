package chapter_10;

public class ctci_10_5 {

	public static void main(String[] args) {
		String strings[] = {"apple","","","","ball","","","","cat","","",""};
		String str = "cat";
		
		System.out.println("Item "+str+" is at location "+mbs(strings,str));
	}
	
	static int mbs(String strings[],String str) {
		//Base checks - good to perform these, before committing to a recursive procedure
		if(strings == null || str == null || str == "") {
			return -1;
		}
		
		return mbs(strings,str,0,strings.length - 1);
	}
	
	static int mbs(String strings[],String str,int first,int last) {
		
		int mid = (first + last)/2;
		
		if(strings[mid].equalsIgnoreCase(str)) {
			return mid;
		}
		
		if(strings[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			//search until the bounds of the array
			while(true) {
				if(left<first && right>last) {
					return -1;
				}
				else if(left>=first && !strings[left].isEmpty()) {
					mid = left;
					break;
				}
				else if(right<=last && !strings[right].isEmpty()) {
					mid = right;
					break;
				}
				left--;
				right++;
			}
		}
		
		if(strings[mid].equalsIgnoreCase(str)) {
			return mid;
		}
		else if(strings[mid].compareToIgnoreCase(str)<0) {
			return mbs(strings,str,mid+1,last);
		}
		else {
			return mbs(strings,str,first,mid-1);
		}
		
	}
	

}
