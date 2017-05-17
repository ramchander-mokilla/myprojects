package strings;

public class Strings {

	public static void main(String[] args) {
		
		String strName = "Ramchander Mokilla";
		
		if(strName.contains("Mokill"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		System.out.println(strName.length());
		System.out.println(strName.substring(2, 5));
		System.out.println(strName.trim());
		System.out.println(strName.endsWith("a"));
		System.out.println(strName.equals("Ramchander Mokilla"));
		System.out.println(strName.charAt(4));
		System.out.println(strName.concat(" Reddy"));
		System.out.println(strName.toUpperCase());
		
		strName = strName.toUpperCase();
		
		String strReverse="";
		
		for(int i = strName.length()-1; i>=0; i--)
		{
			strReverse += strName.charAt(i);
		}

		System.out.println(strReverse+"\n");
		
		//Strings are immutable
		String str1 = new String("Hyderabad");
		String str2 = "Hyderabad";
		
		str1.toUpperCase();
		System.out.println(str1); //Prints 'Hyderabad'. Because a new string is created for the above call
		System.out.println(str1.toUpperCase()); //Prints 'HYDERABAD'
		String str3 = str1.toUpperCase();
		System.out.println(str3); //Prints 'HYDERABAD'
		str1 = str1.toUpperCase();
		System.out.println(str1); //Prints 'HYDERABAD'
		System.out.println();
		
		str2.toUpperCase();
		System.out.println(str2); //Prints 'Hyderabad'. Because a new string is created for the above call
		System.out.println(str2.toUpperCase()); //Prints 'HYDERABAD'
		String str4 = str2.toUpperCase();
		System.out.println(str4); //Prints 'HYDERABAD'
		str2 = str2.toUpperCase();
		System.out.println(str2); //Prints 'HYDERABAD'
		System.out.println();
		
		String strLongString = "My Name is Ram Mokilla";
		String[] strArray = strLongString.split(" ");
		for (String s : strArray)
		{
			System.out.println(s);
		}
		System.out.println();
		
		String strStringWithLeadingAndTrailingSpaces = "    Ram Mokilla   ";
		System.out.println(strStringWithLeadingAndTrailingSpaces);
		System.out.println(strStringWithLeadingAndTrailingSpaces.trim());
	}

}
