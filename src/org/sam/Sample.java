package org.sam;

public class Sample {
	public static void main(String args[])
	{
		String s = "Java";
		String s1= "Java Application";
		int length = s.length();
		System.out.println(length);
		char charAt = s.charAt(2);
		System.out.println(charAt);
		int indexOf = s.indexOf("v");
		System.out.println(indexOf);
		boolean equals = s.equals(s1);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		boolean contains = s.contains("a");
		System.out.println(contains);
		String replace = s.replace('J', 'j');
		System.out.println(replace);
		String replaceAll = s.replaceAll(s, "sun");
		System.out.println(replaceAll);
		String s2 = "  Sun   ";
		System.out.println(s2);
		String trim = s2.trim();
		System.out.println(trim);
		String substring = s1.substring(3 ,7);
		System.out.println(substring);
		int compareTo = s.compareTo(s2);
		System.out.println(compareTo);
		System.out.println("");

}
}