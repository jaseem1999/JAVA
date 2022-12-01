package module2.string1;

public class string1 {
	public static void main(String[] args) {
		System.out.println("STRING");
		String s1 = "Java";
		String s3 = "Java is language";
		//chartAt
		System.out.println("CahrtAt 1st elment = "+s1.charAt(1));//Checking the string array 
		String s2 = "Python";
		//ComapreTO
		System.out.println("CompareTo 2 Strings = "+ s1.compareTo(s2));//Comparing the two variable returning the variable distance 
		//Contains 
		System.out.println("Contains of s1 veriable = "+s1.contains("Java"));//Checking the same value of the string 
		System.out.println("end_with checking the spelling or word = "+s3.endsWith("language"));//Checking  End with same word or spelling 
		System.out.println(" "+s1.equals(s2));//Checking the to variable are equal
		byte[] arr=s1.getBytes();//
		System.out.println(arr[0]);//Check the array bytes 
		//indexof
		System.out.println(s1.indexOf('a'));
		//length
		System.out.println(s1.length());
		//replace
		System.out.println(s1.replace('a','k'));
		//substring()
		System.out.println(s3.substring(5,16));
		char []arry2=s1.toCharArray();
		System.out.println(arry2[0]);
		System.out.println(s1.toLowerCase());
		String s5 = "     Java is programming language      ";
		System.out.println(s5.trim());
	}
}
