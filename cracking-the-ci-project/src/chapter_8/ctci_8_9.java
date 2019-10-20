package chapter_8;

import java.util.*;

public class ctci_8_9 {
	
	private static Set<String> printParens(int count){
		Set<String> parens = new HashSet<>();
		if(count == 0) {
			parens.add("");
			return parens;
		} else {
			Set<String> prev =  printParens(count-1);
			for(String str : prev) {
				for(int i=0; i< str.length(); i++) {
					if(str.charAt(i) == '(') {
						String s = addParens(str,i);
							parens.add(s);
					}
				}
				parens.add("()"+str);
			}
		}
		
		return parens;
	}
	
	private static String addParens(String str,int i) {
		String start = str.substring(0,i+1);
		String end = str.substring(i+1);
		return start + "()" + end;
	}
	
	
	public static void main(String args[]) {
		int no_of_parenthesis = 3;
		System.out.println("The possible combinations of parenthesis are ");
		Set<String> parens = printParens(no_of_parenthesis);
		
		Iterator<String> it = parens.iterator();
		int i = 1;
		while(it.hasNext()) {
			System.out.println(i+"."+it.next());
			i++;
		}
	}

}
