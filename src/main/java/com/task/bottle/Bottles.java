package com.task.bottle;

public class Bottles {
	int drinks = 0;
	static int count = 0;
	public int getDrinks(int bottles) {
		
		drinks = bottles/3;
		bottles = drinks + bottles%3;
		count = count+drinks;
		if(bottles==1) {
			return 1;
		}
		else if(bottles==2){
			return 1;
		}else {
			return (getDrinks(bottles));
		}
		
	}
	public static void main(String[] args) {
		Bottles b = new Bottles();
		b.getDrinks(4);
		System.out.println(count);
	}
}
