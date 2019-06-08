
public class Test1Java {
	public static void main (String[] args)
	{
		String [] s= {"apple","bat","cat"};
		int len =s.length;
		System.out.println("length is" + "  "+len);
		int rand1=(int)(Math.random()*len);
		System.out.println(rand1);
		//int rand1 = (int) (Math.random() * oneLength);
		// now build a phrase
		//String phrase = wordListOne[rand1] + “ “ + wordListTwo[rand2] + “ “ + wordListThree[rand3];
		
		String phrase = s[rand1];
		System.out.println(phrase);
	}

}
