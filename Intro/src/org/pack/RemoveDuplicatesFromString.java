package org.pack;

import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {

	String[] str= {"Interview", "Manual", "Automation", "Interview", "QA", "Manual", "Framework"};
	
	Set<String> object= new HashSet<String>();
	
	for(String str1: str)
	{
		object.add(str1);
	} 
	System.out.println(object);
}
}