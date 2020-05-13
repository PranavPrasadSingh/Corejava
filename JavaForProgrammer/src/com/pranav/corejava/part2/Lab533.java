package com.pranav.corejava.part2;

class Lab533 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		System.out.println(h1.a + "\t" + h2.a);
		h1.a = 99;
		System.out.println(h1.a + "\t" + h2.a);
	}
}
