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
		System.out.println("�������ַ���");
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
			System.out.println("δ�ҵ������������ַ���");
		}else {
			System.out.println("��һ��ֻ����һ�ε��ַ�Ϊ"+ch);
		}	
	}
}
