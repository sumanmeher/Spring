package com.digit.springBoot.springbootdemo.bean;

public class Student {
	String name;
	String fname;
	String mname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Student(String name, String fname, String mname) {
		super();
		this.name = name;
		this.fname = fname;
		this.mname = mname;
	}

}
