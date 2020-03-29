package chapter_01;

public class ctci_1_9 {
	public static void main(String args[]) {
		String a = "waterbottle";
		String b = "erbottlewat";
		
		System.out.println("Is "+a+" is a rotation of "+b+" ? "+isRotation(a,b));
	}
	
	private static boolean isRotation(String a,String b) {
		return (b+b).contains(a);
	}
}
