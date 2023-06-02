package org.pack;

public class LargestCommonPrefix {

	public static void main(String[] args) {

		String[] str = { };
		if (str.length==0) {
			System.out.println("String is empty");
		}
		if (str.length>0) {
		String prefix = str[0];
		for (int i = 1; i < str.length; i++) {
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

			}
		}
		if (prefix.isEmpty()) {
			System.out.println("No Common Prefix");
		}
System.out.println(prefix);
	}
	}
}
