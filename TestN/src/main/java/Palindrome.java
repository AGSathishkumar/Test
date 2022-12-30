
public class Palindrome {
	static void reverseStr(String str) {
		 char[] ch = str.toCharArray();
		 char temp;
		 int left=0, right=ch.length-1;
		 while(left<right) {			 
				 temp=ch[right];
				 ch[right--]=ch[left];
				 ch[left++]=temp;
				 
			 }
		 
		 System.out.println(ch);
		 String ch2 = ch.toString();
		 if (str.equalsIgnoreCase(ch2)) {
		      System.out.println(str + " is Palindrome");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome");
		    }
	 }
	 public static void main(String args[]) {
		 String str = "radar";
		 reverseStr(str);	 
		 
	 }

}
