package module2.ajk.assignment;
//Write a program to print reverse a of a string word by word
public class Reverse {

	public static void main(String[] args) {
		String[] word = {"I ","am ","a ","developer "};
		String before="";
		for (int i = 0; i < word.length; i++) {
			before += word[i];
		}
		System.out.println("Before reverse");
		System.out.println(before);
		String rev = "";
		for (int i = word.length-1; i > 0-1; i--) {
			rev += word[i];
		}
		System.out.println("Reverse words");
		System.out.println(rev);
		
	
	}

}
