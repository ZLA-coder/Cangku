package com.task.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class getFirstChar {

	public String getString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = sc.next();
		return str;
		
	}
	@Test
	public void getChar() {
		char ch=' ';
		String str = getString();
		int length = str.length();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i = 0;i<length;i++) {
			ch = str.charAt(i);
			set.add(ch);
		}
		int i=-1;
		int j=-2;
		if(set.size()!=str.length()) {
			for (Character character : set) {
				i = str.indexOf(character);
				j =str.lastIndexOf(character);
				if(i==j) {
					ch = str.charAt(j);
					break;
				}
			}
		}else {
			ch = str.charAt(0);
		}
		if(i!=j) {
			System.out.println("未找到符合条件的字符！");
		}else {
			System.out.println("第一个只出现一次的字符为"+ch);
		}	
	}
}
