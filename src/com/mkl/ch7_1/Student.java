package com.mkl.ch7_1;

public class Student extends People {

		String grade;//학년
		String studentNum;//힉번
		private String phone;//전화번호

	public Student(String name, String ssn) {
		super(name, ssn);//부모 생성자 호출
		// TODO Auto-generated constructor stub
	}
	@Override //annotation(명시하다). 없어도 무방
	public void printName() {
	// TODO Auto-generated method stub
		System.out.println("학생이름:"+this.name);
		super.printName();
	}
	
}
