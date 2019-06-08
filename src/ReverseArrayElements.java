
public class ReverseArrayElements {
	public static void main (String[] args) {
		String  name = "Neha Malik";
		String newName = name.substring(0,2);
		//System.out.println(newName);
		String UpCase = name.toUpperCase();
		System.out.println(UpCase);
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		//trim method eliminates White spaces
		String T1 = name.trim();
		System.out.println(T1);
		
		//Starts with method prints boolean
		
		boolean SA = name.startsWith("Ne");
		System.out.println(SA);
		
		//using cahrAT() method : returns character at a specified position
		
		char NM = name.charAt(3);
		System.out.println(NM);
		
		//using string length method
		
		System.out.println(name.length());
		
		
		//using valueOf method
		int N1=10;
		String V1 = name.valueOf(N1);
		System.out.println(V1+20);
		
		//The string replace() method replaces all occurrence of first 
		//sequence of character with second sequence of character.
		String s1="Java is a programming language. Java is a platform. Java is an Island.";  
		String s2 = s1.replace("Java", "kava");
		System.out.println(s2);
		
		
		//string buffer methods 
		
		StringBuffer sb=new StringBuffer ("JAVA ");
		sb.append("main");
		System.out.println(sb);
		sb.insert(1, "23");
		System.out.println(sb);
		sb.replace(1, 3, "Han");
		System.out.println(sb);
		
		StringBuffer Rp = new StringBuffer("Hanu");
		Rp.reverse();
		System.out.println(Rp);
		

		
	}

}
