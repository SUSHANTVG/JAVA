package com.app.core;

public class Dept {
	private String deptName;

	public Dept(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		return "Dept [deptName=" + deptName + "]";
	}
	
}
