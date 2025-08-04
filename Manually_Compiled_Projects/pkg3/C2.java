package pkg3;

public class C2 {
	public static void main(String[] args) {
		String word = "FunWithProgramming";
		int len1 = word.length();
		//Working code
		for(int i = 0; i<len1; i++) {
			String clip = word.substring(0,i+1);
			System.out.println(clip);
		}
	
		for(int i = len1; i>0; i--) {
			String clip = word.substring(0,i-1);
			System.out.println(clip);
		}
	}
}
