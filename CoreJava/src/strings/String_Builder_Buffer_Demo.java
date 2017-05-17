package strings;

public class String_Builder_Buffer_Demo {

	public static void main(String[] args) {
		
		String strName = "Ramchander Mokilla";
		StringBuilder strBuilder = new StringBuilder("Ramchander Mokilla"); //not thread safe
		StringBuffer strBuffer = new StringBuffer("Ramchander Mokilla"); //thread safe class
		
		//cannot be used as interned. i.e, the following two statements are invalid
		//StringBuilder strBuilder1 = "Ramchander Mokilla"; 
		//StringBuffer strBuffer1 = "Ramchander Mokilla"; 
		
		System.out.println(strBuilder);
		System.out.println(strBuffer);
		
		//string buffer and string builder are mutable
		strBuilder.append(" Hello");
		strBuffer.append(" Hello");
		strName.concat("Hello");
		
		//String builder and string buffer are mutable
		System.out.println(strBuilder);
		System.out.println(strBuffer);
		
		//String is immutable
		System.out.println(strName);
	}

}
