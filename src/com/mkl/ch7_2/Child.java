package com.mkl.ch7_2;

public class Child extends Parent{
	String schoolName;//학교 이름
	int grade;//학년
	//Parent parent;
	Soldier	soldier;
	
	public void printSchoolName() {
		System.out.println(this.schoolName);
	}
}
