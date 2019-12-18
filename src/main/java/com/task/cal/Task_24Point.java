package com.task.cal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class Task_24Point {
	List<Integer> list = new ArrayList<Integer>();
	@Test
	public void getSum() {

		list = getList();
		System.out.println(list.toString());
		judge(list);
		list.get(0);
		
	}
	
	public List<Integer> getList(){
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入四个1-10的数字");
		for (int i = 0; i < 4; i++) {
			input = sc.nextInt();
			list.add(input);
		}
		sc.close();
		return list;
	}
	
	public void judge(List<Integer> list) {
		for (int i : list) {
			if(i<0||i>11) {
				System.out.println("不合法数字");
				list.clear();
			}
		}
		if(list.size()==0) {
			list = getList();
		}
	}
	
	
}
