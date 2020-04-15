package com.revature.bean2;

import com.revature.bean1.Human;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Roll Tide");
		Human h= new Human();
		System.out.println(h);
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h.getName());
	}

}
