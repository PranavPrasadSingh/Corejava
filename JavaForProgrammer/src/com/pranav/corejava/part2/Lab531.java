package com.pranav.corejava.part2;

class Lab531 {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.show();
		Customer c2 = new Customer();
		c2.cid = 99;
		c2.cname = "Pranav Kumar";
		c2.phone = 765467899;
		c2.show();
	}
}

class Customer {
	int cid;
	String cname;
	long phone;

	void show() {
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(phone);
	}
}
